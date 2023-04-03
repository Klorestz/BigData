package lr6_v1_task2;

import java.util.PriorityQueue;
import java.util.Queue;

public class lr6_v1_task2 {
    public static double findResistance(Queue<Double> currentQueue, Queue<Double> voltageQueue) throws Exception {

        if(currentQueue.size() != voltageQueue.size()){
            throw new Exception("Структуры данных имеют разный размер.");
        }

        int n = currentQueue.size();
        double sumIU = 0.0;
        double sumI2 = 0.0;
        double meanI = 0.0;
        double meanU = 0.0;


        while (!currentQueue.isEmpty() && !voltageQueue.isEmpty()) {
            double current = currentQueue.poll();
            double voltage = voltageQueue.poll();
            sumIU += current * voltage;
            sumI2 += Math.pow(current, 2);
            meanI += current;
            meanU += voltage;
        }

        meanI /= n;
        meanU /= n;


        double R = (sumIU - n * meanI * meanU) / (sumI2 - n * Math.pow(meanI, 2));


        return R;
    }
    public static void main(String[] args) {

        Queue<Double> current = new PriorityQueue<Double>();
        Queue<Double> voltage = new PriorityQueue<Double>();

        current.add(1.0);
        current.add(2.0);
        current.add(3.0);

        voltage.add(2.0);
        voltage.add(4.0);
        voltage.add(6.0);

        try {
            double Resistance = findResistance(current,voltage);
            System.out.println("Resistance: " + Resistance);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
