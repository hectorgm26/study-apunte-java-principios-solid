package abiertocerrado;

import java.util.Collections;
import java.util.List;

public class Anonimo extends Usuario {

    public Anonimo(Rol rol, List<Permiso> permisos) {
        super(Rol.ANONIMO, Collections.emptyList()); //por no tener ningun permiso
    }
}
