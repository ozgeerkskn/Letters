//Alfabedeki harflerden kalın ünlü ve ince ünlü harfleri bulup ekrana yazdıran program.
public class Main {
    public static void main(String[] args) {

        String[] letters = {"a","b","c","ç","d","e","f","g","ğ","h","ı","i","j"
                ,"k","l","m","n","o","ö","p","r","s","ş","t","u","ü","v","y","z"};
        for (String element: letters){
            if(element == "a" || element == "ı" ||element == "o" ||element == "u"){
                System.out.println(element + " kalın ünlü harftir.");
            }
            else if(element == "e" || element == "i" ||element == "ö" ||element == "ü"){
                System.out.println(element + " ince ünlü harftir.");
            }
        }
    }
}