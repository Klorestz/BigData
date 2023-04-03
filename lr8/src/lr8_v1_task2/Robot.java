package lr8_v1_task2;

public class Robot {
    private Thread leftLegMoving;
    private Thread rightLegMoving;
    public void leftMove(){
        leftLegMoving = new Thread(() -> {
           while (true){
               System.out.println("LEFT");
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        leftLegMoving.start();
    }

    public void rightMove(){
        rightLegMoving = new Thread(() -> {
            while (true){
                System.out.println("RIGHT");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        rightLegMoving.start();
    }
}
