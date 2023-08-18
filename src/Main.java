//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrA = new ArrayList();
        ArrayList<String> arrB = new ArrayList();
        System.out.println("Enter 5 numbers for Arr a: ");

        int i;
        for(i = 0; i < 5; ++i) {
            arrA.add(scanner.nextLine());
        }

        Iterator var6 = arrA.iterator();

        String s;
        while(var6.hasNext()) {
            s = (String)var6.next();
            System.out.print(s + " ");
        }

        System.out.println(" ");
        System.out.println("Enter 5 numbers for Arr b: ");

        for(i = 0; i < 5; ++i) {
            arrB.add(scanner.nextLine());
        }

        var6 = arrB.iterator();

        while(var6.hasNext()) {
            s = (String)var6.next();
            System.out.print(s + " ");
        }

        System.out.println(" ");
        ArrayList<String> arrC = new ArrayList();

        for(int x = 0; x < 5; ++x) {
            arrC.add((String)arrA.get(x));
            arrC.add((String)arrB.get(4 - x));
        }

        System.out.println("Sort C arrayList ");
        Collections.sort(arrC, Comparator.comparingInt(String::length));
        System.out.println(arrC);
    }
}
