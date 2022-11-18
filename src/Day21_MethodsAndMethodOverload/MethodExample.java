package Day21_MethodsAndMethodOverload;

public class MethodExample {
    public static void main(String[] args) {
        double average = calculateAverage(13,14);
        System.out.println("Grade: "+ average+", "+analyseAverage(average));

        if (analyseAverage(average)=="your grade is low, you need to study harder"){
            System.out.println("SUCCESS");
        }
        //Assertion = your grade is low, you need to study harder
    }
    //calculateAverage
    // 2 input
    // mid-term, final

    private static double calculateAverage(double midTermExam, double finalExam){
        double average = ((midTermExam+finalExam)/2);
        return average;
    }

    //analyseAverage
    // 0-49.99 your grade is low, you need to study harder
    // 50-74.99 your grade is not bad, but you can study more
    //75-100 your grade us perfect, and keep studying

    private static String analyseAverage(double average){
        String category = "";
        boolean name = true;

        if (average<=49.99 && average>=0){
            category = "your grade is low, you need to study harder";
        }else if (average<=74.99 && average>=50) {
            category ="50-74.99 your grade is not bad, but you can study more";
        }else if (average<=100 && average>=75){
            category = "75-100 your grade us perfect, and keep studying";
        }
        return category;
    }
}
