/*Wakar Molar 1700235744
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Arrays;
import java.io.FileWriter;   
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author wakar
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      display(); 
    }
    public static void display(){
         Scanner sc= new Scanner(System.in);
       int options;
       System.out.println("Select an option from  the list provided\n1.Bubble Sort 2. Quick Sort "
               + "3. Selection Sort 4.Heap Sort 5. Insertion Sort 6. Merge Sort 7.Exit");
        //options= sc.nextInt();
    if(sc.hasNextInt()){
  options = sc.nextInt();
   switch(options) {
  case 1:
    System.out.println("Bubble Sort");
    bubbleSort();
    Continue();
    break;
  case 2:
    System.out.println("Quick Sort");
    quicksort();
    Continue();
    break;
    
  case 3:
    System.out.println("Selection Sort");
    SelectionSort();
    Continue();
    break;
  case 4:
    System.out.println("Heap Sort");
    heapSort();
    Continue();
    break;
  case 5:
    System.out.println("Insertion Sort");
    insertionSort();
    Continue();
    break; 
  case 6:
    System.out.println("Merge Sort");
    mergeSort();
    Continue();
    break; 
  case 7:
    System.out.println("Exit!");
    System.exit(0);
    break;
    
    
  default:
    System.out.println("Error! Option Not Valid");
    display();
}
}else{
  System.out.println("Error! Please select a NUMBER!");
  display();
}
       
      } 
    public static void Continue(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Do you want to continue, 1 = yes \t 2=no: ");
        //int opt = sc.nextInt();
        int opt;
if(sc.hasNextInt()){
  opt = sc.nextInt();
   switch(opt) {
  case 1:
       display();
    break;
  case 2:
    System.exit(0);
    break;
  default:
    System.out.println("Error! Option Not Valid");
    Continue();
}
}else{
  System.out.println("Not a valid number");
  Continue();
}
       
        
    }
    public static void bubbleSort(){
        Scanner sc= new Scanner(System.in);
       
        Random g = new Random();
        System.out.println("Enter the number of elements in the array: ");
        //int n = sc.nextInt();
                int n;
        if(sc.hasNextInt()){
          n = sc.nextInt();
          int [] number = new int [n];
         long start = System.nanoTime(); 
        try {
      FileWriter myWriter = new FileWriter("BubbleSort.txt");
      
      myWriter.write("Bubble Sort\n\n");
      myWriter.write("Random Numbers:");
        for (int d = 0 ; d<number.length ; d++){
            int RandomG = g.nextInt(10)+1;
            number[d] = RandomG;
            myWriter.write(" " +RandomG);
            }

        myWriter.write("\nSorted Numbers:"+Arrays.toString(BubbleSort(number)));
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        try {
      File myObj = new File("BubbleSort.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        long end = System.nanoTime(); 
        System.out.println("Length of time to do a bubble sort for "+ number.length+ " numbers takes " + (end - start)/1000000 + "ms");
        }else{
          System.out.println("Not a valid number");
          bubbleSort();
        }
        
    }
    
    public static int [] BubbleSort(int[] number){
        int temp;

        for(int i = 0 ; i < number.length ; i++){
            for (int j = 1 ; j < number.length - i ; j++){
            if (number[j-1] > number[j]){
                    temp = number[j-1];
                    number[j-1] = number[j];
                    number[j] = temp;
                }
            }
        }
        return number;  
    }

   public static void quicksort(){
        Scanner sc= new Scanner(System.in);
        Random g = new Random();
        System.out.println("Enter the number of elements in the array: ");
        //int number = sc.nextInt();
        int number;
if(sc.hasNextInt()){
  number = sc.nextInt();
  int [] n = new int [number];
        
        quickSort q = new quickSort();
    try {
      FileWriter myWriter = new FileWriter("QuickSort.txt");
      
      myWriter.write("Quick Sort\n\n");
      myWriter.write("Random Numbers:");
        for (int i=0; i<n.length; ++i)
        {
             int RandomG = g.nextInt(10)+1;
            n[i] = RandomG;
            myWriter.write(n[i]+" "); 
        
        }
         q.quickSort(n, 0, n.length - 1);
         
        myWriter.write("\nSorted Numbers:"+Arrays.toString(n));
        myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    long start = System.nanoTime();
    try {
      File myObj = new File("QuickSort.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    long end = System.nanoTime(); 
        System.out.println("Length of time to do a quick sort for "+ n.length+ " numbers takes " + (end - start)/1000000 + "ms");
    
}else{
  System.out.println("Not a valid number");
  quicksort();
}
        
   }
   
   public static void SelectionSort(){
       Scanner sc= new Scanner(System.in);
        Random g = new Random();
        System.out.println("Enter the number of elements in the array: ");
        //int number = sc.nextInt();
        int number;
        if(sc.hasNextInt()){
          number = sc.nextInt();
          System.out.println("Valid number");
           int [] n = new int [number];
    
        Selectsort s = new Selectsort();
    try {
      FileWriter myWriter = new FileWriter("SelectionSort.txt");
      
      myWriter.write("Selection Sort\n\n");
      myWriter.write("Random Numbers:");
        for (int i=0; i<n.length; ++i)
        {
             int RandomG = g.nextInt(10)+1;
            n[i] = RandomG;
            myWriter.write(n[i]+" "); 
        
        }
         s.sort(n);
         
        myWriter.write("\nSorted Numbers:"+Arrays.toString(n));
        myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    long start = System.nanoTime();
    try {
      File myObj = new File("SelectionSort.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    long end = System.nanoTime(); 
        System.out.println("Length of time to do a selection sort for "+ n.length+ " numbers takes " + (end - start)/1000000 + "ms");
        }else{
          System.out.println("Not a valid number");
          SelectionSort();
        }
    
    }
   
   public static void insertionSort(){
            Scanner sc= new Scanner(System.in);
        Random g = new Random();
        System.out.println("Enter the number of elements in the array: ");
       // int number = sc.nextInt();
       int number;
if(sc.hasNextInt()){
  number = sc.nextInt();
  System.out.println("Valid number");
  int [] n = new int [number];
    
        InsertionSort s = new InsertionSort();
    try {
      FileWriter myWriter = new FileWriter("InsertionSort.txt");
      
      myWriter.write("Insertion Sort\n\n");
      myWriter.write("Random Numbers:");
        for (int i=0; i<n.length; ++i)
        {
             int RandomG = g.nextInt(100)+1;
            n[i] = RandomG;
            myWriter.write(n[i]+" "); 
        
        }
         s.sort(n);
         
        myWriter.write("\nSorted Numbers:"+Arrays.toString(n));
        myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    long start = System.nanoTime();
    try {
      File myObj = new File("InsertionSort.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    long end = System.nanoTime(); 
        System.out.println("Length of time to do a insertion sort for "+ n.length+ " numbers takes " + (end - start)/1000000 + "ms");
    
}else{
  System.out.println("Not a valid number");
  insertionSort();
}
        
   }
   
    public static void mergeSort(){
            Scanner sc= new Scanner(System.in);
        Random g = new Random();
        System.out.println("Enter the number of elements in the array: ");
        //int number = sc.nextInt();
        int number;
if(sc.hasNextInt()){
  number = sc.nextInt();
 int [] n = new int [number];
    
        mergesort m = new mergesort();
    try {
      FileWriter myWriter = new FileWriter("MergeSort.txt");
      
      myWriter.write("Merge Sort\n\n");
      myWriter.write("Random Numbers:");
        for (int i=0; i<n.length; ++i)
        {
             int RandomG = g.nextInt(100)+1;
            n[i] = RandomG;
            myWriter.write(n[i]+" "); 
        
        }
         m.sort(n, 0, n.length - 1);
         
        myWriter.write("\nSorted Numbers:"+Arrays.toString(n));
        myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    long start = System.nanoTime();
    try {
      File myObj = new File("MergeSort.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    
    long end = System.nanoTime(); 
        System.out.println("Length of time to do a Merge sort for "+ n.length+ " numbers takes " + (end - start)/1000000 + "ms");
  
}else{
  System.out.println("Not a valid number");
  
  mergeSort();
}
        
   }
     public static void heapSort(){
            Scanner sc= new Scanner(System.in);
        Random g = new Random();
        System.out.println("Enter the number of elements in the array: ");
        //int number = sc.nextInt();
        int number;
if(sc.hasNextInt()){
  number = sc.nextInt();
  int [] n = new int [number];
    
        heapsort h = new heapsort();
    try {
      FileWriter myWriter = new FileWriter("HeapSort.txt");
      
      myWriter.write("Selection Sort\n\n");
      myWriter.write("Random Numbers:");
        for (int i=0; i<n.length; ++i)
        {
             int RandomG = g.nextInt(100)+1;
            n[i] = RandomG;
            myWriter.write(n[i]+" "); 
        
        }
         h.sort(n);
         
        myWriter.write("\nSorted Numbers:"+Arrays.toString(n));
        myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    long start = System.nanoTime();
    try {
      File myObj = new File("HeapSort.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) 
        {
      System.out.println("An error occurred.");
      e.printStackTrace();
        }
    
    long end = System.nanoTime(); 
        System.out.println("Length of time to do a Heap sort for "+ n.length+ " numbers takes " + (end - start)/1000000 + "ms");
}else{
  System.out.println("Not a valid number");
  heapSort();
}   
   }
   }
