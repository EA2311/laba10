package onpu;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the number of coordinates:");
        int num = sc.nextInt();
        if(num<1){
            System.out.println("Please, enter the correct number of coordinates:");
            num = sc.nextInt();
        }
        ArrayList<Coordinates> list = new ArrayList<Coordinates>();
        for (int i = 0; i < num; i++) {
            System.out.println("Please, enter the coordinates:");
            list.add(new Coordinates(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list, new CoordinatesComparator());
        System.out.println("Your sorted coordinates are here:");
        for (int i=0; i<list.size(); i++)
            System.out.println(list.get(i));
    }
}



