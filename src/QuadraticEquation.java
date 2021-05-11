public class QuadraticEquation {
    private double a, b, c;

    double getA(int x) {
        return this.a = x;
    }

    double getB(int x) {
        return this.b = x;
    }

    double getC(int x) {
        return this.c = x;
    }

    double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    double getRoot1() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    double getRoot2() {
        return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    void disPlay() {
        if (a == 0 && b == 0 && c == 0) {
            System.out.println("Phương trình có vô số nghiệm!");
        } else if (getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm là " + getRoot1() + " và " + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có 1 nghiệm là " + getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        QuadraticEquation pt1 = new QuadraticEquation();
        pt1.getA(1);
        pt1.getB(2);
        pt1.getC(1);
//        pt1.getDiscriminant();
        pt1.disPlay();
    }
}
