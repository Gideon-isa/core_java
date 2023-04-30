package school;

public class School {

    private String level;
    private boolean isBoarding;

    public School(String level, boolean isBoarding) {
        this.level = level;
        this.isBoarding = isBoarding;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public boolean isBoarding() {
        return isBoarding;
    }

    public void setBoarding(boolean boarding) {
        isBoarding = boarding;
    }

    @Override
    public String toString() {
        return "School{" +
                "level='" + level + '\'' +
                ", isBoarding=" + isBoarding +
                '}';
    }
}
