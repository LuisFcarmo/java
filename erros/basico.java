class basico {
    public static void main(String[] args) {
        try {
            System.out.println(7/0);
        } catch (ArithmeticException excecao) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario\n");
            excecao.printStackTrace();
        }
    }
}