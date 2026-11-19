import java.util.Scanner;
public class taskFour{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sum = 0;
    for(int number = 1; number <= 10; number++){
      System.out.print("Enter score");
      int newnumber = input.nextInt();
      if (newnumber % 2 == 0){
        sum += newnumber;
      }
    }
   System.out.println(sum);
  }
}
