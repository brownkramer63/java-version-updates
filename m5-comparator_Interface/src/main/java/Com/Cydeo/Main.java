package Com.Cydeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    List<Integer> list = Arrays.asList(10,0,14,5,67);
        System.out.println(list);

        Collections.sort(list);

        for (Integer each :list
             ) {
            System.out.println(each);
        }
//decending order
        Collections.sort(list, new MyComparator());
        System.out.println(list);



}}
