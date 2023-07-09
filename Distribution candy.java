class Solution {
    public int distributeCandies(int[] candyType) { 
        int n=candyType.length;
        int maxCandies=n/2;
        Set<Integer> candySet=new HashSet<>();
        for(int candy: candyType){
            candySet.add(candy);
            if(candySet.size()== maxCandies){
                return maxCandies;

            }
        }
        return candySet.size()<maxCandies?candySet.size():maxCandies ;
        
    }
}