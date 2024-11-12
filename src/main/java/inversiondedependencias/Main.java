package inversiondedependencias;

public class Main {
    public static void main(String[] args) {

        ReportesGenerador reporteGenerador = new ReportesGenerador(new PdfGenerador());
        ReportesGenerador reporteGenerador2 = new ReportesGenerador(new CsvGenerador());
        // esto se puede hacer con cualquier clase que implemente la interfaz Generador
        // ya que se le esta pasando la interfaz y no la clase concreta
        // por lo que se puede cambiar la clase concreta sin tener que cambiar la clase de alto nivel
        // new ReportesGenerador(new CsvGenerador()); significa que se esta inyectando la clase CsvGenerador, que implementa la interfaz Generador


    }
}

/*
Principio de inversion de dependencias

Simplemente necesitamos que nuestras clases no dependan perse de otras clases concretas

Es decir, las clases de alto nivel no deben depender de las de bajo nivel, si no de sus abstracciones

Y las abstracciones no deben depender de detalles, sino los detalles de las abstracciones


 */
