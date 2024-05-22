package utils;

public class Coder {
    private static String code[] = {
            ".-", "-...", "-.-.", "-..", ".", "..-.",
            "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", 
            "...", "-", "..-", "...-", ".--", "-..-", 
            "-.--", "--.."};

    public static String encode(char c) {
        String str="?";
        
        if ((c>='a')&&((c<='z'))) {
            // TODO: lookup string from the table
            int index = (int)c - (int)('a') ;
            str = code[index];
        } else if( c ==' ' || c == '\t' ) {
            str = c+"";
        }
        return str;
    }
}
