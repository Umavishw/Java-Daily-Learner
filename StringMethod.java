public class StringMethod {
    public static void main(String[] args) {
        String a = "Harry";
        int value = a.length();
        System.out.println(value);
        String lower = a.toLowerCase();
        System.out.println(lower);
        String upper = a.toUpperCase();
        System.out.println(upper);

        String nonTrimmedString = "harry";
        String trim = nonTrimmedString.trim();
        System.out.println(trim);

        String TrimmedString = " harry   ";
        String trimmed = TrimmedString.trim();
        System.out.println(trimmed);
        
        String name = "Harry";
        System.out.println(a.substring(3));
        System.out.println(a.substring(2, 4));
        System.out.println(a.replace("r", "p"));
        System.out.println(name.startsWith("a"));
        System.out.println(name.endsWith("y"));
        System.out.println(name.charAt(0));
        System.out.println(name.indexOf("rr",3));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("HaRry"));
        System.out.println(name.contains("harry"));
        System.out.println(name.split(" "));

        // Escape Sequence
        System.out.println("I am software developer \t double quote");
        System.out.println("I am software developer \\ double quote");
        System.out.println("I am software developer \n double quote");
        System.out.println("I am software developer \" double quote");
    }
}