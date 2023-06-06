package drivers;

import hashing.VertexMap;

public class Main {
    public static void main(String[] args) {
        VertexMap<String> map = new VertexMap<>();

        //This will have collisions because table.length is 10
        //and there is nothing handling collisions yet
        map.add("V", 0);
        map.add("A", 1);
        map.add("F", 2);
        map.add("P", 3);
        map.add("M", 4);
        map.add("Z", 5);


        System.out.println(map);

    }
}