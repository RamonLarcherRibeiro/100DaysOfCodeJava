import java.util.HashMap;

public class App {
    public static boolean areAnagrams(String str1 , String str2) {

        //se o tamanho for diferente nao podem ser anagramas
        if(str1.length() != str2.length()){
            return false;
        }

        //converter tudo para minusculo
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //usar hashmap para contar a frequencia de caracteres :)
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        //contar quantas vezes aparece cada caracter
        for(char c :str1.toCharArray()){
            charCountMap.put(c , charCountMap.getOrDefault(c,0) + 1 );
        }

        for(char c : str2.toCharArray()){
            //verificar se a letra se encontra no array
            if(!charCountMap.containsKey(c)){
                return false;
            }

            //subtrair a frequencia 
            int count = charCountMap.get(c);

            if(count == 1){
                charCountMap.remove(c);
            }else{
                charCountMap.put(c, count -1 );
            }
        }

        return charCountMap.isEmpty();
    }
    public static void main(String[] args) {
        // Testar o método com algumas strings
        String str1 = "amor";
        String str2 = "Roma";

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" e \"" + str2 + "\" são anagramas.");
        } else {
            System.out.println("\"" + str1 + "\" e \"" + str2 + "\" não são anagramas.");
        }
    }
}
