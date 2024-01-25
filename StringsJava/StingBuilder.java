package StringsJava;

public class StingBuilder {
    public static void main(String[] args) {
        StringBuilder strbuild = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            strbuild.append(ch);
        }

        System.out.println(strbuild.length());
    }
}
