class Solution {
public:
    int findComplement(int num) {
        int power=0;
        int n=0;
        int i=0;
        while(num){
            int dig=(num%2)^1;
            num/=2;
            n+=dig*pow(2,i++);
        }
        return n;
    }
};