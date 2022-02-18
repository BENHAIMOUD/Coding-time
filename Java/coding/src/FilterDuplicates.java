import java.util.ArrayList;
import java.util.Arrays;

public class FilterDuplicates {
    public static <T> ArrayList<T> filterDuplicates(ArrayList <T> list){
        ArrayList <T> resultList = new ArrayList<>();
        for (T element : list){
            if (!resultList.contains(element)){
                resultList.add(element);
            }

        }
        return resultList;
    }
    public static  void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(1,23,4,5,6,4,1,3,2,4)
        );
        System.out.println("Table :"+ list);
        ArrayList<Integer> newList = filterDuplicates(list);
        System.out.println("Table filtered :"+ newList);

    }
}
