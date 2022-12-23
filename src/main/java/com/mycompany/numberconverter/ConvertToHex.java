package com.mycompany.numberconverter;

import java.util.Stack;

/**
 * This class is used to convert a decimal number into its hexadecimal
 * equivalent, using a stack sooner or later I will implement my own stack and
 * change this program to use my stack.
 *
 * @author nicka
 */
public class ConvertToHex {

    public int numToConvert;
    private Stack convertedNum = new Stack();

    /**
     * default constructor, takes no parameters, sets the number initially to 1.
     */
    public ConvertToHex() {
        this.numToConvert = 1;
    }

    /**
     * constructor with default parameters, takes the number to convert as a
     * parameter, calls the set method
     *
     * @param numToConvert
     */
    public ConvertToHex(int numToConvert) {
        setNumberToConvert(numToConvert);//call the set method, for input validation
    }

    /**
     * copy constructor, takes a convertToHex Object as a parameter, sets both
     * the number AND stack to the same value as the other object
     *
     * @param other
     */
    public ConvertToHex(ConvertToHex other) {
        this.convertedNum = other.convertedNum;//set this stack equal to the other object's stack
        this.numToConvert = other.numToConvert;//set this number to convert equal to the other object's number
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
     * getNumberToConvert method will return the number that is to be converted.
     *
     * @return
     */
    public int getNumberToConvert() {
        return this.numToConvert;//return the number to be converted
    }

    /**
     * toString will return the contents of the stack, by popping one at a time
     *
     *
     * @return
     */
    @Override
    public String toString() {
        String str = "";//string is intially empty

        while (!convertedNum.isEmpty()) {

            int temp = (int) convertedNum.pop();//take the top item off the stack,add it to the string, and then remove it 

            switch (temp) {//rule switch for determining the placement of letters in hex 
                case 10 -> //if the number popped is 10 then 
                    str += "A";//add an A
                case 11 ->//if the number popped is 11 then
                    str += "B";//add an B
                case 12 ->//if the number popped is 12 then 
                    str += "C";//add an C
                case 13 ->//if the number popped is 13 then
                    str += "D";//add an D 
                case 14 ->//if the number popped is 14 then
                    str += "E";//add an E
                case 15 ->//if the number popped is 15 then
                    str += "F";//add an F
                default ->//otherwise
                    str += temp;//just add the number to the string
            }

        }
        return str;//return the string when all is said and done

    }

    /**
     * convertToHexadecimal method will convert the given number into its
     * hexadecimal format.
     */
    public void convertToHexadecimal() {

        while (numToConvert > 0) {

            convertedNum.push(this.numToConvert % 16);

            this.numToConvert /= 16;

        }

    }
}
