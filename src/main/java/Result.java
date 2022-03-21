import java.util.ArrayList;
import java.util.List;

/*public class Result {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 40) { // if the grade has less than 40 points, the grade is a failing grade
                grades.remove(i);
                continue;
            }
            int gradeDividedBy5 = grades.get(i) % 5;
            if (gradeDividedBy5 == 4) { // if the gradeDividedBy5 has 4 as rest
                grades.set(i, grades.get(i) + 1); // add 1 point
            }
            else if (gradeDividedBy5 == 3) { // else if the gradeDividedBy5 has 3 as rest
                grades.set(i, grades.get(i) + 2); // add 2 points
            }

            else { // else if the gradeDividedBy5 has less than 3 as rest
                grades.set(i, grades.get(i)); // do not add any points
            }
        }
        return grades;
    }
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>() {};
        test.add(73);
        test.add(35);
        test.add(91);
        test.add(4);
        gradingStudents(test);
        System.out.println(test);


    }
}
 */
public class Result {

        public static boolean checkStudents (int value){
            return (value > 0 && value < 60);
        }


        public static boolean checkGrade(int value){
            return (value > 0 && value < 100);
        }


        public static boolean checkRounding(int value){
            if (value < 38) {
                return false;
            }

            else if (value % 5 > 2) {
                return true;
            }

            else {
                return false;
            }
        }


        protected static boolean checkingStudentsEqualsGrades(List<Integer> grades) {
            if (grades.get(0) == grades.size() - 1) {
                return true;
            }
            else return false;
        }

    public static List<Integer> gradingStudents(List<Integer> grades) {

            List<Integer> gradesAfterRounding = new ArrayList<>();


        checkStudents(grades.get(0));
        checkingStudentsEqualsGrades(grades);

        for (int i = 0; i <= grades.get(0); i++) {
            checkGrade(grades.get(i));
        }

        for (int i = 0; i <= grades.get(0); i++) {


            if (checkRounding(grades.get(i))) {
                gradesAfterRounding.add(grades.get(i) + (5 - grades.get(i) % 5));
            }
            else gradesAfterRounding.add(grades.get(i));

        }
        return gradesAfterRounding;




    }



}