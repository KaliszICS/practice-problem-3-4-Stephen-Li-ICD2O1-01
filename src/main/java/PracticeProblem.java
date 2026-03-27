/*
File: Lesson 3.4 - Nested Ifs
Author: Stephen Li
Date Created: Mar 26, 2026
Date Last Modified: Mar 26, 2026
*/

public class PracticeProblem
{
	public static void main(String[] args) {
	    
	}
	public static int min(int num1, int num2, int num3) {
	int placeholder = 1;
	    if (num1 <= num2) {
	        if (num1 <= num3) {
	            return num1;
	        }
	        else if (num2 <= num3) {
	            return num2;
	        }
	    }
	    else {
	        if (num2 <= num3) {
	            return num2;
	        }
	        else if (num3 <= num2) {
	            return num3;
	        }
	    }
	    return placeholder;
	}
	
	public static boolean isLeapYear(int year) {
	    if (year % 4 == 0) {
	        if (year % 100 == 0) {
	            if (year % 400 == 0) {
	                return true;
	            }
	            else {
	                return false;
	            }
	        }
	        else {
	            return true;
	        }
	    }
	    else {
	        return false;
	    }
	}
}
