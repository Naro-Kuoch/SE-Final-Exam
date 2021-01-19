import java.util.Scanner;

public class makeQuiz {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Scanner sc = new Scanner(System.in);
        boolean t = true;
        int opt;

        while (t) {
            System.out.println("\n1. Add question and answers\n" + "2. Display question with its Answer\n"
                    + "3. Delete question\n" + "4. Update question\n" +"5. Exit");
            System.out.print("Your Choice: ");
            opt = sc.nextInt();
            if (opt == 1) {
                quiz.addQuestion();
            } else if (opt == 2) {
                quiz.displayQuestion();
            } else if (opt == 3) {
                quiz.deleteQuestion();
            }else if(opt ==4){
                quiz.UpdateQuestion();
            }else if(opt ==5) t = false;
        }
    }
}
