package a1;

class BubbleSort {
    void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }



    void printArray(int[] arr) {
        int n = arr.length;
            for (int i = 0; i < n; ++i)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }


public class bSort
{
    public static void main(String[] args)
    {
        BubbleSort ob = new BubbleSort();
        int[] arr = { 3,7,9,5,99,45,67,2,56,90,34,97,77,38,121 };
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}
