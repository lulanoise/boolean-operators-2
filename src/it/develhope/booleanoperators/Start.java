package it.develhope.booleanoperators;

public class Start {
    public static void main(String[] args) {

        boolean A = (55 != 55) && (false ^ true);

        boolean a = true;
        boolean b = false;

        int c = 2;
        char d = 2;
        
        boolean B = (!a || !b) || (c == d);
        boolean C = false && true || false && !false;
        boolean D = (false && true) || (false || true);

        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }
}
 /*

 A: (55 != 55) && (false ^ true)
     false && true
     false

B: (!a || !b) || (c == d)
   (false || true) || (true)
   true || true
   true

C: false && true || false && !false
   false || false && true
   false || false
   false

D: (false && true) || (false || true)
    false || true
    true
 */

