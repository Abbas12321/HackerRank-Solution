import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for( int i = 1; i <= 10; i++ ) {
            System.out.println( N + " x " + i + " = " + N*i);
        }
    }
}
