public class Lesson_15_Methods {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setNameAndAge("Oleg", 33);
        Person1 person2 = new Person1();
        person1.speak();

        person2.setNameAndAge("Ivan", 50);
        person2.speak();
        int yaer1 = person1.carculetYears();
        int yaer2 = person2.carculetYears();
        System.out.println("До пенсии " + yaer1 + " лет");
        System.out.println("До пенсии " + yaer2 + " лет");
    }
}

class Person1 {
    private String name;
    private int age;

    void setNameAndAge(String userName, int userAge) {
        if (name.isEmpty()) {
            System.out.println("Поле не может быть пустым");
        } else {
            name = userName;
        }

        if (age <= 0) {
            System.out.println("Поле не может быть меньше либо равно 0");
        }
        age = userAge;
    }

    int carculetYears() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    void sayHello() {
        System.out.println("Hello " + name);
    }
}
