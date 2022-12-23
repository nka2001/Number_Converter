package com.mycompany.numberconverter;

import java.util.Stack;

/**
 * This class will convert a given decimal number into its octal equivalent, it
 * uses a stack to push the converted number, then is popped to assemble the
 * number, eventually I will implement my own stack and make another version of
 * this program.
 *
 * @author nicka
 */
public class ConvertToOctal {

    private int numToConvert;
    private Stack convertedNum = new Stack();

    /**
     * default constructor, takes no parameters, initialize the number to 1.
     */
    public ConvertToOctal() {
        this.numToConvert = 1;
    }

    /**
     * constructor with default parameter, takes the number to convert as a
     * parameter, calls the set method for input validation (since no negative
     * numbers at the moment)
     *
     * @param numToConvert
     */
    public ConvertToOctal(int numToConvert) {
        setNumberToConvert(numToConvert);

    }

    /**
     * copy constructor, takes a convertToOctal object as a parameter, pulls
     * both the number to convert, as well as the stack from that object
     *
     * @param other
     */
    public ConvertToOctal(ConvertToOctal other) {
        this.convertedNum = other.convertedNum;
        this.numToConvert = other.numToConvert;
    }

    /**
     * setNumberToConvert method takes the number to convert to binary as a
     * parameter, and sets it, for now, no negative numbers are dealt with, so
     * simply return false and move on
     *
     * @param numberToConvert
     * @return
     */
    public final boolean setNumberToConvert(int numberToConvert) {

        if (numberToConvert < 0) {//if the number passed in is negative, 
            this.numToConvert = 1;//then set the number to be converted to 1
            return false;//and return false 
        } else { //otherwise, simply set the number to be converted to the number provided
            this.numToConvert = numberToConvert;
        }

        return true;//returns true if the number provided is not negative
    }

    /**
     * toString will return the contents of the stack, by popping one at a time
     * adding a space between each block of 4 bits
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "";//string is intially empty

        while (!convertedNum.isEmpty()) {

            str += convertedNum.pop();//take the top item off the stack,add it to the string, and then remove it 

        }
        return str;//return the string when all is said and done

    }
    
    /**
     * convertToOctal will take the number given by the user and convert it to its octal equivalent.
     */
    public void convertToOctal(){
        while(numToConvert > 0){
            
            convertedNum.push(this.numToConvert % 8);//remainder 8 since octal is base 8
            this.numToConvert /= 8;//divide the original number by 8 to decrease it 
            
            
        }
        
    }

}
