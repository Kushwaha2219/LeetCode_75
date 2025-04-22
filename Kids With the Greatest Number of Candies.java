class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> list = new ArrayList<>(); 
        int flag = 0;
        for(int i = 0 ; i < candies.length; i++){
            for(int j = 0 ; j < candies.length; j++){
                if((candies[i] + extraCandies) >= candies[j]) flag = 0;
                else {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) list.add(true);
            else list.add(false);
        }
        return list;
    }
}
