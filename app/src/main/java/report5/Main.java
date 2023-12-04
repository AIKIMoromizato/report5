package report5;

import com.google.common.base.Strings;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionがキャッチされました。");
            e.getMessage();
        }


    }
}
