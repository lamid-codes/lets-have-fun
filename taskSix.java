import java.util.Scanner;
public class taskSix{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int count = 0;
    int sum = 0;
    for(int number = 1; number <= 10; number++){
      System.out.print("Enter score");
      int newnumber = input.nextInt();
      if (newnumber % 2 == 0){
        count += 1;
        sum += newnumber;
        
      }
      
    }
    int average = sum / count;
   System.out.println(sum);
   System.out.println(average);
  }
}
