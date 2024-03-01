package personalizada;
public class NumeroForaDoIntervaloException extends RuntimeException {
    private String NomeDoAtributo;
    NumeroForaDoIntervaloException (String nomeDoatribuito) {
        this.NomeDoAtributo = nomeDoatribuito;
    }
    public String getMessage() {
        return String.format("o atributo %s está fora do intervalo", NomeDoAtributo);
    }
}
