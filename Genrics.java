class Bubblesort <T extends Comparable<T>>{
    void sort(T arr[]){
        for(int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if(arr[j-1].compareTo(arr[j])>0){
                    T temp;
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    void display(T [] arr){
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        // String array
        String[] stringArray = {"banana", "apple", "orange", "grapes", "pineapple"};
        Bubblesort<String> stringBubbleSort = new Bubblesort<>();
        System.out.println("Original String Array:");
        stringBubbleSort.display(stringArray);
        stringBubbleSort.sort(stringArray);
        System.out.println("Sorted String Array:");
        stringBubbleSort.display(stringArray);

        // Integer array
        Integer[] intArray = {5, 2, 8, 1, 3};
        Bubblesort<Integer> intBubbleSort = new Bubblesort<>();
        System.out.println("\nOriginal Integer Array:");
        intBubbleSort.display(intArray);
        intBubbleSort.sort(intArray);
        System.out.println("Sorted Integer Array:");
        intBubbleSort.display(intArray);

        // Double array
        Double[] doubleArray = {3.5, 1.2, 4.8, 2.3, 5.7};
        Bubblesort<Double> doubleBubbleSort = new Bubblesort<>();
        System.out.println("\nOriginal Double Array:");
        doubleBubbleSort.display(doubleArray);
        doubleBubbleSort.sort(doubleArray);
        System.out.println("Sorted Double Array:");
        doubleBubbleSort.display(doubleArray);
    }
}
