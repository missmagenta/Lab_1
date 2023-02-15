public class Lab1 {
    public static void main(String[] args) {
        int m = 0;
        for (int i = 3; i <= 21; i++) {
            if (i % 2 == 1) m++;
        }
        long[] a = new long[m];
        for (int i = 3, c = 0; i <= 21; i++) {
            if (i % 2 == 1) {
                a[c] = i;
                c++;
            }
        }
        float[] x = new float[12];
        for (int i = 0; i < x.length; i++) {
            x[i] = (float) (Math.random() * 8 - 2);
        }
        double[][] b = new double[10][12];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (a[i] == 17)
                    b[i][j] = Math.pow(((Math.sin(Math.sin(x[j]))) * (Math.asin(Math.exp(-Math.abs(x[j]))) - 1)), Math.exp(Math.log(Math.abs(x[j]))));
                else if (a[i] == 3 || a[i] == 13 || a[i] == 15 || a[i] == 19 || a[i] == 21)
                    b[i][j] = Math.pow(((1. / 3.) / (Math.sin(Math.pow((2. / 3.) / (x[j] - 1), x[j])) - (2. / 3.))), Math.pow((Math.pow(x[j] / 4, 2)), 2));
                else b[i][j] = Math.asin(Math.pow(Math.exp(Math.pow(Math.cbrt(-Math.tan(x[j])), 2)), 2));
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.3f", b[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}