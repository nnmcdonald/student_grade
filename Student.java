import java.util.Scanner;

public class Student  
{
  Scanner keyboard = new Scanner(System.in);
  private String name;
  private int quiz1;
  private int quiz2;
  private int midterm;
  private int finalExam;
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //
  // Name:           set
  // Description:    These methods set the values for the private variables name, quiz1, quiz2, midterm, and finalExam.
  //
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void setName(String newName)
  {
    name = newName;
  }
  public void setQuizOne(int newQuiz1)
  {
    quiz1 = newQuiz1;
    if (quiz1 < 0 || quiz1 > 10)
      System.out.println("Error please enter a score between 0 and 10.");
    else;
  }
  public void setQuizTwo(int newQuiz2)
  {
    quiz2 = newQuiz2;
    if (quiz2 < 0 || quiz2 > 10)
      System.out.println("Error please enter a score between 0 and 10.");
    else;
  }
  public void setMidterm(int midtermScore)
  {
    midterm = midtermScore;
    if (midterm < 0 || midterm > 100)
      System.out.println("Error, please enter a score between 0 and 100.");
    else;
  }
  public void setFinalExam(int finalExamScore)
  {
    finalExam = finalExamScore;
     if (finalExam < 0 || finalExam > 100)
      System.out.println("Error, please enter a score between 0 and 100.");
    else;
  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //
  // Name:        get
  // Description: These methods return the values for name, quiz1, quiz2, midterm, and finalExam.
  //
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public String getName()
  {
    return name;
  }
  
  public int getQuiz1()
  {
    return quiz1;
  }
  
  public int getQuiz2()
  {
    return quiz2;
  }
  
  public int getMidterm()
  {
    return midterm;
  }
  
  public int getFinalExam()
  {
    return finalExam;
  }
  
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //
  // Name:            readInput
  // Description:     This method prompts the user to enter a student's name and scores for quiz 1, quiz 2, midterm 
  //                  and final exam.
  // Inputs:          A string representing the student name and int values representing scores for quiz 1, quiz 2, 
  //                  midterm and final exam.  
  // Preconditons:    quiz1 and quiz2 must each be >=0 and <11, midterm and finalExam must each be >=0 and <11
  //
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public void readInput()
  {
    System.out.println("Please enter the student's name.");
    String studentName = keyboard.nextLine();
    setName(studentName);
    
    do
    {
    System.out.println("Quiz one score:");
    int quizOne = keyboard.nextInt();
    setQuizOne(quizOne);
    }
    while (quiz1 < 0 || quiz1 > 10);
    
    do
    {
    System.out.println("Quiz two score:");
    int quizTwo = keyboard.nextInt();
    setQuizTwo(quizTwo);
    }
    while (quiz2 < 0 || quiz2 > 10);
    
    do
    {
    System.out.println("Midterm Score:");
    int newMidterm = keyboard.nextInt();
    setMidterm(newMidterm);
    }
    while (midterm < 0 || midterm > 100);
    
    do
    {
    System.out.println("Final Exam Score:");
    int newFinalExam = keyboard.nextInt();
    setFinalExam(newFinalExam);
    }
    while (finalExam < 0 || finalExam > 100);
  }
  
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  //
  // Name:           overallGrade
  // Description:    Calculates the student's overall grade as a percentage.
  // Inputs:         finalExam, midterm, quiz1, quiz2
  // Returned Value: A double representing the student's percentage grade.
  // 
  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  private double overallGrade()
  {
    double overallGrade = ((0.5*finalExam)/100 + (0.25*midterm)/100 + (quiz1 + quiz2)*(0.25)/20)*100;
    return Math.round(overallGrade);
  }
  
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////
  // 
  // Name:           letterGrade
  // Description:    Determines the student's letter grade based on the percentage grade.
  // Inputs:         overallGrade()
  // Returned Value: A char representing the student's letter grade.
  // Preconditions:  overallGrade() must be >= 0 and <= 100.
  // 
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public char letterGrade()
  {
    char letterGrade;
    if (overallGrade() >= 90.0)
      letterGrade = 'A';
    else if (80.0 <= overallGrade() && overallGrade() < 90.0)
      letterGrade = 'B';
    else if (70.0 <= overallGrade() && overallGrade() < 80.0)
      letterGrade = 'C';
    else if (60.0 <= overallGrade() && overallGrade() < 70.0)
      letterGrade = 'D';
    else
      letterGrade = 'F';
  return letterGrade;
  } 
  public void writeOutput()
  {
    System.out.println("Name: " + getName() + "\n"
                       + "Quiz total:    " + (getQuiz1() + getQuiz2()) + "/20" + "\n"
                       + "Midterm:       " + getMidterm() + "/100 \n"
                       + "Final Exam:    " + getFinalExam() + "/100" + "\n"
                       + "Overall Grade: " + overallGrade() + "%" + "\n"
                       + "Letter Grade:  " + letterGrade());  

  }
}