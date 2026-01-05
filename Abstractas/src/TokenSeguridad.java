public class TokenSeguridad extends MetodoAutenticacion {

    private String codigoToken;

    public TokenSeguridad(int nivelSeguridad, String codigoToken) {
        super(nivelSeguridad);
        this.codigoToken = codigoToken;
    }

    @Override
    public boolean Autenticar(String dato) {
        return codigoToken.equals(dato);
    }

    @Override
    public String toString() {
        return "TokenSeguridad{" + super.toString() + "}";
    }
}
