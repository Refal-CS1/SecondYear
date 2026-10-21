
package com.mycompany.calculating;
import java.util.Arrays;

public class MeanComputaionTest
{
	public static void main(String[] args) 
	{
		double[] array = {1.2,8.2,0.3,2.7,9.0};
		MeanComputation mc = new MeanComputation(array);
		System.out.println("Numbers: "+ Arrays.toString(mc.getNumbers()));
		System.out.println("Mean: " + mc.computeMean());
	}
}