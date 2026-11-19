import java.util.Scanner;
public class taskOne{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int total = 0;
    for(int number = 1; number <= 10; number++){
      System.out.print("Enter score");
      int newnumber = input.nextInt();
      total += newnumber;
    }
   System.out.println(total);
  }
}
