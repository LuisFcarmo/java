package personalizada2;
public class NumeroForaDoIntervaloException extends Exception {
    private String NomeDoAtributo;
    NumeroForaDoIntervaloException (String nomeDoatribuito) {
        this.NomeDoAtributo = nomeDoatribuito;
    }
    public String getMessage() {
        return String.format("o atributo %s está fora do intervalo", NomeDoAtributo);
    }
}
