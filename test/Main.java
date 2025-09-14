package test;
class Test{
    private int a=10;
    String str="Hello";
    public void display(){
        System.out.println("This is display method for private variable a: "+a);
    }
}
public class Main extends Test{
   public static void main(String[] args){
      System.out.println("Hello World");
      Test obj=new Test();
      obj.display();
      System.out.println(obj.str);
   }
    
}