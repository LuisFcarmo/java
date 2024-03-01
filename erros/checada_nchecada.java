
public class checada_nchecada {
    public static void main(String[] args) {
        //está primeira não precisa ser tratada    
        geraErro1();
    
        try {
            geraErro2();
        } catch (Exception error) {
            System.out.println("fim :");
        }
    }

    //Excpetion não checada ou não verificada está aqui vc pode ou não tratala
    static void geraErro1() throws RuntimeException{
        throw new RuntimeException("ocorreu um erro aqui amigo");
    }
    //Excption checada está daqui vc tem obrição de tratala
    //exception não pode ser lançada pois ele n é um erro tratado
    static void geraErro2 () throws Exception {
        //esse throws Exceptioné porque estou lançando um erro checado
        //então obrigatoriamente eu tenho que tratar ela
        throw new Exception("Ocorreu um erro bem maneiro 2");
    }
}
