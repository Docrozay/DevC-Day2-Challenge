import java.util.Arrays;

class SockMerchant {


    int sockMerchant(int n, int[] ar) {
        
        int a,b,t;
        for(a = 1; a < n; a++){
            for(b=n-1; b>=a; b--){
                if(ar[b-1]>ar[b]){
                    t = ar[b-1];
                    ar[b-1] = ar[b];
                    ar[b] =t;
                }
          }   
          }
         
          int[] ar2 = new int[ar.length];
          Arrays.sort(ar);
  
          for (int i = 0; i < ar.length; i++) {
              ar2[i]++;
              if (i+1 < ar.length) 
              {
                  if (ar[i] == ar[i + 1]) {
                      ar2[i]++;
                      i++;
                  }
              }
          }
          int sum = 0;
          for (int i = 0; i < ar.length; i++) {
              if(ar2[i]>1 && ar2[i]%2==0){
                System.out.print(ar[i] + ":" + ar2[i]+",");
                sum += ar2[i]; 
                System.out.println();
              }
          }
          return sum/2;
    }
}
