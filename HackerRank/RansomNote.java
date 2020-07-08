package HackerRank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    static void checkMagazine(String[] magazine, String[] note) {
        String result = new String();

        Map <String, Integer> mapMagazine = new HashMap<>();
        Map <String, Integer> mapNote = new HashMap<>();

        for (String s : magazine) {
            if (mapMagazine.containsKey(s)) {
                mapMagazine.put(s, mapMagazine.get(s)+1);
            } else {
                mapMagazine.put(s, 1);
            }
        }
        for (String s : note) {
            if (mapNote.containsKey(s)) {
                mapNote.put(s, mapNote.get(s)+1);
            } else {
                mapNote.put(s, 1);
            }
        }

        for (String s : note) {

            if (!mapMagazine.containsKey(s)) {
                result ="No";
                break;
            }
            else {

                if ( mapMagazine.get(s) <  mapNote.get(s)) {
                    result ="No";
                    break;
                }
                else {
                    result = "Yes";
                }

            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        checkMagazine(new String[]{"two", "times", "three", "is", "not", "four"}, new String[]{"two", "times", "two", "is", "four"});
    }
}
