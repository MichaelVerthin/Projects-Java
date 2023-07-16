package CreateTestVlad;

public class Answers {
    private String AnswerText;
    private int[] fitQuestion = new int[2];

    /**
     * 
     * @param txt
     * @param question
     * @param isRight
     */
    public Answers(String txt, int question, int isRight) {
        this.AnswerText = txt;
        this.fitQuestion[0] = question;
        this.fitQuestion[1] = isRight;
    }

    /**
     * @return String
     */
    public String getAnswerText() {
        return this.AnswerText;
    }

    /**
     * @return int[]
     */
    public int[] getfitQuestions() {
        return this.fitQuestion;
    }
}
