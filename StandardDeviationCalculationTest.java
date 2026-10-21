
package com.mycompany.calculating;
import java.util.Arrays;

public class StandardDeviationCalculationTest
{
	public static void main(String[] args) 
	{
		double[] array = {1.2,8.2,0.3,2.7,9.0};
		StandardDeviationCalculation sd = new StandardDeviationCalculation(array);
		System.out.println("Elements: "+ Arrays.toString(sd.getElements()));
		System.out.println("SD: " + sd.getStandardDeviation());
	}
}
