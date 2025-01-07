package com.alura.forohub.domain.topico;

import java.time.LocalDateTime;

public record DatosSalidaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String status,
        Long idUsuario,
        Long idCurso) {
}
