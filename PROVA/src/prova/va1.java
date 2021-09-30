package prova;
public class va1 {
     public static String getStr() {
         String a = "abcdefghijklmnop";
         return a;
    }
 public String ini(String s, int cpr) {
 return s.substring(0, cpr);
 }
 public String fin(String s, int cpr) {
 return ini(s, cpr)+s.substring(s.length()-cpr, s.length());
 }
    
}
