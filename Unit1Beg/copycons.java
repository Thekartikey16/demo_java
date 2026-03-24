class Studento{
    int r;
    String name;
    Studento(int r , String name ){
        this.r = r ;
        this .name = name;
    }
    Studento(Studento S1){
        this.name = S1.name;
        this .name = S1.name;
    }
    void display(){
        System.out.println(r+ " and " +name);
    }   
}
public class copycons {
    public static void main(String[] args) {
        Studento S1 = new Studento(2 , "Kartikey");
        S1.display();
        Studento S2 = new Studento(3 , " aditya");
        S2.display();
    }
    
}
