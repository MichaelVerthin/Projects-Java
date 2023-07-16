package CreateTestVlad;

public class Question {
    private String questionString;
    private int[][] answerIndex;

    public Question() {
        this.questionString = "1+1";
        this.answerIndex = new int[10][2];
    }

    public Question(String Q) {
        this.questionString = Q;
        this.answerIndex = new int[10][2];
    }

    public String getQuestionText() {
        return this.questionString;
    }

    public int[][] getAnswers() {
        return this.answerIndex;
    }

    public void setQuestion(String Q) {
        this.questionString = Q;
    }

    public void addAnswer(int ans, int isRight) {
        for (int i = 0; i < answerIndex.length - 1; i++) {
            if (answerIndex[i][0] == 0 && answerIndex[i][1] == 0) {
                answerIndex[i][0] = ans;
                answerIndex[i][1] = isRight;
                break;
            }
        }
    }
}
