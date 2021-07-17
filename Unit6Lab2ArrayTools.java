public class Unit6Lab2ArrayTools {
    public static char minimum(char[] array) {
        char min = Character.MAX_VALUE;
        for (char c : array) {
            if (Character.compare(c, min) < 0) {
                min = c;
            }
        }
        return min;
    }

    public static int minimum(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (Integer.compare(i, min) < 0) {
                min = i;
            }
        }
        return min;
    }

    public static double minimum(double[] array) {
        double min = Integer.MAX_VALUE;
        for (double i : array) {
            if (Double.compare(i, min) < 0) {
                min = i;
            }
        }
        return min;
    }

    public static char maximum(char[] array) {
        char min = Character.MIN_VALUE;
        for (char c : array) {
            if (Character.compare(c, min) > 0) {
                min = c;
            }
        }
        return min;
    }

    public static int maximum(int[] array) {
        int min = Integer.MIN_VALUE;
        for (int i : array) {
            if (Integer.compare(i, min) > 0) {
                min = i;
            }
        }
        return min;
    }

    public static double maximum(double[] array) {
        double min = Integer.MIN_VALUE;
        for (double i : array) {
            if (Double.compare(i, min) > 0) {
                min = i;
            }
        }
        return min;
    }

    public static int minimumAt(char[] array) {
        char min = minimum(array);
        for (int i = 0; i < array.length; i++) {
            if (Character.compare(array[i], min) == 0) {
                return i;
            }
        }
        return -1; //this code should never run
    }

    public static int minimumAt(int[] array) {
        int min = minimum(array);
        for (int i = 0; i < array.length; i++) {
            if (Integer.compare(array[i], min) == 0) {
                return i;
            }
        }
        return -1; //this code should never run
    }

    public static int minimumAt(double[] array) {
        double min = minimum(array);
        for (int i = 0; i < array.length; i++) {
            if (Double.compare(array[i], min) == 0) {
                return i;
            }
        }
        return -1; //this code should never run
    }

    public static int maximumAt(char[] array) {
        char max = maximum(array);
        for (int i = 0; i < array.length; i++) {
            if (Character.compare(array[i], max) == 0) {
                return i;
            }
        }
        return -1; //this code should never run
    }

    public static int maximumAt(int[] array) {
        int max = maximum(array);
        for (int i = 0; i < array.length; i++) {
            if (Integer.compare(array[i], max) == 0) {
                return i;
            }
        }
        return -1; //this code should never run
    }

    public static int maximumAt(double[] array) {
        double max = maximum(array);
        for (int i = 0; i < array.length; i++) {
            if (Double.compare(array[i], max) == 0) {
                return i;
            }
        }
        return -1; //this code should never run
    }

    public static double average(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return (double) total / array.length;
    }

    public static double average(double[] array) {
        double total = 0;
        for (double i : array) {
            total += i;
        }
        return total / array.length;
    }
}
