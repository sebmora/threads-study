package countdown;

public class CountRunnable implements Runnable {

    private static final int SLEEP_TIME_MILIS = 100;

    private int count;
    private LaneEnum lane;

    public CountRunnable(int count, LaneEnum lane) {
        this.lane = lane;
        this.count = count;
    }

    @Override
    public void run() {
        try {
            for (int i = count; i > 0; i--) {
                System.out.printf(lane.getSpaces() + i + "\n");
                Thread.sleep(SLEEP_TIME_MILIS);
            }
            System.out.printf("%sR[%s]\n", lane.getSpaces(), lane.getNumber());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
