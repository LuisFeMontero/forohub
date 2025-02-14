package com.alura.forohub.domain.usuario;

import com.alura.forohub.domain.perfil.DatosSalidaPerfil;

import java.util.List;

public record DatosSalidaUsuario(Long id, String nombre, List<DatosSalidaPerfil> perfiles) {

}
