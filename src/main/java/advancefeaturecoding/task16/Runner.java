package advancefeaturecoding.task16;

public enum Runner {
    BEGINNER(180, 240),
    INTERMEDIATE(120, 179),
    ADVANCED(60, 119),
    ;

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public static Runner getFitnessLEvel(int marathonTime) {
        for (Runner level : Runner.values()) {
            if (marathonTime >= level.getMinTime() && marathonTime <= level.getMaxTime())
                return level;
        }
        throw new IllegalArgumentException("Invalid marathon time: " + marathonTime);
    }
}
