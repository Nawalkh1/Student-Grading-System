package StudentGradingSystem;


import java.util.Scanner;

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Student st = new Student();


        System.out.println("Please enter the name of the student:");
        st.studName = sc.nextLine();
        System.out.println("The name of the student is: " + st.studName);


        System.out.println("Enter the number of subjects:");
        int numSubjects = sc.nextInt();


        st.scores = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter the score for subject " + (i + 1) + ":");
            st.scores[i] = sc.nextInt();
        }


        double average = st.calculateAverage();
        System.out.println("The average score is: " + average);


        st.displayGrades(average);

        sc.close();
    }
}
