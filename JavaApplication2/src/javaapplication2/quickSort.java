/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author wakar
 */
public class quickSort {
    int partition(int n[], int low, int high) {

    // select last element as pivot
    int pivot = n[high];

    // initialize the second pointer
    int i = (low - 1);

    // Put the elements smaller than pivot on the left and
    // greater than pivot on the right of pivot
    for (int j = low; j < high; j++) {

      // compare all elements with pivot
      // swap the element greater than pivot
      // with element smaller than pivot
      // to sort in descending order
      // if (array[j] >= pivot)
      if (n[j] <= pivot) {

        // increase the second pointer if
        // smaller element is swapped with greater
        i++;
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
      }
    }

    // put pivot in position
    // so that element on left are smaller
    // element on right are greater than pivot
    int temp = n[i + 1];
    n[i + 1] = n[high];
    n[high] = temp;
    return (i + 1);
  }
    void quickSort(int n[], int low, int high) {
    if (low < high) {

      // Select pivot position and put all the elements smaller
      // than pivot on the left and greater than pivot on right
      int pi = partition(n, low, high);

      // sort the elements on the left of the pivot
      quickSort(n, low, pi - 1);

      // sort the elements on the right of pivot
      quickSort(n, pi + 1, high);
    }
    }
}
