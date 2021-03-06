package com.zimmem.math;

import java.io.Serializable;
import java.util.function.Function;

/**
 * Created by zimmem on 2016/7/26.
 */
public class Functions {

    /**
     * S型函数
     */
    public static Function<Double, Double> Sigmoid =(Serializable & Function<Double, Double>) (x -> 1 / (1 + Math.pow(Math.E, -x)));


    /**
     * S 型函数的导函数
     */
    public static Function<Double, Double> SigmoidDerivative = (Serializable & Function<Double, Double>) ( x ->  Functions.Sigmoid.apply(x) * ( 1 - Functions.Sigmoid.apply(x)));

    public static void main(String[] args){
        System.out.println(Sigmoid.apply(40d));
    }


}
