package Problem;

//   Given an array heights[], return all indices of buildings that can see the sunset from the right side
//   (i.e., ocean is on the right).
//A building can see the ocean if all buildings to its right are shorter.

import java.util.ArrayList;
import java.util.List;

public class SunnyBuildings {
    public static  int findBuildings(int[] heights){
       // List<Integer> ans = new ArrayList<>();
        int n = heights.length;

        int count = 0;
        int maxh = 0;

        for(int i = n - 1; i >= 0; i--){
            if(heights[i] >= maxh){
                count++;
                maxh = heights[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = {5, 2, 5, 1, 4, 3};
       // SunnyBuildings obj = new SunnyBuildings();
       // obj.findBuildings(heights);
        System.out.println(findBuildings(heights));

    }
}
