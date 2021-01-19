import java.util.*;

public class Question {
    int numOfQ;
    String QContent;
    ArrayList<Answer> answers = new ArrayList<Answer>();

    public Question() {

    }

    public void addAnwer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Answers: ");
        int n = Integer.parseInt(sc.nextLine());
        if(n>=2 && n<=4){
            for (int i = 0; i < n; i++) {

                System.out.print("Enter answer " + (i + 1) + ": ");
                String ans = sc.nextLine();
                Answer a = new Answer(i + 1, ans);
                answers.add(a);
            }
        }else{
            System.out.println("Minimum number of Answer is 2 and Maximum number of Answer is 4");
        }



    }

    public void Display() {
        System.out.println("No\tAnswer");
        for (int i = 0; i < answers.size(); i++) {
            System.out.printf("%d\t %s \n", answers.get(i).numOfAns, answers.get(i).AnsContent);
        }
    }

    public void DeleteAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter answer number you want to delete: ");
        int num = sc.nextInt();
        for (int i=0; i < answers.size(); i++) {
            if (answers.get(i).numOfAns == num) {
                answers.remove(i);
            }
        }
        System.out.println("This question is not found !");

    }
    public void updateAnswer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter answer number you want to update: ");
        int num = sc.nextInt();
        for (int i=0; i < answers.size(); i++) {
            if (answers.get(i).numOfAns == num) {
                System.out.println("Enter new content of answer: ");
                answers.get(i).AnsContent=sc.nextLine();
            }
        }
        System.out.println("This question is not found !");

    }

    public static void main(String[] args) {
        Question q = new Question();
        q.addAnwer();
        q.Display();
        q.DeleteAnswer();
        q.Display();
    }
}

class Answer {
    int numOfAns;
    String AnsContent;

    public Answer(int num, String cont) {
        this.numOfAns = num;
        this.AnsContent = cont;
    }

    public Answer(String ans) {
        this.AnsContent = ans;
    }
}