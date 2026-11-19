import java.util.Scanner;
public class taskFive{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int total = 0;
    for(int number = 1; number <= 10; number++){
      System.out.print("Enter score");
      int newnumber = input.nextInt();
      if (newnumber % 2 == 0){
        total += newnumber
      }
    }
   System.out.println(average);
  }
}
