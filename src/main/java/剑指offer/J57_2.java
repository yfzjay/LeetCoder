package 剑指offer;

import java.util.ArrayList;

public class J57_2 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int low=1,high=2;
        while(low<high){
            int x=low+high;
            if(x==sum){
              ArrayList<Integer> tmp=new ArrayList<>();
              for(int k=low;k<=high;k++){
                  tmp.add(k);
              }
              res.add(tmp);
            }else if(x<sum){
                high++;
            }else{
                low++;
            }
        }
        return res;
    }
}
