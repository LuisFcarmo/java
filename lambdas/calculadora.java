public class calculadora {
    interface integerMath {
        int operation(int a, int b);   
    }

    public int operationbinary (int a, int b, integerMath op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        calculadora myapp = new calculadora();
        integerMath addition = (a, b) -> a + b;
        integerMath subtraction = (a, b) -> a - b;

        System.out.println("40 + 2 = " +
            myapp.operationbinary(40, 2, addition));
        System.out.println("20 - 10 = " +
            myapp.operationbinary(20, 10, subtraction));    
    }
}