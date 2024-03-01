public class jogador implements Comparable <jogador> {
    public String nome;
    public int nivel;

    jogador(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }
    
    public void set (String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    @Override
    public int compareTo(jogador outrojogador) {
            return Double.compare(this.nivel, outrojogador.nivel);
    }
}
