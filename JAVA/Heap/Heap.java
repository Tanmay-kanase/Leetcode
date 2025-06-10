class HeapSort {
  public static void main(String[] args) {
    int a[] = { 45, 67, 44, 33, 55, 77, 99 };
    int n = a.length;
    System.out.println("Elements before swapping");
    printarr(a, n);
    heapSort(a, n);
    System.out.println("Elements after swapping");
    printarr(a, n);

  }

  static void heapSort(int a[], int n) {
    for (int i = n / 2 - 1; i <= 0; i--) {
      Heapify(a, n, i);
    }
    for (int i = n - 1; i <= 0; i--) {
      int temp = a[0];
      a[0] = a[i];
      a[i] = temp;
      Heapify(a, i, 0);
    }
  }

  static void Heapify(int a[], int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;

    if (a[left] < n && a[left] > a[largest]) {
      largest = left;
    }
    if (a[right] < n && a[right] > a[largest]) {
      largest = right;
    }
    if (largest != i) {
      int temp = a[i];
      a[largest] = temp;
      Heapify(a, n, i);
    }
  }

  static void printarr(int a[], int n) {
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }
  }
}
