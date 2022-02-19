package main.com.ananjay.java.practice.basic;

import java.util.Scanner;

/*
    • We need to define the variable with data type before using
    • Primitive data type are normal variables, copying will create different memory location instead of pointing to the same location.
    • It stored in Stack memory.
    • Memory will be allocated when we declare it .
    • Wrapper class holds the reference of the value
    • For every primitive type there is inbuilt wrapper class that hold the primitive type
	• Implicit Conversion
		○ Byte-short/char-int-long-float-double
	• Narrowing or Explicit Conversion
		○ If we not mention data type explicit then we will get error.
	 • System.out.format() or System.out.printf() are same, used for formatting the values
 */
public class Variables {
    public static void main(String[] args) {
        byte a = 5;
        short b = 2324;
        int c = 13232323;
        long d = 123213232322323l;
        float e = 3.14f;
        double f = 3.14;
        boolean g = true;
        char h = 'a';
        String i = "Ananjay";

        System.out.println("Hello World");
        System.out.println("byte : " + a);
        System.out.println("short : " + b);
        System.out.println("int : " + c);
        System.out.println("long : " + d);
        System.out.println("float : " + e);
        System.out.println("double : " + f);
        System.out.println("boolean : " + g);
        System.out.println("char : " + h);
        System.out.println("String : " + i);

        int x = 10;
        Integer y = x; //Autoboxing
        int z = y; //Auto- Unboxing
        System.out.println("x :"+x+" y :"+y+" z :"+z);

        //Implicit Conversion
        byte p = 5;
        short q = p;
        int r = q;
        long s = r;

        //Explicit Conversion
        double t = 3.14;
        long u = (long)t;
        int v = (int)u;
        short w =(short)v;

        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        System.out.println("You have entered Int as  : "+x1);
        String s1 = sc.nextLine();
        System.out.println("You have entered String as : "+s1);
        float f1 = sc.nextFloat();
        System.out.println("You have entered Float as: "+f1);

        System.out.format("x1 : %d",x);
        System.out.printf("f1 : %.1f",f1);

        if(args.length >0){
            for(String i1 : args){
                System.out.println(i1+" ");
            }
        }
        else{
            System.out.println("No Arguments Provided");
        }



    }
}
