class basic{
    public basic(){
        System.out.println("Constructor called..!");
    }
    public static void show(){
          System.out.println("Show() method called..!");
    }
}
public class Ananymous{
    public static void main(String[] args){
       new basic();
       new basic().show();
    }
}