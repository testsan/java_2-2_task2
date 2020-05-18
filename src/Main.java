public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float height = 165.5f; // рост в сантиметрах
        float weight = 64.3f; // вес в килограммах
        float bmi = service.calculate(weight, height); // индекс массы тела
        System.out.println("BMI = " + bmi + " kg/m²");
    }
}
