public class Lesson_15_Methods {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.name = "Oleg";
        person1.age = 33;
        person1.speak();
        Person1 person2 = new Person1();
        person2.name = "Ivan";
        person2.age = 32;
        person2.speak();
    }
}
class Person1 {
    String name;
    int age;

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }
}
