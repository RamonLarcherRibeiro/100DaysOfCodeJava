import java.util.ArrayList;

public class App {
    public static String[] substrings(String str) {
        // remove vírgulas
        str = str.replaceAll("[,]", "");

    
        char[] array = str.toCharArray();

        //lista para armazenar as substrings
        ArrayList<String> substringsList = new ArrayList<>();
        StringBuilder substring = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                //se não estiver vazia
                if (substring.length() > 0) {
                    substringsList.add(substring.toString());
                    substring.setLength(0); // limpar
                }
            } else {
                substring.append(array[i]);
            }
        }

        // adicionar a ultima substring
        if (substring.length() > 0) {
            substringsList.add(substring.toString());
        }


        String[] substrings = substringsList.toArray(new String[0]);

        return substrings;
    }

    public static void main(String[] args) {
        String[] subs = substrings("Encontrar todas as substrings de uma string.\n" + //
                        "");
        for (String str : subs) {
            System.out.println(str);
        }
    }
}
