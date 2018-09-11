package countdown;

public class RunnableWay {
    public static void main(String[] args) {
        CountRunnable countThread1 = new CountRunnable(20, LaneEnum.LANE_1);
        CountRunnable countThread2 = new CountRunnable(20, LaneEnum.LANE_2);
        CountRunnable countThread3 = new CountRunnable(20, LaneEnum.LANE_3);
        CountRunnable countThread4 = new CountRunnable(20, LaneEnum.LANE_4);
        CountRunnable countThread5 = new CountRunnable(20, LaneEnum.LANE_5);
        CountRunnable countThread6 = new CountRunnable(20, LaneEnum.LANE_6);

        Thread thread1 = new Thread(countThread1);
        Thread thread2 = new Thread(countThread2);
        Thread thread3 = new Thread(countThread3);
        Thread thread4 = new Thread(countThread4);
        Thread thread5 = new Thread(countThread5);
        Thread thread6 = new Thread(countThread6);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
