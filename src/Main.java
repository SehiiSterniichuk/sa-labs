import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Integer[] a = { 100, 10, 75, 35 };
//        paralel(a);
//        cons(a);
        var matrix = MatrixFabric.makeMyVariantMatrix();
        System.out.println(matrix);
    }

    public static void paralel(Integer[] a) {
        final String methodName = "Parallel";
        int[][] v = new int[4][4];
        float[] res = new float[4];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    v[i][j] = 0;
                }
                if (a[i] > a[j]) {
                    v[i][j] = 1;
                    v[j][i] = 0;
                }
                if (a[i] < a[j]) {
                    v[i][j] = 0;
                    v[j][i] = 1;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                res[i] += v[i][j];
            }
            res[i] = res[i] / 4;
        }
        float max = 0;

        for (int i = 0; i < 4; i++) {
            if (max < res[i]) {
                max = res[i];
                index = i;
            }
        }
        print(index, max, methodName);
    }

    public static void print(int index, double max, String methodName){
        System.out.println("The best alternative with " + methodName + " method is: A"
                + (index + 1) + ", with value of " + max);
    }

    public static void cons(Integer[] a) {
        final String methodName = "Consequent";
        Arrays.sort(a, Collections.reverseOrder());
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                for (int c = 2; c < 4; c++) {
                    if (a[i] <= a[j] + a[c] && (i < j) && (c > j)) {
                        a[i] += 10;
                    }
                }
            }
        }
        float[] b = new float[4];
        for (int i = 0; i < 4; i++) {
            b[i] = a[i];
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += b[i];
        }
        for (int i = 0; i < 4; i++) {
            b[i] /= sum;
        }
        double max = 0;
        int index = 0;
        for (int i = 0; i < 4; i++) {
            if (max < b[i]) {
                max = b[i];
                index = i;
            }
        }
        print(index, max, methodName);
    }
}