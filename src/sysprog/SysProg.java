package sysprog;

import java.util.Scanner;

public class SysProg {

    static boolean accept(int state) {
        if (state == 1 || state == 3) 
            return true;
        return false;
        }
    

    static int Trans(int state, char ch) {
        if (state == 1) {
            if (ch == 'a') {
                return 1;
            }
            if (ch == 'b') {
                return 2;
            }
        }
        if (state == 2) {
            if (ch == 'a') {
                return 3;
            }
            if (ch == 'b') {
                return 4;
            }

        }
        if (state == 3) {
            if (ch == 'a') {
                return 2;
            }
            if (ch == 'b') {
                return 1;
            }

        }
        if (state == 4) {
            if (ch == 'a') {
                return 3;
            }
            if (ch == 'b') {
                return 4;
            }

        }
        return 0;
    }

    public static void main(String[] args) {

        int state = 1;
        Scanner input = new Scanner(System.in);
        String ch = input.next();  
        int len = 0;
        while (len <ch.length()) {
            int newState = Trans(state, ch.charAt(len));
            state = newState;
            len ++;

        }
        if (accept(state)) {
            System.out.println("Accept");
        } else {
            System.out.println("Reject");
        }
    }
    
}
