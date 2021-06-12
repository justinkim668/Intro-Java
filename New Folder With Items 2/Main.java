public class Main{
  public static void main(String[] args) {
    studentProfile studentA = new studentProfile("Justin", "Kim", "Statistics", 3.6, 2021);
    studentProfile studentB = new studentProfile("Andrew", "Quijano", "Computer Science", 4.0, 2019);
    int justinLeftBack = studentA.incrementExpectedGraduationYear();

    System.out.println(justinLeftBack);
  }
}
