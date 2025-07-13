class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);

        int start = 0;
        int end = players.length-1;
        int index = 0;

        while(start <= end)
        {
            for(int i = index; i < trainers.length; i++)
            {
                if(players[start] <= trainers[i])
                {
                    System.out.println(players[start] +" "+ trainers[i]);
                    count++;
                    index = i+1;
                    break;
                }
            }

            start++;
        }

        return count;
    }
}