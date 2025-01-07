package com.alura.forohub.controller;

import com.alura.forohub.domain.perfil.Perfil;
import com.alura.forohub.domain.perfil.PerfilRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/perfiles")
public class PerfilController {

    @Autowired
    private PerfilRepository perfilRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> registrarPerfil(@RequestBody @Valid Perfil perfil) {
        if (perfilRepository.findByNombre(perfil.getNombre()).isPresent()) {
            return ResponseEntity.badRequest().body("El perfil ya está registrado.");
        }
        perfilRepository.save(perfil);
        return ResponseEntity.ok("Perfil registrado exitosamente.");
    }
}
