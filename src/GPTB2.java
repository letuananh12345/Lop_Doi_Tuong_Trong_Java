public class GPTB2 {
    double a, b, c;

    public GPTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double gettinhDelta() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
            return (-b + Math.pow(gettinhDelta(), 0.5)) / (2 * a);

    }

    public double getRoot2() {
        return (-b + Math.pow(gettinhDelta(), 0.5)) / (2 * a);
    }

}
