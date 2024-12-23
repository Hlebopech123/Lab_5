import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HighlightCapitalLetters_3 {
    public static void main(String[] args) {
        String inputText = "FabCklsdR";
        String result = highlightCapitalLetters(inputText);
        System.out.println(result);
    }

    public static String highlightCapitalLetters(String text) {
        // Регулярное выражение для поиска строчной буквы, за которой следует заглавная
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        // Замена найденных совпадений на выделенные восклицами
        StringBuffer highlightedText = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(highlightedText, matcher.group(1) + "!" + matcher.group(2) + "!");
        }
        matcher.appendTail(highlightedText);

        return highlightedText.toString();
    }
}