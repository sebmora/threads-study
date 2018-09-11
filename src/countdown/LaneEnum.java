package countdown;

public enum LaneEnum {
    LANE_1(1, "\t"),
    LANE_2(2, "\t\t"),
    LANE_3(3, "\t\t\t"),
    LANE_4(4, "\t\t\t\t"),
    LANE_5(5, "\t\t\t\t\t"),
    LANE_6(6, "\t\t\t\t\t\t"),
    LANE_7(7, "\t\t\t\t\t\t\t"),
    LANE_8(8, "\t\t\t\t\t\t\t\t"),
    LANE_9(9, "\t\t\t\t\t\t\t\t\t");

    private int number;
    private String spaces;

    LaneEnum(int number, String spaces) {
        this.number = number;
        this.spaces = spaces;
    }

    public int getNumber() {
        return number;
    }

    public String getSpaces() {
        return spaces;
    }
}
