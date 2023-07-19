public class MyList<T> {
    int capacity;
    T[] list;
    T[] listTemp;
    int listSize = 0;

    public MyList() {
        this.capacity = 10;
        this.setList();
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.setList();
    }

    public int size() {
        return this.listSize;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (this.size() < this.capacity) {
            list[this.listSize] = data;
            this.sizeCalculate();
        } else {
            this.capacity = this.capacity * 2;
            this.updateCapacity();
            this.add(data);
        }
    }

    public T get(int index) {
        T i = this.list[index];
        return i;
    }

    public void remove(int index) {
        replaceToRemove(index);
        this.listSize--;
    }

    public void set(int index, T data) {
        this.list[index] = data;
    }

    @Override
    public String toString() {
        System.out.print("[");
        for (T i : list) {
            if (i != null) {
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int lastIndex = -1;
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Object[] toArray() {
        Object[] tempObject = new Object[this.list.length];
        for (int i = 0; i < this.list.length; i++) {
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }

    public void clear() {
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> array = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            array.add((T) this.list[i]);
        }
        return array;
    }

    public boolean contains(T data) {
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                return true;
            }
        }
        return false;
    }

    public void setList() {
        this.list = (T[]) new Object[this.capacity];
    }

    public void updateCapacity() {
        this.listTemp = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.list.length; i++) {
            this.listTemp[i] = this.list[i];
        }
        this.list = this.listTemp;
    }

    public void sizeCalculate() {
        int x = 0;
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] != null) {
                x++;
            }
        }
        this.listSize = x;
    }

    public void replaceToRemove(int index) {
        T[] listTepm2 = this.list;
        this.list[index] = null;
        for (int i = 0; i < listTepm2.length - 1; i++) {
            if (index == 0) {
                this.list[i] = listTepm2[i + 1];
            } else if (index != 0 && i < index) {
                this.list[i] = listTepm2[i];
            } else if (index != 0 && i > index) {
                this.list[i] = listTepm2[i + 1];

            }
        }
    }

}