public class Problem7 {

    public static boolean primeTest(long n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        long testNumber = 2;
        int numPrimes = 1;

        while(numPrimes <= 10001)
        {
            if (primeTest(testNumber))
            {
                testNumber++;
                numPrimes++;
            }
            else testNumber++;
        }

        System.out.println(testNumber-1);
    }
}
