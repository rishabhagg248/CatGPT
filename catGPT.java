import java.util.Scanner;
public class CatGPT {
  public static void main(String[] args) {
    boolean run = true;
    System.out.println("------------ WELCOME TO CAT-GPT ------------\n");
    Scanner sc = new Scanner(System.in);
    while(run) {
      System.out.println("How may I help you today?\n(Enter 0 to exit)");
      String input = sc.nextLine();
      if(input.equals("0")) {
        System.out.println("meow (waving bye)\n");
        run=false;
      }
      else {
        System.out.println("meow\n\n");
      }
    }
  }

}
