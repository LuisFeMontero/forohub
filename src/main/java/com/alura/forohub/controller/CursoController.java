package com.alura.forohub.controller;

import com.alura.forohub.domain.curso.Curso;
import com.alura.forohub.domain.curso.CursoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> registrarCurso(@RequestBody @Valid Curso curso) {
        if (cursoRepository.findByNombre(curso.getNombre()).isPresent()) {
            return ResponseEntity.badRequest().body("El curso ya está registrado.");
        }
        cursoRepository.save(curso);
        return ResponseEntity.ok("Curso registrado exitosamente.");
    }
}
