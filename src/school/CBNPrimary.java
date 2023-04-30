package school;

public class CBNPrimary extends School{
    private String model;
    private boolean isMixed;


    public CBNPrimary(String level, boolean isBoarding, String model, boolean isMixed) {
        super(level, isBoarding);
        this.model = model;
        this.isMixed = isMixed;

    }

    @Override
    public String toString() {
        return "CBNPrimary{" +
                "model='" + model + '\'' +
                ", isMixed=" + isMixed +
                '}';
    }

    public static void main(String[] args) {
        CBNPrimary mySchool = new CBNPrimary("Primary", false, "modern", true);
        System.out.println(mySchool);
    }
}
