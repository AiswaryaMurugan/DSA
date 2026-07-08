package Day3;

import java.util.Arrays;

import java.util.TreeSet;

public class DemoComparator {
    public static void main(String[] args) {
        Integer[] arr= {90,45,67,12,78};
        // Arrays.sort(arr,new DesArray());
        Arrays.sort(arr,(o1,o2)->o2.compareTo(o1));
        System.out.println(Arrays.toString(arr));
        String[] codes = {
            "Wipro","Capgemini","Deloite","Accenture"
        };
        TreeSet<String> sets=new TreeSet<>((o1,o2)->o2.compareTo(o1));
        for(String each:codes) sets.add(each);
        System.out.println(sets);
    }
}
