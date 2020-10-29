package Chapter1;

import edu.princeton.cs.algs4.StdDraw;

public class Ex1132 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[1]);

        double[] input = { 1, 2, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 7, 8, 8, 8, 9, 10, 10 };
        int[] frequencyVals = frequency(input, n, l, r);

        draw_histogram(frequencyVals, input);
    }

    private static boolean isElementOf(double value, double[] values) {
        for (double val : values) {
            if (value == val)
                return true;
        }
        return false;
    }

    private static boolean isFallInterval(double val, double l, double r) {
        return val >= l && val <= r;
    }

    public static void draw_histogram(int[] intervals, double[] samples) {
        // https://github.com/morrxy/algs4/blob/master/exercise/1.1.32/ex_1_1_32.java
        StdDraw.setPenRadius(.006);
        StdDraw.line(0, 0, 1, 0);
        StdDraw.line(0, 0, 0, 1);

        int total = samples.length;
        double interval_width = 1.0 / intervals.length;
        double halfWidth = interval_width / 2;
        StdDraw.setPenColor(StdDraw.GRAY);
        StdDraw.setPenRadius();

        for (int i = 0; i < intervals.length; i++) {
            double x = i * interval_width + halfWidth;
            double y = (double) intervals[i] / total / 2;
            StdDraw.rectangle(x, y, halfWidth, y);
        }
    }


    public static int[] frequency(double[] values, int n, double l, double r) {
        double[] distinct = new double[n];
        int[] frequency = new int[n];

        for (int i = 0; i < n; i++) {
            double value = values[i];
            if (isFallInterval(value, l, r) && !isElementOf(value, distinct)) {
                distinct[i] = values[i];
                for (int j = i; j < n; j++) {
                    if (value == values[j]) {
                        frequency[i]++;
                    }
                }
            } else {
                distinct[i] = 0;
                frequency[i] = 0;
            }
        }

        int[] filteredFrequency = new int[n];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (distinct[i] != 0)
                filteredFrequency[index++] = frequency[i];
        }
        return filteredFrequency;
    }


}
