  import java.util.*;
public class DivisiblePairs {
  
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt(),k=sc.nextInt();
int[] arr=new int[n];
for(int i=0;i<n;i++) arr[i]=sc.nextInt();
int[] freq=new int[k];
int count=0;
for(int i=0;i<n;i++){
int rem=arr[i]%k;
int complement=(k-rem)%k;
count+=freq[complement];
freq[rem]++;
}
System.out.print(count);
}
}

