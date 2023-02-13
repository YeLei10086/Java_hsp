package tuantisai;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int[4];
        for (int i = 0; i < 4; i++) {
            num[i] = sc.nextInt();
        }
        if (!(num[0] >= 1820 && num[0] <= 2020) || !(num[1] >= 1 && num[1] <= 12) || !(num[2] >= 1 && num[2] <= 2020)) {
            System.out.println("Wrong Format");
            return;
        }
        int numDay[] = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year = num[0];
        int month = num[1];
        int day = num[2];
        int n = num[3];
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            numDay[2] = 29;
        }
        if (numDay[month]<day){
            System.out.println("Wrong Format");
            return;
        }
        while (n != 0) {
            int a = 20;
            if (Math.abs(n) <= a) {
                a = n;
                n=0;
            }else {
                n-=20;
            }
            day -= a;
            if (day <= 0) {
                if (month != 1) {
                    day += numDay[month - 1];
                    month--;
                } else {
                    day += numDay[12];
                    month=12;
                    year--;
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        numDay[2] = 29;
                    } else {
                        numDay[2] = 28;
                    }
                }
            } else if (day > numDay[month]) {
                day -= numDay[month];
                if (month != 12) {
                    month++;
                } else {
                    month = 1;
                    year++;
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        numDay[2] = 29;
                    } else {
                        numDay[2] = 28;
                    }
                }
            }
        }
        System.out.println(num[3]+" days ago is:"+year+"-"+month+"-"+day);
    }
}