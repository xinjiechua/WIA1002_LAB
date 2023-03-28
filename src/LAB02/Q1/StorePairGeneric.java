package LAB02.Q1;

public class StorePairGeneric <T extends Comparable<T>> implements Comparable<StorePairGeneric<T>> {
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setPair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public String toString() {
        return "first = " + first + " second = " + second;
    }

    @Override
    public boolean equals(Object b) {
        if (b instanceof StorePairGeneric){
            StorePairGeneric<T> t = (StorePairGeneric) b;
            return first.equals(t.first);
        }
        return false;
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return first.compareTo(o.first);
    }
}
