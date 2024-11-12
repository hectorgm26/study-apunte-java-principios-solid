package abiertocerrado;

import java.util.List;

public class Admin extends Usuario {

    public Admin(Rol rol, List<Permiso> permisos) {
        super(Rol.ADMIN, List.of(Permiso.LECTURA_ESCRITURA));
    }
}
