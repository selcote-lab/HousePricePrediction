package com.tonasolution.com;

public class Main {

    public static void main(String[] args) {

       double[] thetaVector = new double[] { 1.004579, 5.286822 };

	   LinearRegressionFunction targetFunction = new LinearRegressionFunction(thetaVector);
       Double[] featureVector = new Double[] { 1.0, 1330.0 };

       double predictedPrice = targetFunction.apply(featureVector);

        System.out.println("The predicted price : " + predictedPrice);

    }
}
