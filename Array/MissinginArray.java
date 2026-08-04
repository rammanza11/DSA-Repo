class Solution {
    int missingNum(int arr[]) {
        // code here
      int n=arr.length+1;
      int x1=0;
      int x2=0;
      
      for(int i=0;i<arr.length;i++){
          x1^=(i+1);
          x2^=arr[i];
          
      }
        x1^=n;
      return x1^x2;
    
    }
   
}