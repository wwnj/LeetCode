package minimumIndexSumOfTwoLists599;

/**
 * Created by wb on 2017/12/26.
 */
public class Main {
    public static void main(String[] args){
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        Solution solution = new Solution();
        for(String s:solution.findRestaurant(list1,list2))
            System.out.println(s);
    }
}
