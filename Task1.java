import java.util.ArrayList;
import java.util.Random;

public class Task1 {
    static void merge(ArrayList<Integer> list, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        
        ArrayList<Integer> L = new ArrayList<Integer>();
        ArrayList<Integer> M = new ArrayList<Integer>();
        
        for (int i = 0; i < n1; i++)
            L.add(list.get(p + i));
        for (int i = 0; i < n2; i++)
            M.add(list.get(q + i + 1));
        
        int i = 0;
        int j = 0;
        int k = p;
        while (i < n1 && j < n2) {
            if (L.get(i) <= M.get(j))
                list.set(k, L.get(i++));
            else
                list.set(k, M.get(j++));
            k++;
        }
        
        while (i < n1)
            list.set(k++, L.get(i++));
        
        while (j < n2)
            list.set(k++, M.get(j++));
    }
    
    static void mergeSort(ArrayList<Integer> list, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(list, l, m);
            mergeSort(list, m + 1, r);
            merge(list, l, m, r);
        }
    }
    
	public static void main(String[] args) {
	    Random rd = new Random();
	    
	    System.out.println("Задание 1.");
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    for (int i = 0; i < 10; i++)
	        list.add(rd.nextInt(1000));
	    System.out.print("Исходный список: ");
	    for (int i = 0; i < list.size(); i++)
            System.out.printf("%d ", list.get(i));
        mergeSort(list, 0, list.size() - 1);
        System.out.print("\nСписок после сортировки слиянием: ");
	    for (int i = 0; i < list.size(); i++)
            System.out.printf("%d ", list.get(i));
	}
}
