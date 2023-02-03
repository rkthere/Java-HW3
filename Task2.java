import java.util.ArrayList;
import java.util.Random;

public class Task2 {
	public static void main(String[] args) {
	    Random rd = new Random();
	    
	    System.out.println("\n\nЗадание 2.");
	    ArrayList<Integer> list2 = new ArrayList<Integer>();
	    for (int i = 0; i < 10; i++)
	        list2.add(rd.nextInt(1000));
	    System.out.print("Исходный список: ");
	    for (int i = 0; i < list2.size(); i++)
            System.out.printf("%d ", list2.get(i));
        int j = 0;
        while (j < list2.size()) {
            if (list2.get(j) % 2 == 0)
                list2.remove(j);
            else
                j++;
        }
        System.out.print("\nСписок после удаления четных: ");
	    for (int i = 0; i < list2.size(); i++)
            System.out.printf("%d ", list2.get(i));
	}
}
