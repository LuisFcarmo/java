@FunctionalInterface
public interface calculo {
    public abstract double executar(double a, double b);

    default Double legal (double a, double b) {
        return executar(a, b);
    }
}
