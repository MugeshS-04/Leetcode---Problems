class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;

        int sum = 0;
        for(int i = 0; i < people.length; i++)
        {
            sum+=people[i];
            if(sum > limit)
            {
                System.out.println(people[i] +" "+ sum);
                sum = 0;
                count++;
                i--;
            }
        }

        if(sum > 0)
        {
            count++;
        }

        System.out.print(sum);

        return count;
    }
}