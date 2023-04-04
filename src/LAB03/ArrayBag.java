package LAB03;

public class ArrayBag<T> implements BagInterface<T> {

    private T[] bag;
    private int numberOfEntries = 0;
    private final int DEFAULT_CAPACITY = 25;

    public ArrayBag(){
        bag = (T[]) new Object[DEFAULT_CAPACITY];
    }
    public ArrayBag(int size){
        bag = (T[]) new Object[size];
    }

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return numberOfEntries == DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {
        if(!isFull()) {
            bag[numberOfEntries++] = newEntry;
            return true;
        }
        return false;
    }

    @Override
    public T remove() {
        if(isEmpty())
            return null;
        T removed = bag[numberOfEntries-1];
        bag[--numberOfEntries] = null;
        return removed;
    }

    @Override
    public boolean remove(T anEntry) {
        if (isEmpty()) return false;
        boolean found = false;
        for(int i=0; i<getCurrentSize(); i++){
            if (bag[i].equals(anEntry)){
                found = true;
                // shift all remaining elements
                for (int j = i+1; j < getCurrentSize(); j++) {
                    bag[j-1] = bag[j];
                }
                bag[--numberOfEntries] = null;
                break;
            }
        }
        return found;
    }

    @Override
    public void clear() {
        bag = (T[]) new Object[bag.length];
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(int i=0; i<getCurrentSize(); i++){
            if (anEntry.equals(bag[i])) count++;
        }
        return count;
    }

    @Override
    public boolean contains(T anEntry) {
        for(int i=0; i<getCurrentSize(); i++){
            if (anEntry.equals(bag[i])) return true;
        }
        return false;
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] res = (T[]) new Object[numberOfEntries];
        System.arraycopy(bag, 0, res, 0, numberOfEntries);
        return res;
    }

    public BagInterface<T> union(BagInterface<T> another) {
        ArrayBag<T> anotherBag = (ArrayBag<T>) another;
        int newSize = getCurrentSize() + anotherBag.getCurrentSize();
        BagInterface<T> unionBag = new ArrayBag<>(newSize);

        for (int i = 0; i < getCurrentSize(); i++) {
            unionBag.add(bag[i]);
        }
        for (int i = 0; i < anotherBag.getCurrentSize(); i++) {
            unionBag.add(anotherBag.bag[i]);
        }
        return unionBag;
    }

    public BagInterface<T> intersection(BagInterface<T> another) {
        ArrayBag<T> anotherBag = (ArrayBag<T>) another;
        BagInterface<T> intersectionBag = new ArrayBag<>();

        for (int i = 0; i < getCurrentSize(); i++) {
            if (intersectionBag.contains(bag[i])) continue;
            if (anotherBag.contains(bag[i])){
                int count = Math.min(getFrequencyOf(bag[i]), anotherBag.getFrequencyOf(bag[i]));
                for (int j = 0; j < count; j++) {
                    intersectionBag.add(bag[i]);
                }
            }
        }
        return intersectionBag;
    }


    public BagInterface<T> difference(BagInterface<T> another) {
        ArrayBag<T> anotherBag = (ArrayBag<T>) another;
        BagInterface<T> differenceBag = new ArrayBag<>();

        for (int i = 0; i < getCurrentSize(); i++) {
            if (differenceBag.contains(bag[i])) continue;
            if (!anotherBag.contains(bag[i])){
                int count = getFrequencyOf(bag[i]);
                for (int j = 0; j < count; j++) {
                    differenceBag.add(bag[i]);
                }
            }else{
                int count1 = getFrequencyOf(bag[i]);
                int count2 = anotherBag.getFrequencyOf(bag[i]);
                for (int j = 0; j < Math.max(0, count1 - count2); j++) {
                    differenceBag.add(bag[i]);
                }
            }
        }
        return differenceBag;
    }

}
