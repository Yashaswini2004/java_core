class basic{
    private int age;
    private String name;
       public void setAge(int age,basic obj){
       
        obj.age=age;
    }
    public void setName(String name,basic obj){
        obj.name=name;
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
      obj.setAge(23,obj);
      obj.setName("yashaswini",obj);
      System.out.println(obj.getAge()+":"+obj.getName());
    }
}