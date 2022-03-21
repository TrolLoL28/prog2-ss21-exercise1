/*
Ersteller: Lorenzo Haidinger
Repolink: https://github.com/TrolLoL28/prog2-ss21-exercise1
 */





import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Result_Test {
    @BeforeAll
    static void init() {

    }

    @BeforeEach
    void setUp() {

    }



    @Test
    @DisplayName("Autograding_1")
    void checkAutograding() {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(64);
        grades.add(23);
        grades.add(10);

        List<Integer> actual = Result.gradingStudents(grades);

        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(75);
        expected.add(65);
        expected.add(23);
        expected.add(10);

        assertEquals(expected, actual);

    }



    @Test
    @DisplayName("Students_1")
    void checkStudents_below_0() {
        assertFalse(Result.checkStudents(-1));
    }

    @Test
    @DisplayName("Students_2")
    void checkStudents_in_Range() {
        assertTrue(Result.checkStudents(45));
    }

    @Test
    @DisplayName("Students_3")
    void checkStudents_over_60() {
        assertFalse(Result.checkStudents(66));
    }



    @Test
    @DisplayName("Grades_1")
    void checkGrades_below_0() {
        assertFalse(Result.checkGrade(-1));
    }

    @Test
    @DisplayName("Grades_2")
    void checkGrades_in_Range() {
        assertTrue(Result.checkGrade(50));
    }

    @Test
    @DisplayName("Grades_3")
    void checkGrades_over_100() {
        assertFalse(Result.checkGrade(101));
    }



    @Test
    @DisplayName("Rounding_1")
    void checkRounding_below_38() {
        assertFalse(Result.checkRounding(37));
    }

    @Test
    @DisplayName("Rounding_2")
    void checkRounding_4_rest() {
        assertTrue(Result.checkRounding(84));
    }

    @Test
    @DisplayName("Rounding_3")
    void checkRounding_3_rest() {
        assertTrue(Result.checkRounding(83));
    }

    @Test
    @DisplayName("Rounding_4")
    void checkRounding_below_3_rest() {
        assertFalse(Result.checkRounding(82));
    }



    @Test
    @DisplayName("StudentTotal_equals_GradesTotal_1")
    void checkStudents_equals_Grades() {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(64);
        grades.add(23);
        grades.add(10);
        assertTrue(Result.checkingStudentsEqualsGrades(grades));
    }

    @Test
    @DisplayName("StudentTotal_equals_GradesTotal_2")
    void checkStudents_less_than_Grades() {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(64);
        grades.add(23);
        assertFalse(Result.checkingStudentsEqualsGrades(grades));
    }

    @Test
    @DisplayName("StudentTotal_equals_GradesTotal_3")
    void checkStudents_more_than_Grades() {
        List<Integer> grades = new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(64);
        grades.add(23);
        grades.add(10);
        grades.add(66);
        assertFalse(Result.checkingStudentsEqualsGrades(grades));
    }




}
