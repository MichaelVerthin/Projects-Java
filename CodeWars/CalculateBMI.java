package CodeWars;

public class CalculateBMI {
    public static String bmi(double weight, double height) {
        Double calc = weight / Math.pow(height, 2);
        String msg = "Underweight";
        if (calc > 18.5) {
            msg = "Normal";
            if (calc > 25.0) {
                msg = "Overweight";
                if (calc > 30)
                    msg = "Obese";
            }
        }
        return msg;
    }

    public static void main(String[] args) {
        System.out.println(bmi(80, 1.80));
    }
}
