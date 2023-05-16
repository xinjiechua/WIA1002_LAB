package LAB07b.Q3;

public class ComparableBook implements Comparable<ComparableBook> {
    private Integer id;
    private String title;

    public ComparableBook(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
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

