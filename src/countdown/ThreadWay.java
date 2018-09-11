package countdown;

public class ThreadWay {
    public static void main(String[] args) {
        CountThread countThread1 = new CountThread(20, LaneEnum.LANE_1);
        CountThread countThread2 = new CountThread(20, LaneEnum.LANE_2);
        CountThread countThread3 = new CountThread(20, LaneEnum.LANE_3);
        CountThread countThread4 = new CountThread(20, LaneEnum.LANE_4);
        CountThread countThread5 = new CountThread(20, LaneEnum.LANE_5);
        CountThread countThread6 = new CountThread(20, LaneEnum.LANE_6);

        countThread1.start();
        countThread2.start();
        countThread3.start();
        countThread4.start();
        countThread5.start();
        countThread6.start();
    }
}

