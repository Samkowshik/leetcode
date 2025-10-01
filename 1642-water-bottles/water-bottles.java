class Solution 
{
    public int numWaterBottles(int bottles, int numExchange) 
    {
        int ans = bottles;
        while(bottles >= numExchange){
            ans += bottles/numExchange;
            bottles = bottles/numExchange + bottles%numExchange;
        }
        return ans;
    }
}