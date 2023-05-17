package LAB07b.Q3;

public class ComparableBook implements Comparable<ComparableBook> {
    private Integer id;
    private String title;

    public ComparableBook(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public int compareTo(ComparableBook other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "[" + id + ": " + title + "]";
    }
}

