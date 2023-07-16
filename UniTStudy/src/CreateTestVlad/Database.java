package CreateTestVlad;

import java.util.Scanner; // Import the Scanner class

public class Database {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); // Clear command
        Database db = new Database();
        db.addQuestion("1+1");
        db.addAnswer("2", 1, 0);
        db.addQuestion("What is my name?");
        db.addAnswer("michael", 1, 1);
        db.addAnswer("11", 0, 0);
        db.addAnswer("3", 0, 0);
    }

    private Question[] Questions;
    private Answers[] Answers;

    public Database() {
        this.Questions = new Question[20];
        this.Answers = new Answers[20];// [Integer.MAX_VALUE / 10];
        // this.Answers[0] = "There is no answer";
    }

    public void displayQuestion() {
        for (int i = 0; i < this.Questions.length - 1; i++) {
            if (this.Questions[i] != null) {
                System.out.println(i + ". The question is " + this.Questions[i].getQuestionText() + "\n   Answers:");
                for (int j = 0; j < 10; j++) {
                    if (this.Questions[i].getAnswers()[j][0] != 0 || this.Questions[i].getAnswers()[j][1] != 0) {
                        System.out.print(
                                "\t" + j + ". " + this.Answers[this.Questions[i].getAnswers()[j][0]].getAnswerText());
                        if (this.Questions[i].getAnswers()[j][1] == 1) {
                            System.out.print(" - Correct answer");
                        }

                        System.out.println();
                    } else
                        break;
                }
            } else
                break;
        }
    }

    // Add new answer to existing Question
    // Todo - Need to check case where the question already exists in the database
    /** */
    public void addAnswer(String A, int isRight, int Q) {
        Answers newAns = new Answers(A, Q, isRight);
        for (int i = 0; i < this.Answers.length - 1; i++)
            if (Answers[i] == null) {
                this.Answers[i] = newAns;// Add to database answer pool
                this.Questions[Q].addAnswer(i, isRight);// Add to the question's database pool
                break;
            }

    }

    // Add new question
    public void addQuestion(String Q) {
        Question newQuestion = new Question(Q);
        for (int i = 0; i <= this.Questions.length - 1; i++)
            if (this.Questions[i] == null) {
                this.Questions[i] = newQuestion;
                break;
            }
    }

    // public void updateQuestion(int index, String newQ) {
    // Answers[index] = newQ;
    // }

    public void updateAnswer(int index, String newA) {
        Questions[index].setQuestion(newA);
    }

    // public void deleteAnswer(int index){

    // }

    // public void deleteQuestion(int index){

    // }
}
