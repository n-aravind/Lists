import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        for (int i = 0; i < 11; i++){
            numList.add(i);
        }
        System.out.println("######## SHUFFLE ########");
        Collections.shuffle(numList);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## SORT ########");
        Collections.sort(numList);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## Binary Search ########");
        System.out.println(Collections.binarySearch(numList,9));
        System.out.println("######## REVERSE ########");
        Collections.reverse(numList);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## ROTATE ########");
        Collections.rotate(numList,6);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## SWAP ########");
        Collections.swap(numList,0,1);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## REPLACE ALL ########");
        Collections.replaceAll(numList,10,25);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## COPY ########");
        for (int i = 0; i < 11; i++){
            newList.add(0);
        }
        Collections.copy(newList,numList);
        newList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## FILL ########");
        Collections.fill(numList,99);
        numList.forEach(e -> System.out.print(e + "\t"));
        System.out.println("\n######## INDEX OF SUBLIST ########");
        List<String> srcList = new ArrayList<>();
        srcList.add("A");
        srcList.add("B");
        srcList.add("C");
        srcList.add("D");
        srcList.add("E");
        srcList.add("B");
        srcList.add("C");
        srcList.add("D");
        List<String> subList = new ArrayList<>();
        subList.add("B");
        subList.add("C");
        subList.add("D");
        System.out.println("First occurrence of Sub list starts at index : " + Collections.indexOfSubList(srcList,subList));
        System.out.println("######## LAST INDEX OF SUBLIST ########");
        System.out.println("Last occurrence of Sub list starts at index : " + Collections.lastIndexOfSubList(srcList,subList));
    }
}
