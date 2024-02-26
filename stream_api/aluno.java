public class aluno {
    final String nome;
    final double nota;
    public aluno (String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "nome " + this.nome;
    }
}
