public class ReconocimientoFacial extends MetodoAutenticacion {

    private String mapaRostro;
    private double precisionModelo;

    public ReconocimientoFacial(int nivelSeguridad, String mapaRostro, double precisionModelo) {
        super(nivelSeguridad);
        this.mapaRostro = mapaRostro;
        this.precisionModelo = precisionModelo;
    }

    @Override
    public boolean Autenticar(String dato) {
        int comunes = 0;
        int min = Math.min(mapaRostro.length(), dato.length());

        for (int i = 0; i < min; i++) {
            if (mapaRostro.charAt(i) == dato.charAt(i))
                comunes++;
        }

        double similitud = (double) comunes / min;
        return similitud >= precisionModelo;
    }

    @Override
    public String toString() {
        return "ReconocimientoFacial{" + super.toString() +
                "Precision=" + precisionModelo + "}";
    }
}
