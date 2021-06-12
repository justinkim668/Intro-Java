import java.util.Scanner;
public class MultipleChoice {
  public static void main(String[] args){
    String question = "What is 3+3?";
    String answerA = "Six";
    String answerB = "Seven";
    String answerC = "Eight";

    String correctAnswer = answerA;

    System.out.println(question);

    System.out.println(answerA + " or " + answerB + " or " + answerC);
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();

    if (correctAnswer.equals(input)){
      System.out.println("Congratulations! You picked the right answer!");
    } else {
      System.out.println("Wrong Answer! The Correct answer is "+ answerA);
    }

  }
}
