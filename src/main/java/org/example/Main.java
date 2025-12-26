package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {


int[] arr = {12,43,77,34,22,99};
int n = 22;
        System.out.println(countEven(arr,n));

    }
    public static boolean countEven(int[] arr,int n ){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}




