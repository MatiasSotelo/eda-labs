class MergeSort{
    public static void mergeSort(int[] arr, int lo, int hi) {
        if(lo >= hi) {
            return;
        }
        System.out.print(lo);
        System.out.print(" ");
        System.out.print(hi);
        System.out.print(" \n");

        int mid = lo + (hi - lo + 1)/2;
        mergeSort(arr, lo, mid - 1);
        mergeSort(arr, mid, hi);
    } 
    public static void merge() {
        
    }
    public static void main(String[] args) {
        int[] arr = new int[4];
        for(int i = 0; i < 4; ++i) {
            arr[i] = i;
        }
        mergeSort(arr, 0, 3);
    }
}