
import java.util.*;


public class Util_package{
    public static void main(String[] args) {
        
        //          List<T> Methods
        List<Integer> list = new ArrayList<>(Arrays.asList(5,2,1,9));
        boolean removeByValue = list.remove(Integer.valueOf(5));
        System.out.println("Removed index  "+ list);
        list.addAll(Arrays.asList(8,6));
        System.out.println("Updated list after removal and addAll "+ list);
        list.retainAll(Arrays.asList(1,2));
        System.out.println("Intersection of two list "+ list);

        // Iterator and ListIterator
        
        Iterator<Integer> iter = list.iterator();
        
        while(iter.hasNext()) if(iter.next() % 2== 0) iter.remove();
        System.out.println("After removal "+ list);
        
        ListIterator<Integer> listIter = list.listIterator();
        while(listIter.hasNext()) if(listIter.next() == 1) listIter.set(10);
        System.out.println("After listIterator modification : "+ list);
        
        // Comaprator with custom sort
        int[][] points = {{1,2},{3,1},{2,3}};
        Arrays.sort(points, (a,b) -> a[1] - b[1]);
        System.out.println("Sorted 2D arrays by second value ");
        for(int[] p : points) System.out.println(Arrays.toString(p));

        // Collections utillity
        List<Integer> utilList = new ArrayList<>(Arrays.asList(5,1,3,4));
        
        Collections.swap(utilList, 0, 2);
        Collections.shuffle(utilList);
        
        Collections.reverse(utilList);
        int freq = Collections.frequency(utilList, 3);
        System.out.println("Frequency of 3 is : "+ freq);
        Collections.fill(utilList, 7);
        System.out.println("Updated utilList "+ utilList);
        
        Collections.copy(destination_list, source_list);
        Collections.rotate(utilList,1);

        int binSearch = Collections.binarySearch(utilList, 3);
        System.out.println("BinarySearch in collections "+binSearch);


        List<Integer> nums = new ArrayList<>(Arrays.asList(7,4,2,7,4,7));
        Collections.replaceAll(nums, 7 , 1);
        System.out.println("After replaceAll 7->1 "+ nums);

        // MIN MAX
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        
       //  =========== Arrays Utility =============
       int[] arr = {4,1,7,3};
       int idx = Arrays.binarySearch(arr, 1);
       System.out.println("Binary search in arrays :"+ idx);


       // Arrays Utility
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
       int index = Arrays.binarySearch(arr, 2);
       System.out.println("Index of target element 2 is  "+ index);

       int[] copyArr = Arrays.copyOf(arr,  arr.length);
       System.out.println();
        

        

        // BitSet
        
    }
}