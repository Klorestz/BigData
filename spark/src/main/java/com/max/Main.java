package com.max;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

public class Main {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local[*]").setAppName("123");
        JavaSparkContext context = new JavaSparkContext(conf);
    }
}