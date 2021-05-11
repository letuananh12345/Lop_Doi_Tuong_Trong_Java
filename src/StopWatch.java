public class StopWatch {
    public static void main(String[] args) {
        //Vd1
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 100000; i++) {
            System.out.println(Math.sin(i));
        }
        long end = System.currentTimeMillis();
        long t = end - start;
        System.out.println("Tổng thời gian: " + t + " millisecond");
    }
}
