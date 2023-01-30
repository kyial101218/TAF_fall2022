package practice.codingBat;

public class StarOut {
    public static void main(String[] args) {
        String res = starOut("ab**cd");
        System.out.println(res);
    }
    public static  String starOut(String str) {

        String s = "";

        for (int i=0;i<str.length();i++) {

//            if(i<str.length()-1 && str.charAt(i+1)=='*' && str.charAt(i)=='*') {
//                i=i+2;
//            }
             if(str.charAt(i)=='*'){
                i=i-1;
            }
            else {
                s = s + str.charAt(i);
            }

        }
        return s;
    }
}
