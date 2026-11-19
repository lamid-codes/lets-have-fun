import java.util.Scanner;
public class taskThree{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int total = 0;
    for(int number = 1; number <= 10; number++){
      System.out.print("Enter score");
      int newnumber = input.nextInt();
      total += newnumber;
      average = total / 10;
    }
   System.out.println(average);
   System.out.println(total)
  }
}
