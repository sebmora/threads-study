package countdown;

public class CountThread extends Thread {
    private static final int SLEEP_TIME_MILIS = 100;

    private int count;
    private LaneEnum lane;

    public CountThread(int count, LaneEnum lane) {
        this.count = count;
        this.lane = lane;
    }

    @Override
    public void run() {
        try {
            for (int i = count; i > 0; i--) {
                System.out.printf(lane.getSpaces() + i + "\n");
                Thread.sleep(SLEEP_TIME_MILIS);
            }
            System.out.printf("%sT[%s]\n", lane.getSpaces(), lane.getNumber());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
