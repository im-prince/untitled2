public class CWH_15Ch3_Ps3 {
    public static void main(String[] args) {
        //QUESTION 1   Write a JAVA program to convert a string to lower string.

        String name = "prince Kumar";
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        //QUESTION 2   Write a JAVA program to replace spaces with underscore.

        name = name.replace(" ","_");
        System.out.println(name);

        //QUESTION 3

        String letter = "Dear <|name|>, Happy Birthday";
        letter = letter.replace("<|name|>","Prerna");
        System.out.println(letter);

        //QUESTION 4  Write a JAVA program to detect double and triple spaces in a string.

        String newstring = "Was I too Soft, or the  World Too   Hard";
        System.out.println(newstring.indexOf(" "));
        System.out.println(newstring.indexOf("  "));
        System.out.println(newstring.indexOf("   "));

        //QUESTION 5

        System.out.println("DEAR HARRY, \n\tThis JAVA course is awesome\nThanks");





    }
}
