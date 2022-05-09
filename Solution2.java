import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        //step 1:Take the last 2 digits of the year.
        String s=Integer.toString(year);
        int y = Integer.parseInt(s.substring(2,4));
        int x=y;
        //step 2:Divide it by 4 and discard any remainder.
        y=y/4;
        //step 3:Add the day of the month to the value obtained in step 2.
        y=y+day;
        //step 4:Add the month’s key value, from the following table to the value obtained in step 3.
        if(month==1){
            y=y+1;
        }
        else if((month==2)||(month==3)||(month==11)){
            y=y+4;
        }
       
        else if(month==4){
            y=y+0;
        }
        else if(month==5){
            y=y+2;
        }
        else if(month==6){
            y=y+5;
        }
        else if(month==7){
            y=y+0;
        }
        else if(month==8){
            y=y+3;
        }
        else if(month==9){
            y=y+6;
        }
        else if(month==10){
            y=y+1;
        }
       //step 5:If the date is in January or February of a leap year, subtract 1 from step 4.
        else if(month==12){
            y=y+6;
        }
        if ((month==1)||(month==2)){
            y=y-1;
        }
        //step 6:Add the year (century) code from the following table.
        if((year<1700) || (year>=2100)){
            if(year<1700){
                year=year+400;
            
                if((year>=1700) && (year<1800)){
                    y=y+4;
                }
                else if((year>=1800)&&(year<1900)){
                    y=y+2;
                }
                else if((year>=1900)&&(year<2000)){
                    y=y+0;
                }
                else if((year>=2000)&&(year<2100)){
                    y=y+6;
                }
                if(year>=2100){
                year=year-400;
            
                if((year>=1700)&&(year<1800)){
                    y=y+4;
                }
                else if((year>=1800)&&(year<1900)){
                    y=y+2;
                }
                else if((year>=1900)&&(year<2000)){
                    y=y+0;
                }
                else if((year>=2000)&&(year<2100)){
                    y=y+6;
                }
            }
        }
        //step 7: Add the last two digits of the year to the value we obtained in the previous step.
        y=y+x;
        //step 8:Divide this value by 7 and take the remainder. Get the day from the following table based on the value of the remainder.
        
                switch(y%7) {
        case 1:
            s="SUNDAY";
            break;
        case 2:
            s="MONDAY";
            break;
            case 3:
            s="TUESDAY";
            break;
            case 4:
            s="WEDNESDAY";
            break;
            case 5:
            s="THURSDAY";
            break;
            case 6:
            s="FRIDAY";
            break;
            case 0:
            s="SATURDAY";
            break;
        default:
            s="INVALID ENTRY";
        }

        
       
    }
        return s;

}
    

}

public class Solution2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 