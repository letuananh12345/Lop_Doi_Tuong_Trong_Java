import java.util.Scanner;

public class mainGPTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value a: ");
        double a = sc.nextDouble();
        System.out.println("Enter value b: ");
        double b = sc.nextDouble();
        System.out.println("Enter value c: ");
        double c = sc.nextDouble();

        GPTB2 gptb2 = new GPTB2(a,b,c);
        if (gptb2.gettinhDelta() > 0) {
            System.out.println("phương trình có 2 nghiệm: " + "x1: " + gptb2.getRoot1() + "và" + "x2: " + gptb2.getRoot2());
        } else if (gptb2.gettinhDelta() == 0) {
            System.out.println("phương trình có 1 nghiệm: " + gptb2.getRoot1());
        } else {
            System.out.println("phương trình vô nghiệm");
        }
    }
}
