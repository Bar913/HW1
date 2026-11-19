public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        double seriesum = 0;

        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            seriesum += Math.pow(-1, i) / (2 * i + 1);
        }
        approxPi = 4 * seriesum;

        System.out.println(approxPi + " " + actualPi);
    }
}
