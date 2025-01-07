package com.alura.forohub.controller;

import com.alura.forohub.domain.topico.Topico;
import com.alura.forohub.domain.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> registrarTopico(@RequestBody @Valid Topico topico) {
        // Validar duplicados
        if (topicoRepository.findByTituloAndMensaje(topico.getTitulo(), topico.getMensaje()).isPresent()) {
            return ResponseEntity.badRequest().body("No se permiten tópicos duplicados.");
        }
        // Guardar tópico en la base de datos
        topicoRepository.save(topico);
        return ResponseEntity.ok("Tópico creado exitosamente.");
    }
    // Listar tópicos con filtros opcionales
    @GetMapping
    public ResponseEntity<Page<Topico>> listar(
            @PageableDefault(size = 10, sort = "fechaCreacion") Pageable pageable,
            @RequestParam(required = false) String curso,
            @RequestParam(required = false) Integer ano) {

        Page<Topico> topicos;

        if (curso != null) {
            topicos = topicoRepository.findByCursoNombre(curso, pageable);
        } else if (ano != null) {
            topicos = topicoRepository.findByAnoCreacion(ano, pageable);
        } else {
            topicos = topicoRepository.findAll(pageable);
        }

        return ResponseEntity.ok(topicos);
    }

    // Obtener el detalle de un tópico
    @GetMapping("/{id}")
    public ResponseEntity<Topico> detalle(@PathVariable Long id) {
        return topicoRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
