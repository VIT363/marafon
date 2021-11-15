package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] dualMass = new int[12][8];
        for (int i = 0; i < dualMass.length; i++) {
            for (int j = 0; j < dualMass[i].length; j++) {
                dualMass[i][j] = random.nextInt(50);
            }
        }
        int maxSum = 0;
        int maxSumInd = 0;
        for (int i = 0; i < dualMass.length; i++) {
            int sum = 0;
            for (int j = 0; j < dualMass[i].length; j++) {
                sum += dualMass[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxSumInd = i;
            }
        }
        System.out.println(maxSumInd);
    }
}
