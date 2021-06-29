import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This Progress Score test class checks if the values that are returned are accurate as expected.
 */
class ProgressScoreTest {

    @Test
    void setMockMathsScore() {
        ProgressScore ps = new ProgressScore();
        ps.setMockMathsScore(60);
        assertEquals(60, ps.getMockMathsScore());
    }

    @Test
    void setActualMathsScore() {
        ProgressScore ps = new ProgressScore();
        ps.setActualMathsScore(50);
        assertEquals(50, ps.getActualMathsScore());
    }

    @Test
    void setMockEnglishScore() {
        ProgressScore ps = new ProgressScore();
        ps.setMockEnglishScore(70);
        assertEquals(70, ps.getMockEnglishScore());
    }

    @Test
    void setActualEnglishScore() {
        ProgressScore ps = new ProgressScore();
        ps.setActualEnglishScore(45);
        assertEquals(45, ps.getActualEnglishScore());
    }

    @Test
    void setMockScienceScore() {
        ProgressScore ps = new ProgressScore();
        ps.setMockScienceScore(76);
        assertEquals(76, ps.getMockScienceScore());
    }

    @Test
    void setActualScienceScore() {
        ProgressScore ps = new ProgressScore();
        ps.setActualScienceScore(50);
        assertEquals(50, ps.getActualScienceScore());

    }

    @Test
    void main() {
        ProgressScore student = new ProgressScore();
        student.setMockMathsScore(58);
        student.setActualMathsScore(86);
        assertEquals(2.8, (double) (student.getActualMathsScore() - student.getMockMathsScore()) / 10);

        student.setMockEnglishScore(78);
        student.setActualEnglishScore(63);
        assertEquals(-1.5, (double) (student.getActualEnglishScore() - student.getMockEnglishScore()) / 10);

        student.setMockScienceScore(89);
        student.setActualScienceScore(89);
        assertEquals(0, (double) (student.getActualScienceScore() - student.getMockScienceScore()) / 10);

    }
}