package com.example.userr.android_app_3;

import java.util.ArrayList;

import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class Factorization {
    public static void fermat_s_factorization(long n, ArrayList<Long> arr){
        while(n%2==0){
            n/=2;   //ділення на 2,щоб отимати непарне число
            // адже метод Фема працює тільки з непарними числами
            arr.add((long)2);}
        long x,y, x_2, y_2, a, b;
        x = (long)ceil(sqrt(n));
        x_2=x*x;
        y_2=x_2-n;

        while(sqrt(y_2)%1!=0.0){
            x_2 = x_2+2*x+1;//тому що (x+1)^2 = x^2+2*x+1
            y_2=x_2-n;
            x+=1;
        }
        y=(long)sqrt(y_2);
        a=x+y;
        b=x-y;
        if(b==1)
            arr.add(a);
        else{
            fermat_s_factorization(a, arr);
            fermat_s_factorization(b, arr);
        }
    }
}
