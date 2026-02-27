public class QuickSort {

    // Método principal para probar el algoritmo
    public static void main(String[] args) {

        int[] arreglo = {64, 34, 25, 12, 22, 11, 90, 5};

        System.out.println("Arreglo original:");
        printArray(arreglo);

        // Llamada al método quickSort
        quickSort(arreglo, 0, arreglo.length - 1);

        System.out.println("\nArreglo ordenado:");
        printArray(arreglo);
    }

    // Método QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Obtener índice de partición
            int pi = partition(arr, low, high);

            // Ordenar recursivamente las dos mitades
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Método partition usando el último elemento como pivote
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // pivote
        int i = low - 1;       // índice del elemento más pequeño

        for (int j = low; j < high; j++) {

            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivot) {
                i++;

                // intercambiar arr[i] con arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // intercambiar el pivote con arr[i+1]
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Método auxiliar para imprimir el arreglo
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}