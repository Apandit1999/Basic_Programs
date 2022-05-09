import java.util.Arrays;

public class Pattern{
public static void main(String[] args) {
  int[] arr = new int[5];
  arr[0]=1;
  for(int i=0;i<5;i++){
     // arr[i+1] = arr[i] + 2;
     arr[2]=arr[0] +1;
      System.out.println(arr);
  }
  System.out.println(arr[0]);
}
}