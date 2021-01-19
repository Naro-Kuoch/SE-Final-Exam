import java.util.*;

public class Quiz {
    ArrayList<Question> quiz = new ArrayList<Question>();
    int qNum = 0;

    public Quiz() {

    }

    void addQuestion() {
        Scanner sc = new Scanner(System.in);
        Question q = new Question();
        System.out.print("\nEnter content of your question: ");
        q.QContent = sc.nextLine();
        qNum++;
        q.numOfQ = qNum;
        q.addAnwer();
        quiz.add(q);

    }

    public void displayQuestion() {
        // System.out.println("\nNo\tQuestion");
        for (int i = 0; i < quiz.size(); i++) {
            System.out.println("Question " + quiz.get(i).numOfQ + ": " + quiz.get(i).QContent + "\nAnswer: ");
            quiz.get(i).Display();

        }
    }

    public void deleteQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Enter question number you want to delete: ");
        int q = sc.nextInt();
        for (int i = 0; i < quiz.size(); i++) {
            if (quiz.get(i).numOfQ == q) {
                quiz.remove(i);
                return;
            }
        }
        System.out.println("The question doesn't exist !");
    }

    public void UpdateQuestion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter question number you want to update: ");
        int q = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quiz.size(); i++) {
            if (quiz.get(i).numOfQ == q) {
                System.out.println("A. Update question's content\n" + "B. Update answers of the question\n"
                        + "C. update both\nYour choice: ");
                String opt = sc.nextLine();
                if (opt.equals("A")) {
                    System.out.println("Enter new content of question: ");
                    quiz.get(i).QContent = sc.nextLine();
                } else if (opt.equals("B")) {
                    System.out.println("a. Delete answer\n" + "b. update answer content\nYour choice: ");
                    opt = sc.nextLine();

                    if (opt.equals("a")) {
                        quiz.get(i).DeleteAnswer();
                    } else if (opt.equals("b")) {
                        quiz.get(i).updateAnswer();
                    }
                }

            }
        }
    }

}
