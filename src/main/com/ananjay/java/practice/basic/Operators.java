package main.com.ananjay.java.practice.basic;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operators
        int x = 10, y = 20;
        System.out.println(x + y);
        System.out.println(x * y);
        System.out.println(y / x);
        int z = (x + y * 10);
        System.out.println(z);
        z = x++;
        System.out.println(z + " " + x);
        z = ++x;
        System.out.println(z + " " + x);

        // Assignment Operators
        x += y;
        System.out.println(x);
        x %= y;
        System.out.println(x);
        z = x = y;
        System.out.println(z);

        //Logical Operators
        String user = "geek" , pwd = "GEEK";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User : ");
        System.out.println("Enter Password : ");
        String iu = sc.next();
        String ip = sc.next();
        if(user.equals(iu) && pwd.equals(ip))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Try Again");
        }

        boolean x1 = true, y1 = false;
        System.out.println(x1 && y1);
        System.out.println(x1 || y1);
        System.out.println( !x1 );

        //Bitwise Operators
        x = 3;
        y = 6;
        System.out.println(x ^ y); //XOR
        System.out.println(x | y); //OR
        System.out.println(x & y); //AND
        x = -1;
        System.out.println(x << 1); //LeftShift
        x = 3;
        System.out.println(x << 1);
        System.out.println(x << 2);
        y = 4;
        z = (x << y);
        System.out.println(z);
        x = 1;
        System.out.println(~ x); //NOT
        x = -2;
        System.out.println(x >>> 1); //Unsigned Right Shift
        x = -2;
        System.out.println(x >> 1); //Right Shift with Negative Number
        x = 33;
        System.out.println(x >> 2);
        x = 33;
        System.out.println(x >> 1);

        //Relational Operators


        }
    }
}
