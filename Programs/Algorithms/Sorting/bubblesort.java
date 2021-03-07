public class bubblesort {  
    static void bubbleSort(int[] array) {  
        int x = array.length;  
        int temp = 0;  
        for(int i = 0; i < x; i++) {  
            for(int j = 1; j < (x - i); j++) {  
                if(array[j - 1] > array[j]) {   
                    temp = array[j - 1];  
                    array[j - 1] = array[j];  
                    array[j] = temp;  
                    }  
                }  
            }  
        }  
    public static void main(String[] args) {  
        int array[] = {1,6464646,334867,633,96876,8764,51};  
                 
        System.out.println("Before Bubble Sort: ");  
        for(int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " ");  
        }  
        System.out.println();

        bubbleSort(array);
                 
        System.out.println("After Bubble Sort: ");

        for(int i = 0; i < array.length; i++) {  
            System.out.print(array[i] + " ");  
        }  
    }  
} 