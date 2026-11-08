class Solution {
    public int divisibleByDigits(String s) {
        // code here
        int count = 0;

        //cache array

        int[] memo = new int[10];


        for(int i = 0; i < s.length(); i++){

            int digit = s.charAt(i) - '0'; //ASCII Subtraction

            if(digit > 0){

                if(memo[digit] == 0){

                    memo[digit] = isDivisible(s, digit) ? 1 : -1;

                }


            }

            if(memo[digit] == 1){
                count++;
            }


        }

        return count;
    }

    public boolean isDivisible(String s, int digit){

        if(digit == 1){
            return true;
        }

        int rem = 0;


        for(int i = 0; i < s.length(); i++){

            int current_digit = s.charAt(i) - '0';

            rem = (current_digit + (rem * 10)) % digit;

        }

        return rem == 0;
    }
}