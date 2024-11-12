package abiertocerrado;

import java.util.List;

public class PermisoServicio {

    private final UsuarioServicio usuarioServicio;

    public PermisoServicio(UsuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }

    public List<Permiso> obtenerPermiso(long usuarioId) {
        final Usuario usuario = usuarioServicio.obtenerUsuario(usuarioId);
        return usuario.getPermisos();
        /*switch (usuario.getRol()) {
            case ANONIMO -> {
                return Collections.emptyList();
            }
            case MODERADOR -> {
                return List.of(Permiso.LECTURA, Permiso.ESCRITURA);
            }
            case ADMIN -> {
                return List.of(Permiso.LECTURA_ESCRITURA);
            }
        }
          return Collections.emptyList();
        */
    }

    public void eliminarPermisos(long usuarioID, Permiso permiso) {
        System.out.println("Permiso eliminado");
    }
}

/*
EL PRINCIPIO SE MANIFIESTA EN LOS CASOS QUE SE DEBE CREAR UN ROL ADICIONAL
YA QUE LA CLASE DEBE ESTAR ABIERTA A EXTENSIÓN Y CERRADA A MODIFICACIÓN
Y EN ESTE CASO, TENDRIAMOS QUE HACER OTRO CASE CON EL NUEVO ROL, MODIFICANDO LA LOGICA DE NEGOCIO
POR LO QUE LO MEJOR ES CAMBIAR LA FORMA DE OBTENER LOS PERMISOS



 */