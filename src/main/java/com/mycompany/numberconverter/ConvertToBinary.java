package com.mycompany.numberconverter;

import java.util.ArrayList;
import java.util.Stack;

/**
 * This class, ConvertToBinary, will be used to convert a given string of
 * numbers, in decimal form, into a binary number using a stack (built in, ill
 * eventually build my own stack and and recreate this program using my own
 * stack.
 *
 * @author nicka
 */
public class ConvertToBinary {

    private int numberToConvert;
    private Stack holdBNum = new Stack();//stack used to hold the binary number produced

    /**
     * Default constructor, takes no parameters.
     */
    public ConvertToBinary() {
        this.numberToConvert = 0;//initially nothing, not set yet
    }

    /**
     * constructor with default parameters, takes the actual number to be
     * converted as a parameter
     *
     * @param numberToConvert
     */
    public ConvertToBinary(int numberToConvert) {
        setNumberToConvert(numberToConvert);
    }

    /**
     * Copy constructor, takes a ConvertToBinary object as a parameter
     *
     * @param other
     */
    public ConvertToBinary(ConvertToBinary other) {
        this.numberToConvert = other.numberToConvert;//set the number to be converted to the number to be converted in the OTHER ConvertToBinary object
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
            this.numberToConvert = 1;//then set the number to be converted to 1
            return false;//and return false 
        } else { //otherwise, simply set the number to be converted to the number provided
            this.numberToConvert = numberToConvert;
        }

        return true;//returns true if the number provided is not negative
    }

    /**
     * getNumberToConvert method returns the number to be converted to binary
     *
     * @return
     */
    public int getNumberToConvert() {
        return this.numberToConvert;//return the number that is to be converted to the user
    }

    /**
     * convertNumToBinary will convert whatever number is provided earlier into
     * a binary number, it is pushed into a stack and will be popped when the
     * conversion is complete.
     */
    public void convertNumToBinary() {
        while (numberToConvert > 0) {//while the number is greater than 0...

            holdBNum.push(this.numberToConvert % 2);//modulus will leave a 0 or a 1, building the binary number
            numberToConvert /= 2;//then divide the number by 2 and keep dividing down until the number is 0

        }

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
        int counter = 0;//counter is intially 0
        while (!holdBNum.isEmpty()) {
            if(counter == 4){//for formatting, if the counter is 4, then add a space between the set of bits
                str += " ";
                counter = 0;//reset the counter to do again
            }
            counter++;//increment before pop
            str += holdBNum.pop();//take the top item off the stack,add it to the string, and then remove it 
            
        }
        return str;//return the string when all is said and done

    }

}
