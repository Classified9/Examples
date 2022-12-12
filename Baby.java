package ClassTest;

public class Baby {

    public Baby(int weight){
        weightInKg = weight;
    }

    public Baby (int babyAgeAtBirth, String babyNameAtBirth){
        age = babyAgeAtBirth;
        name= babyNameAtBirth;
    }

    public Baby(String babyNameAtBirth){
        name = babyNameAtBirth ;
    }
    private  int age;

    private int weightInKg;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weightInKg;
    }
}
