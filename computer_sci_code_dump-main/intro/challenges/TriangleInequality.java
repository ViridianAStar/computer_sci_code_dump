/*
 * This program should check if the 3 numbers, 
 * firstNum, secondNum, and thirdNum can form a triangle.
 * Recall that three lengths can form a triangle if the longest
 * of the three is less than the sum of the other two shorter 
 * lengths. 
 *
 * Write an implementation of this algorithm.
 */

import java.util.Scanner;

public class TriangleInequality {

	public static int firstLength = 0;
	public static int secondLength = 0;
	public static int thirdLength = 0;
	public static boolean firstLongest = false;
	public static boolean secondLongest = false;
	public static boolean thirdLongest = false;
	public static boolean equiLater = false;
	public static boolean isole1 = false;
	public static boolean isole2 = false;
	public static boolean isole3 = false;
	public static boolean isTriangle;
	public static int things_tried = 0;

	private static Scanner kBr = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Please input first length: ");
		firstLength  = kBr.nextInt();
		System.out.println("Please input second length: ");
		secondLength =  kBr.nextInt();
		System.out.println("Please input third length: ");
		thirdLength  =  kBr.nextInt();
				
		compare_lengths();
	}

	public static String compare_lengths(){
		if (firstLength > secondLength && firstLength > thirdLength){
			firstLongest = true;
			if (firstLongest == true){
				if (firstLength < secondLength + thirdLength){
					System.out.println("Forms a triangle");
					return "Forms a triangle";
				} else if (firstLength > secondLength + thirdLength){
					System.out.println("Does not form a triangle");
					things_tried = things_tried + 1;
				}
			} else if (firstLongest == false){
				if (secondLength > firstLength && secondLength > thirdLength){
					secondLongest = true;
					if (secondLongest == true){
						if (secondLength < thirdLength + firstLength){
							System.out.println("Forms a triangle");
						} else if (secondLength > thirdLength + firstLength){
							System.out.println("Does not form a triangle");
							things_tried = things_tried + 1;
						}
					} else if (secondLongest == false){
						if (thirdLength > secondLength && thirdLength > firstLength){
							thirdLongest = true;
							if (thirdLongest == true){
								if (thirdLength < secondLength + firstLength){
									System.out.println("Forms a triangle");
								} else if (thirdLength > secondLength + firstLength){
									System.out.println("Does not form a triangle");
									things_tried = things_tried + 1;
								}
							} else if (thirdLongest == false){
								if (thirdLength == firstLength && thirdLength == secondLength && secondLength == firstLength){
									equiLater = true;
									if (equiLater == true){
										System.out.println("Forms an equilateral triangle");
									} else if (equiLater == false){
										System.out.println("Does not form an equilateral triangle");
										things_tried = things_tried + 1;
									}
								}
							}
						}
					}
				}
			}
		} else if (things_tried == 4){
			return "Cannot form a triangle";
		}
	}
}