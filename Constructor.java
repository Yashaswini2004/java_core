class basic{
    private int age;
    private String name;
    public basic(){
        age=19;
        name="John";
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
public class Constructor{
  public static void main(String[] args){
      basic obj=new basic();
  
      System.out.println(obj.getAge()+":"+obj.getName());
    }
}