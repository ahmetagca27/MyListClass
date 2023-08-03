public class MyList<T> {
    int capacity;
    T[] list;
    T[] listTemp;
    int listSize = 0;

    //1. tür constructor metot
    public MyList() {
        this.capacity = 10;//Boş contructor tanımlandı ve dizinin başlangıç boyutu 10 olarak belirlendi.
        this.setList();
    }
    //2. tür constructor metot
    public MyList(int capacity) { //Dizinin başlangıç değeri capacity parametresinden alınmaktadır.
        this.capacity = capacity;
        this.setList();
    }

    public int size() {//dizideki eleman sayısını verir.
        return this.listSize;
    }

    public int getCapacity() {//dizinin kapasite değerini verir.
        return capacity;
    }

    public void add(T data) {              //sınıfa ait diziye eleman eklemek için kullanılır.
        if (this.size() < this.capacity) {//Eğer dizide yeteri kadar yer yok ise, dizi boyutu 2 katına çıkarılır.
            list[this.listSize] = data;
            this.sizeCalculate();
        } else {
            this.capacity = this.capacity * 2;
            this.updateCapacity();
            this.add(data);
        }
    }

    public T get(int index) {//verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
        T i = this.list[index];
        return i;
    }

    public void remove(int index) {          //verilen indisteki veriyi siler ve silinen indis sonrasındaki verileri sola doğru kaydırır.
        replaceToRemove(index);             // Geçersiz indis girilerse null döndürür.
        this.listSize--;
    }

    public void set(int index, T data) {    //verilen indisteki veriyi yenisi ile değiştirir
        this.list[index] = data;            // Geçersiz indis girilerse null döndürür.
    }

    @Override
    public String toString() {             // Sınıfa ait dizideki elemanları listeler.
        System.out.print("[");
        for (T i : list) {
            if (i != null) {
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
        return "";
    }

    public int indexOf(T data) {// Parametrede verilen nesnenin listedeki indeksini verir. Nesne listede yoksa -1 değerini verir.
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {// Belirtilen öğenin listedeki son indeksini söyler. Nesne listede yoksa -1 değerini verir.
        int lastIndex = -1;
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty() {//Listenin boş olup olmadığını bildirir.
        if (this.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Object[] toArray() {// Listedeki öğeleri, aynı sırayla bir array haline getirir.
        Object[] tempObject = new Object[this.list.length];
        for (int i = 0; i < this.list.length; i++) {
            tempObject[i] = this.list[i];
        }
        return tempObject;
    }

    public void clear() {//Listedeki bütün öğeleri siler, boş liste haline getirir.
        for (int i = 0; i < this.list.length; i++) {
            this.list[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {// Parametrede verilen indeks aralığına ait bir liste döner.
        MyList<T> array = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            array.add((T) this.list[i]);
        }
        return array;
    }

    public boolean contains(T data) {// Parametrede verilen değerin dizide olup olmadığını söyler.
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