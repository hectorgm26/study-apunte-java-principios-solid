package liskow;

public class Pajaro extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Pio pio");
    }

    public void volar() throws Exception {
        System.out.println("El pajaro esta volando");
    }
    // EN ESTE CASO PARA CUMPLIR EL PRINCIPIO CON EL METODO VOLAR, SE DEBE CREAR CON PAJARO Y NO EN LA CLASE ANIMAL
    // YA QUE NO TODOS LOS ANIMALES VUELVAN, Y ASI NO SE AFECTA EL COMPORTAMIENTO DEL PROGRAMA
}
