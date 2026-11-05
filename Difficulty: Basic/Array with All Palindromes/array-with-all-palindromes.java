class Solution {
    public static boolean isPalinArray(int[] arr) {

        for(int num: arr){

              if(num<0 || (num !=0 && num%10==0)){
                  return false;
              }
              int reversed = 0;
              while(num>reversed){

                 reversed = reversed*10+num%10;
                 num/=10;
              }

              if(num != reversed && num != reversed/10){
                  return false;
              }

        }

        return true;

    }
}

