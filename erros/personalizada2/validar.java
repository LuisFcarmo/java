package personalizada2;
public class validar {
    private validar (){}
    public static void usuario(aluno x) throws Stringvaziaexception, NumeroForaDoIntervaloException{
        if (x == null) {
            throw new IllegalArgumentException("o aluno está nulo");
        }
        if (x.nome == null || x.nome.trim().isEmpty()) {
            throw new Stringvaziaexception(x.nome);
        }
        if (x.nota > 10 || x.nota < 0) {
            throw new NumeroForaDoIntervaloException(x.nome);
        }
    };
}