package inversiondedependencias;

public class PdfGenerador implements Generador {

    @Override
    public void exportar() {
        System.out.println("Exportando a PDF");
    }
}
// CLASE DE BAJO NIVEL YA QUE EJECUTAN EL CODIGO