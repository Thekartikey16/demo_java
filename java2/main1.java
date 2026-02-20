class Student {
    Student() {
        System.out.println("student class");
    }
}
class Parent extends Student {
    Parent() {
        System.out.println("Parent class");
    }
}

public class main1 {
    public static void main(String[] args) {
        // Parent p = new Parent();

        // Student s1 = new Student(); 

        Parent p1 = new Parent();   
        // p1.show();
        // p1.display();  
    }
}