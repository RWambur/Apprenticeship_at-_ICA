package de.ica.azubi.presentation;

public class FirstHuman {
    private String gender;
    private String name;
    private int age;
    private double weight;

    public static void whisper(String sentence) {
        System.out.println(sentence.toLowerCase());
    }

    public void jumble() {
        FirstHuman human = new FirstHuman();
        human.getName();
    }


    public static void createGeorge(int age, String name) {
        String gender;
        double weight;

        FirstHuman george = new FirstHuman();

        george.setName("Curious George");
        george.setGender("male");
        george.setAge(2);
        george.setWeight(2.2);

        System.out.println(george.getName());
    }

    private FirstHuman waldo(String name, int age, String gender, double weight) {
        FirstHuman waldo = waldo("waldo", 18, "male", 75);

        System.out.println(waldo.getName());

        return waldo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String secret() {
        return "Ach, wie gut, dass niemand weiß, " +
                "dass ich Rumpelstilzchen heiß!";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}


