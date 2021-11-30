package map;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class CollectionsEx {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();

        myList.add("트랜스포머");
        myList.add("스타워즈");
        myList.add("매트릭스");
        myList.add("터미네이터");
        myList.add("아바타");

        System.out.print("리스트 순서 : ");
        for(String movie : myList) {
            System.out.print(movie + " | ");
        }

        System.out.println("\n오름차순 정렬 : ");
        Collections.sort(myList);
        printList(myList);

        // 검색
        int index = Collections.binarySearch(myList, "스타워즈");
        System.out.println("스타워즈는(은) " + (index+1) + "번째 입니다.");

        System.out.println("\n내림차순 정렬 : ");
        Collections.reverse(myList);
        printList(myList);
    }

    static void printList(List<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String element = it.next();
            String sep;
            if(it.hasNext())
                sep = " -> ";
            else
                sep = "\n";

            System.out.print(element + sep);
        }
    }

}


