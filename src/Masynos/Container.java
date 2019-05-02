package Masynos;

public class Container <T>{
    private  int size;
    private T[] elements;

    public Container(){
        elements = (T[]) new Object[10];
        size=0;
    }

//    public void add(T o){
//        if (size<elements.length){
//            elements[size] = o;
//        } else {
//
//        }
//        ++size;
//    }

    public T get(int index){
        if (index >= size)
            throw new IndexOutOfBoundsException("Index: "+ index +" size");
        return (T)elements[index];
    }

}