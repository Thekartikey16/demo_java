class animal {
    String name;
    animal(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
    }
}
class dog extends animal {
    int age;
    dog(String name, int age) {
        super(name);
        this.age = age;
        this.name = name;
    }
    void show() {
        System.out.println(age);
        System.out.println(name);
    }
}
public class main2 {
    public static void main(String[] args) {
        dog d1 = new dog("sheru", 5);
        d1.show();
        animal a1 = new animal("moti");
        a1.display();
    }
}
