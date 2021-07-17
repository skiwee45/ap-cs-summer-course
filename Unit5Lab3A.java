public class Unit5Lab3A {
    public static void main(String[] args) {
        double[] testSet1 = {1, 2, 3};
        double[] testSet2 = {5.993, 5.992, 5.99};
        double[] testSet3 = {-10.5, 80, 80.001};
        double[][] testSets = {testSet1, testSet2, testSet3};
        for (double[] testSet : testSets) {
            double min = minimum(testSet[0], testSet[1], testSet[2]);
            double max = maximum(testSet[0], testSet[1], testSet[2]);
            System.out.printf("%nSet: %f, %f, %f\tMin: %f\tMax: %f", testSet[0], testSet[1], testSet[2], min, max);
        }
    }

    private static double minimum(double v1, double v2, double v3){
        double v1v2Min = Math.min(v1, v2);
        return Math.min(v1v2Min, v3);
    }

    private static double maximum(double v1, double v2, double v3){
        double v1v2Max = Math.max(v1, v2);
        return Math.max(v1v2Max, v3);
    }
}
