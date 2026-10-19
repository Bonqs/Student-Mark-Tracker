public class Main {
    private static final int MIN_GRADE_A = 9;
    private static final int MIN_GRADE_B = 8;
    private static final int MIN_GRADE_C = 7;
    private static final int MIN_GRADE_D = 6;
    private static final int MIN_GRADE_E = 5;

    public static void main(String[] args) {
        int[][] marks = {{10, 5, 5}, {7, 4, 6, 2}, {10, 10, 10}, {10, 8, 6}};
        for (int i = 0; i < marks.length; i++) {
            double averageMark = calculateAverage(marks[i]);
            String grade = classifyAverage(averageMark);
            System.out.println("Student " + (i + 1) +  ": grade= " + grade);
        }
    }
    public static double calculateAverage(int[] m) {
        double sum = 0;
        for (int mark : m) {
            sum += mark;
        }
        return sum/m.length;
    }
    public static String classifyAverage(double average) {
        if (average>=MIN_GRADE_A){
            return "A";
        } else if (average>=MIN_GRADE_B) {
            return "B";
        } else if (average>=MIN_GRADE_C) {
            return "C";
        } else if (average>=MIN_GRADE_D) {
            return "D";
        } else if (average>=MIN_GRADE_E) {
            return "E";
        } return "F";
    }

}