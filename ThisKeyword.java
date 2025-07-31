class basic{
    private int age;
    private String name;
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
public class ThisKeyword{
public static void main(String[] args){
      basic obj=new basic();
      obj.setAge(23);
      obj.setName("yashaswini");
      System.out.println(obj.getAge()+":"+obj.getName());
    }
}