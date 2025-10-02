class Solution
{
    public int maxBottlesDrunk(int bottles, int numExchange) 
    {
        int drunk = bottles;
        while(bottles >= numExchange){
            drunk ++; 
            bottles = bottles - numExchange + 1;
            numExchange++;
        }
        return drunk;
    }
}