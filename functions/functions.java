import java.util.Scanner;

public class functions{
  public static void annouceDeveloperTeaTime (){
    System.out.println("Waiting for developer team time...");
    System.out.println("Type in a random word and press Enter to start developer team time");
    Scanner scanner = new Scanner (System.in);
    scanner.next();
    System.out.println("It's developer tea time!");
  }
  public static void main(String[] args){
    annouceDeveloperTeaTime();
    System.out.println("Write Code");
    System.out.println("Review Code");
    annouceDeveloperTeaTime();
    System.out.println("Get Promoted!");
  }
}
