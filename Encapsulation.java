class basics{
    private int age=15;
    private String name="yashaswini";
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class Encapsulation{
    public static void main(String[] args){
      basics obj=new basics();
      System.out.println(obj.getAge()+":"+obj.getName());
    }
}