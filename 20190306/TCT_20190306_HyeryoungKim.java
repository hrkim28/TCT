import java.util.Scanner;

public class TCT_20190306_HyeryoungKim {

    public static void main(String[] args) {
        TCT_20190306_HyeryoungKim tct = new TCT_20190306_HyeryoungKim();
        Scanner sc = new Scanner(System.in);
        System.out.println(tct.changeName(sc.next()));
        sc.close();
    }

    private String changeName(String input) {
        if ( input.contains("_") ) {
            return changeNameForJava(input);
        } else {
            return changeNameForCPP(input);
        }
    }

    private String changeNameForJava(String input) {
        String newStr = "";
        String[] arr = input.split("_");
        newStr = arr[0];
        for ( int idx = 1 ; idx < arr.length ; idx++ ) {
            newStr += arr[idx].substring(0,1).toUpperCase() + arr[idx].substring(1);
        }
        return newStr;
    }

    private String changeNameForCPP(String input) {
        String newStr = "";
        for ( int idx = 0 ; idx < input.length() ; idx++ ) {
            char c = input.charAt(idx);
            if ( Character.isUpperCase(c) ) {
                newStr += "_" + String.valueOf(c).toLowerCase();
            } else {
                newStr += String.valueOf(c);
            }
        }
        return newStr;
    }
}