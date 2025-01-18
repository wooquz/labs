public class SelectionSort {

    public static void selectionSort(int[] array) {
        int n = array.length;

        // чек всех элементов
        for (int i = 0; i < n - 1; i++) {
            
            int minIndex = i;

            // мин элемент в ласт части массива
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j; // апдейт индекса мин элемента
                }
            }

            // свап текщего и мин найденного элем
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};

        System.out.println("Исходный массив:");
        printArray(array);

        selectionSort(array);

        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}
