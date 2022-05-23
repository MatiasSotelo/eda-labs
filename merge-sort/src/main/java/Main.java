package src.main.java;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 5, 2, 7};
        MergeSort<Integer> merge = new MergeSort<>(); 
        merge.sort(numbers, 0, 3);
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
