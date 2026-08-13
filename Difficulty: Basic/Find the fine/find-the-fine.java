class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long totalFine = 0;
        boolean isDateEven = (date % 2 == 0);

        for (int i = 0; i < car.length; i++) {
         
            if (isDateEven && car[i] % 2 != 0) {
                totalFine += fine[i];
            } 
         
            else if (!isDateEven && car[i] % 2 == 0) {
                totalFine += fine[i];
            }
        }

        return totalFine;
    }
}
