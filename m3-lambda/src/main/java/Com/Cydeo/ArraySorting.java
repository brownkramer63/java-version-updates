package Com.Cydeo;

public class ArraySorting {
    public static void main(String[] args) {

        ArraySorting as  = new ArraySorting();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);


        Sorting quicksort= () -> System.out.println("Quick Sort");




    }
    private void sort(Sorting sorting){
       sorting.sort();
    }
}
