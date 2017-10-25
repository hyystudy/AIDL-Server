package com.jccy.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heyangyang on 2017/10/25.
 */

public class MyService extends Service {
    private List<User> users = new ArrayList<>();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }


    class MyBinder extends IMyAidlInterface.Stub{

        @Override
        public String getName() throws RemoteException {
            if (users == null || users.size() == 0){
                return "none";
            }
            return users.get(0).getName();
        }

        @Override
        public User getUser() throws RemoteException {
            if (users == null || users.size() == 0){
                return new User("none");
            }
            return users.get(0);
        }

        @Override
        public void addUser(User user) throws RemoteException {
            if (users == null){
                users = new ArrayList<>();
            }
            users.add(user);
            Log.d("MyService", user.getName());
        }
    }
}
