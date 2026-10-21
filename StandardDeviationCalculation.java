
package com.mycompany.calculating;
public class StandardDeviationCalculation extends MeasureCalculator
{
	public StandardDeviationCalculation(double[] numbers)
	{
            super(numbers.length);
		double mean = (new MeanComputation(numbers)).computeMean();
		
		for(int i = 0; i < numbers.length; i++)
			this.numbers[i] = Math.pow(numbers[i] - mean, 2);
	}

	private double getSum()
	{
		return super.GetSum(numbers);
	}

	public double getStandardDeviation() 
	{
		return Math.sqrt(getSum() / this.numbers.length);
	}	

	public double[] getElements()
	{
		return super.getNumbers();
	}
}
