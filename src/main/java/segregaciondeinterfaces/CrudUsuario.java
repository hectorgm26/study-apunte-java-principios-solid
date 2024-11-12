package segregaciondeinterfaces;

public interface CrudUsuario {

    Usuario obtenerUsuario(long id);
    // lo que devuelve         // lo que se le pasa

    Usuario crearUsuario(Usuario usuario);

    void eliminarUsuario(long id);

    Usuario actualizarUsuario(Usuario usuario);
    
}
