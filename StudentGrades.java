////////////////////////////////////////////////////////////////////////////
//
// Nathaniel McDonald
// February 21, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DESCRIPTION: This program calculates the overall percentage grade and letter grade for an object of class Student
//               and prints the result.
// 
// INPUTS:  Student Name and scores for 2 quizes worth 25% of the overall grade, a midterm worth 25% of the overall grade, and final
//          exam worth 50% of the overall grade.
//
// OUTPUTS:  Student name, score for the two quizes out of 20, midterm score out of 100, final exam score out of 100,
//           percentage grade, and letter grade.
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class StudentGrades
{
  public static void main(String[] args)
  {
    Student newStudent = new Student();
    newStudent.readInput();
    newStudent.writeOutput();
  }
}
