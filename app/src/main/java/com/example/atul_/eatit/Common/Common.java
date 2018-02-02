package com.example.atul_.eatit.Common;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;

import com.example.atul_.eatit.model.User;

/**
 * Created by Admin on 13-Jan-18.
 */

public class Common {
    public static User currentUser;


    public static final String DELETE="delete";
    public static final String USER_KEY="User";
    public static final String PWD_KEY="Password";

    public static boolean isConnectedToInternet(Context baseContext) {

        ConnectivityManager connectivityManager=(ConnectivityManager) baseContext.getSystemService(baseContext.CONNECTIVITY_SERVICE);

               if(connectivityManager !=null)
               {
                   NetworkInfo[] info=connectivityManager.getAllNetworkInfo();

                   if(info !=null)
                   {
                       for(int i=0;i<info.length;i++)
                       {
                           if(info[i].getState() ==NetworkInfo.State.CONNECTED)
                               return  true;
                       }
                   }

               }
               return false;

    }


}
