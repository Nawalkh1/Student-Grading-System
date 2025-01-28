/*Student Grading System
Build an application to calculate and display grades for students.
 Input student names, scores for different subjects,
  and calculate the average and grade (A, B, C, etc.) based on predefined criteria*/

package StudentGradingSystem;


public class Student
{
    String studName;
    int [] scores;


    public void displayGrades(double average)
    {
       if (average >= 85)
        {
            System.out.println("The Grade  of the Student is : A");
        }
       else if ( average >=75 )
       {
           System.out.println("The Grade of student is : B ");
       }
       else if (average >=65 )
       {
           System.out.println("The Grade of the Student is : C");
       }
       else if (average >=55 )
       {
           System.out.println("The Grade of the Student is : D");
       }
       else {
           System.out.println("The Grade of the Student is : F");
       }


    }

    public double calculateAverage()
    {
        int sum=0;
        for (int i = 0; i<scores.length; i++)
        {
            sum += scores[i];
        }

        return (double) sum / scores.length;
    }



}
