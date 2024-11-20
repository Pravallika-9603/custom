package org.neoteric.java;

public class HMTest {


        public static void main(String[] args) {
            CustomHM map = new CustomHM();

            map.put(1, 25);
            map.put(2,12);
            map.put(3, 25);
            map.put(4,12);
            map.put(5, 25);
            map.put(6,12);
            map.put(7, 25);
            map.put(8,12);
            map.put(9, 25);
            map.put(10,12);
            map.put(11, 25);
            map.put(12,12);
            map.put(13, 25);
            map.put(14,12);
            map.put(15, 25);
            map.put(16,12);
            map.put(17, 35);
            map.put(18,12);
            map.put(19, 25);
            map.put(20,12);
            map.put(21, 25);
            map.put(22,12);

//            System.out.println(map.get(16));
//            System.out.println(map.get(32));
//
//            System.out.println(map.get(16).hashCode());
//            System.out.println(map.get(32).hashCode());

            System.out.println(map.get(1));
           map.remove(1);
            System.out.println(map.get(1));
            //System.out.println(map.get(32));

        }
    }



