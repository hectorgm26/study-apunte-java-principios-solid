package segregaciondeinterfaces;

public class UsuarioServicioImpl implements CrudUsuario, SesionUsuario {

    @Override
    public Usuario obtenerUsuario(long id) {
        return null;
    }

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void eliminarUsuario(long id) {

    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void iniciarSesion(Usuario usuario) {

    }

    @Override
    public void cerrarSesion(Usuario usuario) {

    }


}

// UNA SOLA INTERFAZ QUE CONTIENE TODOS LOS METODOS DE USUARIO SERVICIO
// Y ESTA CLASE TENDRA QUE OBLIGATORIAMENTE IMPLEMENTAR TODOS LOS METODOS DE LA INTERFAZ
// Y PUEDE QUE LA CLASE NO NECESITE TODOS LOS METODOS, POR ESO SE DEBE SEPARAR EN INTERFACES MAS PEQUEÑAS
// POR ESO ES MEJOR DELEGAR FUNCIONALIDADES EN OTRAS INTERFACES MAS PEQUEÑAS
