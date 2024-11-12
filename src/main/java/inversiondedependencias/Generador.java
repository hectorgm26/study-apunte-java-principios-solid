package inversiondedependencias;

public interface Generador {

    void exportar();
}


/*
La interfaz Generador es una abstraccion que contiene el metodo exportar
y permitira que las clases que la implementen puedan ejecutar el metodo exportar

y por tanto, si se quiere un nuevo generador, solo se necesita crear una nueva clase que implemente la interfaz Generador
y llamarla en el main, sin tener que modificar la clase de alto nivel


 */
