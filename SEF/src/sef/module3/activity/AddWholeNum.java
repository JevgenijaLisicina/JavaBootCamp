//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sef.module3.activity;

public class AddWholeNum {
    public AddWholeNum() {
    }

    public static void main(String[] args) {
        int total = 0;

        int i;
        for(i = 1; i <= 50; ++i) {
            total += i;
        }

        System.out.println("Addition of Whole Numbers from 1 to 50 = " + total);
        total = 0;

        for(i = 50; i <= 100; ++i) {
            total += i;
        }

        System.out.println("Addition of Whole Numbers from 50 to 100 = " + total);
    }
}
