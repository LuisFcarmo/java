package personalizada;
public class Stringvaziaexception extends RuntimeException{
    private String NomeDoAtributo;
    Stringvaziaexception (String nomeDoatribuito) {
        this.NomeDoAtributo = nomeDoatribuito;
    }
        public String getMessage() {
            return String.format("o atributo %s está vazio", NomeDoAtributo);
        }
    
    
}
