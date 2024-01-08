public class Lesson_20 {
    public static void main(String[] args) {
        Human1.desctriction = "Nice";
        Human1.getDestriction();
        Human1 h1 = new Human1("Bob", 34);
    }
}

class Human1 {

    private String name;
    private int age;
    public static String desctriction;

    public Human1(String name, int age) {
        System.out.println("Привет из третьего коструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void getDestriction() {
        System.out.println(desctriction);
    }
}
