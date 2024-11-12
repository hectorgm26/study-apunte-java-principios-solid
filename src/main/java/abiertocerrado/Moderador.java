package abiertocerrado;

import java.util.List;

public class Moderador extends Usuario {

    public Moderador(Rol rol, List<Permiso> permisos) {
        super(Rol.MODERADOR, List.of(Permiso.LECTURA, Permiso.ESCRITURA));
    }
}
