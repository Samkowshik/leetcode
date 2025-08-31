class Solution 
{
    boolean canBuild(String[] words, int[] frq, int ele)
    {
        int i = 0;
        int[] tempFrq = Arrays.copyOf(frq, frq.length);

        while(ele>0)
        {
            if((ele&1) == 1)
            {
                for(char c : words[i].toCharArray())
                if((tempFrq[c-'a']--) == 0)
                return false;
            }
            ele >>= 1;
            i++;
        }

        return true;
    }
    int findScore(int[] wordScores, int ele)
    {
        int i = 0, sum = 0;
        while(ele>0)
        {
            if((ele&1) == 1)
            sum += wordScores[i];
            ele >>= 1;
            i++;
        }

        return sum;
    }

    public int maxScoreWords(String[] words, char[] letters, int[] score) 
    {
        int[] frq = new int[26];
        for(char letter : letters)
        frq[letter-'a']++;

        int n = words.length;
        int[] wordScores = new int[n];
        for(int i=0; i<n; i++)
        {
            int wordScore = 0;
            for(int j=0; j<words[i].length(); j++){
                wordScore += score[words[i].charAt(j)-'a'];
            }
            wordScores[i] = wordScore;
        }
        System.out.println(Arrays.toString(wordScores));

        int max = 0, tempScore= 0;
        for(int i=0; i<(1<<n); i++)
        {
            tempScore = findScore(wordScores, i);
            if(tempScore > max && canBuild(words, frq, i))
            max = tempScore;
            // System.out.println(i+" "+);
        }

        return max;
    }
}