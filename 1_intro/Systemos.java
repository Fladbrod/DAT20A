import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Systemos{


    public static class out {
        public static void println(String s) {
            System.out.println(s);
        }

        public static void println(int i) {
            System.out.println(i);
        }

        public static void println(double o) {
            System.out.println(o);
        }

        public static void println(long l) {
            System.out.println(l);
        }

        public static void println(byte b) {
            System.out.println(b);
        }

        public static void println(char c) {
            System.out.println(c);
        }

        public static void println(boolean b) {
            System.out.println(b);
        }

        public static void println(short sh) {
            System.out.println(sh);
        }

        public static void println(float f) {
            System.out.println(f);
        }

        public static void println(Object content) {
            System.out.println(content);
        }

        public static void println(Object[] content) {
            for (int i = 0; i < content.length; i++)
                System.out.println(content[i]);
        }

        public static void println(List content) {
            content.forEach(System.out::println);
            }

        }


    }
}
