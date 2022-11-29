public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NutritionFacts cocacola = new NutritionFacts.Builder(240, 8).calories(320).build();
        System.out.println("===============================================");
        System.out.println(cocacola);
        System.out.println("===============================================");

    }
}