public class HuellaDigital extends MetodoAutenticacion {

    private String patronHuella;

    public HuellaDigital(int nivelSeguridad, String patronHuella) {
        super(nivelSeguridad);
        this.patronHuella = patronHuella;
    }

    @Override
    public boolean Autenticar(String dato) {
        return patronHuella.contains(dato);
    }

    @Override
    public String toString() {
        return "HuellaDigital{" + super.toString() +
                "Patron='" + patronHuella + "'}";
    }
}
