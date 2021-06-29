
/**
 * This class works out student's overall Average test score for subjects (Maths, English and Science).
 */
public class AverageTestScore {

    private int maths;
    private int english;
    private int science;

    /**
     * this constructs specific subjects for the test scores
     *
     * @param maths
     * @param english
     * @param science
     */
    public AverageTestScore(int maths, int english, int science) {
        this.maths = maths;
        this.english = english;
        this.science = science;
    }

    /**
     * main method calculates the total average test score for the three subjects, which are specified in the constructor
     *
     * @param args
     */
    public static void main(String[] args) {

        // Following statement creates an object student
        AverageTestScore student = new AverageTestScore(88, 96, 54);

        // calculates average of the three subjects
        float average = (float) (student.maths + student.english + student.science) / 3;

        // prints out a rounded 2 decimal places test score
        System.out.printf("Student Average Test Score is: %.2f", average);

    }
}
