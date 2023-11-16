public class tasksheet_1_1_8 {

    public static void main(String [] a) {
        int[] values = {4, 5, 10};
        calCumSum(values);
    }

    public static void calCumSum(int... numbers) {
        int cumSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            cumSum += numbers[i];

            System.out.printf('\n' + "Parameters %d: %d = ", i + 1, cumSum);

            for (int j = 1; j <= numbers[i]; j++) {
                System.out.print(j);
                if (j < numbers[i]) {
                    System.out.print("+");
                }
            }

        }
    }
}