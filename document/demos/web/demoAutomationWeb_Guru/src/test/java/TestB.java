import static java.lang.Math.pow;

public class TestB extends TestA{
  public static int convertTo10(String number){
    int sum = 0;
    for(int i = 0; i < number.length();i++){
      sum += (int) (Integer.parseInt(String.valueOf(number.charAt(i)))*pow(2,number.length()-i-1));
    }
    return sum;
  }
  public static String convertTo2(int number){
    String number2 = "";
    while (number!=0){
      number = number/2;
      number2 += number%2;
    }
    return number2;
  }
  public static void main(String[] args) {
    int a = convertTo10("110");
    int b = convertTo10("111");
    int c = a*b;
    String d = convertTo2(c);
    System.out.println(c);
    System.out.println(d);
  }
}
