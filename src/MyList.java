import java.util.Arrays;

public class MyList<T> {
    T arrayString[];
    int i, size=10;

    MyList(){
        size = 10;
        i = 0;
        //arrayString = new T[size];

    }

    public void add(T s){
        arrayString[i] = s;
        if(i== size-1) {
            newArray();
        }
        i++;
    }

    public void remove(T book){
        int j;
        for(j = 0 ; j < i;j++){
            if(arrayString[j] == String.valueOf(book)){
                arrayString[j] = null;
            }
        }
        int c;
        for(c=j; c<i ; c++){
            arrayString[c]=arrayString[c+1];
        }
        i--;
    }
    public void newArray(){
        int size = this.size * 2 , j;
        System.out.println(size);
        String[] arrayString1 = new String[size];
        for(j=0 ; j < this.size ; j++){
            arrayString1[j] = (String) arrayString[j];
        }
        this.size = size;
        arrayString = (T[]) arrayString1;
    }
    public void print(){
        System.out.println(Arrays.toString(arrayString));
    }
    public T getName1(){
        T s = arrayString[Library.n];
        return s;
    }
}
