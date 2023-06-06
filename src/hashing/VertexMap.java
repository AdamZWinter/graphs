package hashing;

import java.util.Arrays;

//T is the type of our vertices in the graph
public class VertexMap<T> {

    //these will govern how the hashtable fills
    public static final int INITIAL_CAPACITY = 10;
    private static final double MAX_LOAD_FACTOR = 0.7;
    private  Pair[] table;

    // used = size
    private int size;
    public VertexMap(){
        table = new Pair[INITIAL_CAPACITY];
    }
    public void add(T vertex, int index){
        Pair element = new Pair(vertex, index);

        //find a spot for the element
        int code = element.hashCode();
        int position = code % table.length;

        //probe for collision
        while(table[position] != null){
            position = (position + 1) % table.length;
//            position++;
//            if(position == table.length){
//                position = 0;
//            }
        }

        table[position] = element;
    }

    @Override
    public String toString() {
        return Arrays.toString(table);
    }

    private static class Pair{
        private Object vertex;
        private int index;

        public Pair(Object vertex, int index){
            this.vertex = vertex;
            this.index = index;
        }

        public String toString(){
            return "(" + vertex + ", " + index + ")";
        }
    }
}
