package com.mj.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static void simpleToast(Context cnt,String msg){
        Toast.makeText(cnt,msg ,Toast.LENGTH_SHORT).show();

    }




}
