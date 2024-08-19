
import classes.AnagramChecker;
public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "pato";
        String str2 = "OPTA";

        if (AnagramChecker.areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" e \"" + str2 + "\" são anagramas.");
        } else {
            System.out.println("\"" + str1 + "\" e \"" + str2 + "\" não são anagramas.");
        }
    }
}
