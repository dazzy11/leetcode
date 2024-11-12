public class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Sort items by price ,
        // if they have same price -> then sort by beauty in descending order

        Arrays.sort(items,(a,b)-> a[0]==b[0]? b[1]-a[1] : a[0]-b[0]);
        int currMaxBeauty=0;


        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int[] item:items)
        {
            int price=item[0];
            int beauty=item[1];

            if(currMaxBeauty>=beauty)
              continue;
            currMaxBeauty=beauty;
            map.put(price,currMaxBeauty);
            
        }

         int no_queries=queries.length;
        int[] answer=new int[no_queries];

        for(int i=0;i<no_queries;i++)
        {
            Map.Entry<Integer,Integer> entry=map.floorEntry(queries[i]);
            if(entry!=null)
            {
                answer[i]=entry.getValue();
            }
            else
            {
                answer[i]=0;
            }
        }
        return answer;
        
    }
}