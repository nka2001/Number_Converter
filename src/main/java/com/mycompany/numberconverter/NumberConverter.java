package com.mycompany.numberconverter;

import java.util.Scanner;

/**
 * This application will be used to convert numbers to different types, such as convert decimal to binary, or decimal to hexadecimal and so on
 * @author nicka
 */
public class NumberConverter {

    
    public static void main(String[] args) {
        
        //TODO: Add test cases to binary class (Use the built in converter and compare, test the set method as well), aside from that move onto octal, or hexadecimal 
        
        
        /*
        ConvertToBinary c1 = new ConvertToBinary();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter a number to be converted to Binary: ");
        int num = scan.nextInt();
        
        c1.setNumberToConvert(num);
        
        c1.convertNumToBinary();
        
        System.out.println(c1.toString());
        */
        
        ConvertToOctal c2 = new ConvertToOctal();
        
        c2.setNumberToConvert(145);
        
        c2.convertToOctal();
        
        System.out.println(c2.toString());
        
        
        
    }
}
