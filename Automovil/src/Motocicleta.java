public class Motocicleta extends Vehiculo {

    private String altura;
    private String arranque;

    public Motocicleta(String marca, String modelo, int anio,
                       Propietario propietario, String altura, String arranque) {
        super(marca, modelo, anio, propietario);
        this.altura = altura;
        this.arranque = arranque;
    }

    @Override
    public int matricular() {
        if (!matriculado) {
            matriculado = true;
            return 80;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "MOTOCICLETA -> " + super.toString() +
                ", Altura: " + altura +
                ", Arranque: " + arranque;
    }
}
