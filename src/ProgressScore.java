
/**
 * This class works out student's overall progress score for subjects (Maths, English and Science).
 */
public class ProgressScore {

    private int mockMathsScore, actualMathsScore;
    private int mockEnglishScore, actualEnglishScore;
    private int mockScienceScore, actualScienceScore;

    /**
     * gets student maths mock test score
     *
     * @return - returns the value that is set for the student maths mock test score
     */
    public int getMockMathsScore() {
        return mockMathsScore;
    }


    /**
     * sets the maths mock test score for a student
     *
     * @param mockMathsScore
     */
    public void setMockMathsScore(int mockMathsScore) {
        this.mockMathsScore = mockMathsScore;
    }


    /**
     * gets student maths test score
     *
     * @return - returns the value that is set for the student actual maths score
     */
    public int getActualMathsScore() {
        return actualMathsScore;
    }


    /**
     * sets the actual maths score for a student
     *
     * @param actualMathsScore
     */
    public void setActualMathsScore(int actualMathsScore) {
        this.actualMathsScore = actualMathsScore;
    }


    /**
     * gets student english mock test score
     *
     * @return - returns the value that is set for the student english mock score
     */
    public int getMockEnglishScore() {
        return mockEnglishScore;
    }


    /**
     * sets the english mock test score for a student
     *
     * @param mockEnglishScore
     */
    public void setMockEnglishScore(int mockEnglishScore) {
        this.mockEnglishScore = mockEnglishScore;
    }


    /**
     * gets student english test score
     *
     * @return - returns the value that is set for the student actual english score
     */
    public int getActualEnglishScore() {
        return actualEnglishScore;
    }


    /**
     * sets the actual english score for a student
     *
     * @param actualEnglishScore
     */
    public void setActualEnglishScore(int actualEnglishScore) {
        this.actualEnglishScore = actualEnglishScore;
    }


    /**
     * gets student science mock score
     *
     * @return - returns the value that is set for the student science mock score
     */
    public int getMockScienceScore() {
        return mockScienceScore;
    }


    /**
     * sets the science mock test score for a student
     *
     * @param mockScienceScore
     */
    public void setMockScienceScore(int mockScienceScore) {
        this.mockScienceScore = mockScienceScore;
    }


    /**
     * gets student science test score
     *
     * @return - returns the value that is set for the student actual science score
     */
    public int getActualScienceScore() {
        return actualScienceScore;
    }


    /**
     * sets the actual science score for a student
     *
     * @param actualScienceScore
     */
    public void setActualScienceScore(int actualScienceScore) {
        this.actualScienceScore = actualScienceScore;
    }


    public static void main(String[] args) {
        double MathsProgressScore, EnglishProgressScore, ScienceProgressScore;
        double totalProgressScore;

        // creates object of ProgressScore
        ProgressScore student = new ProgressScore();

        // sets mock tests and actual tests scores for maths, english and science.
        student.setMockMathsScore(99);
        student.setActualMathsScore(88);

        student.setMockEnglishScore(92);
        student.setActualEnglishScore(96);

        student.setMockScienceScore(79);
        student.setActualScienceScore(54);

        // formula for each subject progress score
        MathsProgressScore = (double) (student.getActualMathsScore() - student.getMockMathsScore()) / 10;
        EnglishProgressScore = (double) (student.getActualEnglishScore() - student.getMockEnglishScore()) / 10;
        ScienceProgressScore = (double) (student.getActualScienceScore() - student.getMockScienceScore()) / 10;

        // formula for total progress score
        totalProgressScore = (MathsProgressScore + ScienceProgressScore + EnglishProgressScore) / 3;

        // prints out a rounded 2 decimal places total progress score
        System.out.printf("Student Overall Progress Score is: %.2f", totalProgressScore);

    }
}


