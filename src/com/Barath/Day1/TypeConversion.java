package com.Barath.Day1;
import java.util.*;
public class TypeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer Value : ");
        int integerValue = sc.nextInt();
        System.out.print("Enter the float Value : ");
        float floatValue = sc.nextFloat();
        System.out.print("Enter the Character Value : ");
        char charValue = sc.next().charAt(0);
        // Task 1: Convert the integer --> float and adding to the float value
        floatValue += (float) integerValue;
        // Task 2: Convert char --> ASCII value and add to the integer value
        integerValue += (int) charValue;
        // Task3: Displaying the Values with Proper DataTypes
        System.out.println("IntegerValue : " + integerValue);
        System.out.println("FloatValue : " + floatValue);
        System.out.println("CharacterValue : " + charValue);
    }
}
