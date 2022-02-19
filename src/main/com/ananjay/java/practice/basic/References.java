package main.com.ananjay.java.practice.basic;

/*
- We create non-primitive data type using new keyword.
- When we not initialize the members of non-primitive data type, It get default value
- We access it variable using . (dot).
- It stored in Heap memory.
- It is always a references
	□ Reference - it just holds the reference of  the memory location where the object is stored.
 */
class Point{
    int x;
    int y;
}

public class References {
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println("Value of P.x by default :: "+p.x);
        System.out.println("Value of P.y by default :: "+p.y);
        p.x = 10;
        p.y = 20;
        System.out.println("Value of P.x :: "+p.x);
        System.out.println("Value of P.y  :: "+p.y);
        Point p1 =p;
        System.out.println("Value of P1.x :: "+p1.x);
        System.out.println("Value of P1.y  :: "+p1.y);
        p1.x = 30;
        System.out.println("******Value after change******");
        System.out.println("Value of P.x :: "+p.x);
        System.out.println("Value of P.y  :: "+p.y);
        System.out.println("Value of P1.x :: "+p1.x);
        System.out.println("Value of P1.y  :: "+p1.y);
        //Both the object have reference to same memory location that's why changing by one can be reflected in both the object.
    }
}
