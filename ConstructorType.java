class basic{
     private int age;
    private String name;
    public basic(){
        age=19;
        name="John";
    }
    public basic(int a,String n){
        age=a;
        name=n;
    }
       public void setAge(int age){
       
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
public class ConstructorType{
    public static void main(String[] args){
       basic obj=new basic();
       basic obj2=new basic(21,"nithin");
       System.out.println(obj.getAge());
       System.out.println(obj.getName());
       System.out.println(obj2.getAge());
       System.out.println(obj2.getName());
    }
}