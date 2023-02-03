import java.util.ArrayList;
import java.util.Random;

public class Task3 {
	public static void main(String[] args) {
	    Random rd = new Random();
	    
        System.out.println("\n\nЗадание 3.");
	    ArrayList<Integer> list3 = new ArrayList<Integer>();
	    for (int i = 0; i < 10; i++)
	        list3.add(rd.nextInt(1000));
	    System.out.print("Исходный список: ");
	    for (int i = 0; i < list3.size(); i++)
            System.out.printf("%d ", list3.get(i));
        int min = list3.get(0);
        int max = list3.get(0);
        double sum = list3.get(0);
        for (int i = 1; i < list3.size(); i++)
        {
            if (min > list3.get(i))
                min = list3.get(i);
            if (max < list3.get(i))
                max = list3.get(i);
            sum += list3.get(i);
        }
        System.out.printf("\nМинимум: %d Максимум: %d Среднее: %f",
            min, max, sum / list3.size());
	}
}
