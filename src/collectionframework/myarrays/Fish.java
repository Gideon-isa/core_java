package collectionframework.myarrays;

public class Fish {
    String name;
    String type;

    public Fish(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
