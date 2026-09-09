public class mycharacter {

    public static String touppercase(String str) {

        StringBuilder sb = new StringBuilder("");

        char Ch = java.lang.Character.toUpperCase(str.charAt(0));
        sb.append(Ch);

        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ' && i < str.length()-1) {
                i++;
                sb.append(java.lang.Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String args[]) {
        String str = "hi i am satish ";
        System.out.println(touppercase(str));
    }
}