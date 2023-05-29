package org.example;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.*;

public class Main {
    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setMaster("local[*]").setAppName("LR10");
        JavaSparkContext context = new JavaSparkContext(conf);
        SparkSession sparkSession = SparkSession.builder().appName("LR10").getOrCreate();

        Dataset<Row> dataset = sparkSession.read().format("csv").option("header", "true").load("Bitcoin_prices.csv");

        dataset.createOrReplaceTempView("bitcoin");

        sparkSession.sql("select * from bitcoin").show();

        sparkSession.sql("select AVG(Volume) from bitcoin").show();

        sparkSession.sql("select * from bitcoin where Date between '2014-09-18' and '2014-10-18' ORDER BY Date").show();

        sparkSession.sql("select distinct Volume from bitcoin").show();

        sparkSession.sql("select Date, SUM(Volume) OVER (ORDER BY Date) as VolumeSum from bitcoin").show();

        sparkSession.sql("select * from bitcoin LIMIT 10").show();

        sparkSession.sql("select * from bitcoin order by Open asc").show();

        sparkSession.sql("select FIRST(Date), Volume from bitcoin group by Volume").show();

        sparkSession.sql("select * from bitcoin where Date between '2020-01-01' and '2021-01-01' and Open > 15000").show();

        sparkSession.sql("select * from bitcoin where Open > 50000 order by 1 asc").show();

        sparkSession.stop();

    }
}