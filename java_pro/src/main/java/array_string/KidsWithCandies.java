package array_string;


import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
	
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		 int max=0;
	        List<Boolean> list=new ArrayList<>();

	        for(int i:candies){
	            max=Math.max(i,max);
	        }

	        for(int i=0;i<candies.length;i++){
	            if( (candies[i]+extraCandies) >= max){
	                list.add(true);
	            }else{
	                list.add(false);
	            }
	        }

	        return list;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies= {4,2,1,1,2};
		int extraCandies =1;
		System.out.println(kidsWithCandies(candies,extraCandies));

	}

}
