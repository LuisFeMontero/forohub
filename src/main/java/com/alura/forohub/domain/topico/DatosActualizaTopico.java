package com.alura.forohub.domain.topico;

public record DatosActualizaTopico(
        String titulo,
        String mensaje
        //Long idAutor, no creo conveniente cambiar autor
        // Long idCurso no creo conveniente cambiar curso
) {
}
