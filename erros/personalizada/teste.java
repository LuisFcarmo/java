package personalizada;

public class teste {
    public static void main(String[] args) {
        //tipos de exceções especiais
        aluno aluno = new aluno("", -1);
        try {
            validar.usuario(aluno);
        } catch(Stringvaziaexception e)  {
            System.out.println(e.getMessage());
        } catch (NumeroForaDoIntervaloException x){
            System.out.println(x.getMessage());
        }

        aluno aluno2 = new aluno("        ", -1);
        try {
            validar.usuario(aluno2);
        } catch(Stringvaziaexception e) {
            System.out.println(e.getMessage());
        }
        //aui apresenta uma maneira mais generica de tratar axcções
        aluno aluno3 = new aluno("     lucas", -11);
        try {
            validar.usuario(aluno3);
        } catch(NumeroForaDoIntervaloException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
