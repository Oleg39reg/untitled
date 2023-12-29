public class Lesson_14_ClassesAndObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Олег";
        person1.age = 33;
        System.out.println("Меня зовут " + person1.name + "," + "мне " + person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 23;
        System.out.println("Меня зовут " + person2.name + ", "+ "мне "+ person2.age+ " лет");
    }

    //У класса могут быть:
    //1.Данные (Поля)
    //2.Действия, которые он может совершать(методы)

}

 class  Person {
    String name;
    int age;
}