
class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        int arr[]= new int [2];
        for(int i=1;i<=b && arr[0]==0;i++){
            for(int j=1;j<=a;j++){
                if(a*i==b*j){
                arr[0]=a*i;
                break;
                }
            }
        }
        while(a>0 && b>0){
            if(a>b)
            a=a%b;
            else b=b%a;
        }
        if (a==0)
        arr[1]=b;
        else arr[1]=a;

        return arr;
    }
}

