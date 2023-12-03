class Solution {
    public int superPow(int a, int[] b) {
        // if(a == 0){
        //     return 0;
        // }
        // while(a >1){
        //     for(int i =0;i< b.length-1;i++){
        //         int c =+ b[i];
        //         return a^c;
        //     }
        // }
        // return 1;        
        long nums=0; long ans=1;

        for(int i=0; i<b.length; i++){
             nums=(nums*10+b[i])%1140;//Euler theorem
        }

        if(nums==0){
            for(int i=0; i<b.length; i++){
             nums=(nums*10+b[i])%1337;
            }
        }
        a%=1337;
        
        for(long i=0; i<nums; i++){
            ans=(ans*a)%1337;
        } 
        return (int)ans;
    }
}
