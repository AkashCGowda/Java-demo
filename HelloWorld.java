public class HelloWorld
{
  public static void m1(int... x)
  {
    int total=0;
    for (int i:x){
      total= total +i;
    }
    System.out.println("sum is :" +total);

  }
  public static void main(String[] args)
  {
    m1();
    m1(10);
    m1(45,45,60);

  }
}