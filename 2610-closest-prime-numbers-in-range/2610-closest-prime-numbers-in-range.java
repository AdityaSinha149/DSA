class Solution {
    private static List<Integer> sieve(int left, int right) {
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = Math.max(2, left); i <= right; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    public int[] closestPrimes(int left, int right) {
        List<Integer> primes=sieve(left, right);
        if(primes.size()<2)return new int[] {-1,-1};
        int [] ans=new int[] {primes.get(0),primes.get(1)};
        for(int i=1;i<primes.size()-1;i++){
            int newMin=primes.get(i+1)-primes.get(i);
            if(ans[1]-ans[0]>newMin)ans=new int[]{primes.get(i),primes.get(i+1)};
        }
        return ans;
    }
}