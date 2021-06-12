public class studentProfile{
  String firstName;
  String lastName;
  String declaredMajor;
  double gpa;
  int yearGraduate;


  public studentProfile (String firstName,
                          String lastNAme,
                          String declaredMajor,
                          double gpa,
                          int yearGraduate){
    this.firstName = firstName;
    this.lastName = lastName;
    this.declaredMajor = declaredMajor;
    this.gpa = gpa;
    this.yearGraduate = yearGraduate;
                          }
  public int incrementExpectedGraduationYear(){
    return(this.yearGraduate + 1);
  }
}
