package liskow;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        hacerSonidoDelAnimal(perro);
        Gato gato = new Gato();
        hacerSonidoDelAnimal(gato);
    }

    public static void hacerSonidoDelAnimal(Animal animal) {
        animal.hacerSonido();
    }
}

/*
Principio de sustitución de Liskov

Si se tiene una clase a, que es de subtipo b, los objetos de b pueden sustituirse con los de a,
por otra clase c hija o implemente b, y al intercambiar a y c no se afectaria el comportamiento del programa.

Las clases hijas deben tener un comportamiento independiente de las clases padres
En este caso se cumple el principio, ya que las clases Perro y Gato son subclases de Animal,
y al llamar al método hacerSonidoDelAnimal con un objeto de tipo Perro o Gato,
se ejecuta el método hacerSonido de la clase Perro o Gato respectivamente, sin afectar el comportamiento del programa.

 */

