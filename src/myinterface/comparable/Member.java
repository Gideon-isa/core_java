package myinterface.comparable;


/**
 *
 */

/**
 * Comparable interface which should be implemented by any custom class if we want to
 * use Arrays or Collections sorting methods. The Comparable interface has compareTo(T obj) method
 * which is used by sorting methods, you can check any Wrapper, String or Date class to confirm this.
 */
public class Member implements Comparable<Member>{
    private String name;
    private int height;

    public Member(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public int compareTo(Member member) {
        if (this.height == member.height) {
            return 0;
        } else if (this.height > member.height) {
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
