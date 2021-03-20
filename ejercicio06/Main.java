package ejercicio06;

public class Main {
    public static void main(String[] args) {
        // rpad test
        System.out.println(StringUtil.rpad("Hello...", 20, '0'));
        // ltrim test
        System.out.println("["+StringUtil.ltrim("      Hello       ")+"]");
        // rtrim test
        System.out.println("["+StringUtil.rtrim("      Hello       ")+"]");
        // trim test
        System.out.println("["+StringUtil.trim("      Hello       ")+"]");
        // indexOfN test
        System.out.println(StringUtil.indexOfN("John/George/Paul/Ringo", '/', 3));
    }
}
