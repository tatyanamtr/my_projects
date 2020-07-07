package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Grading {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List <Integer> result = new ArrayList<>();
        for ( int i : grades) {
            if (i<38) {
                result.add(i);
            } else if (i%5 < 3) {
                result.add(i);
            } else {
                result.add(i + (5-i%5));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        return result;
    }

    public static void main(String[] args) {
        List <Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        gradingStudents(grades);
    }
}
