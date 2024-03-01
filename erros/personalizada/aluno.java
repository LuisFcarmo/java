package personalizada;
public class aluno {
    public final String nome;
    public final double nota;
    public aluno (String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nome " + this.nome;
    }
}