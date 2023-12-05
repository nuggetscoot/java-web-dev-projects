import java.util.HashMap;
import java.util.Map;
public class Counting {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> chars = new HashMap<>();
        for (char c : charactersInString) {
            if (Character.isLetter(c)) {
                chars.put(c, chars.getOrDefault(c, 0) + 1);
            }

        }
        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }

    }
}

