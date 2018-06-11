/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylecieskiewicz
 */
public class SummativeSums {
    
public static void main(String[] args) {
    int[] num = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    int[] num2 = { 999, -60, -77, 14, 160, 301 };
    int[] num3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
        140, 150, 160, 170, 180, 190, 200, -99 };
    
    int ans;
    int ans2;
    int ans3;
/* w w  w .  j av a  2s . c  o  m*/
  
    ans = adds(num);
    System.out.println("#1 Array Sum: " + ans);
    
    ans2 = adds(num2);
    System.out.println("#2 Array Sum: " + ans2);
    
    ans3 = adds(num3);
    System.out.println("#3 Array Sum: " + ans3);

  }
  public static int adds(int[] source) {
      
    int sum = 0;
      
    for (int i = 0; i < source.length; i++)
    {
        sum += source[i];
    }
    
    return sum;
  }
    
}
