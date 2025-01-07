package com.alura.forohub.controller;

import com.alura.forohub.domain.respuesta.Respuesta;
import com.alura.forohub.domain.respuesta.RespuestaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> registrarRespuesta(@RequestBody @Valid Respuesta respuesta) {
        respuestaRepository.save(respuesta);
        return ResponseEntity.ok("Respuesta registrada exitosamente.");
    }
}
