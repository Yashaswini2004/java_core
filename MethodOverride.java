class A{
    public void show(){
          System.out.println("In A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("In B show");
    }
}

public class MethodOverride{
    public static void main(String[] args){
         B obj=new B();
         obj.show();
    }
}