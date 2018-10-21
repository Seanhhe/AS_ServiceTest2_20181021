package tw.sean.as_servicetest2_20181021;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private LocalBinder binder = new LocalBinder();
    private MainActivity

    public MyService() {
        Log.v("brad", "MyService()");
    }

    public class LocalBinder extends Binder {
        //
        MyService getService(){
            return MyService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.v("brad", "onBind()");
        return binder;
    }

    public void setUiHandler(MainActivity.UIHandler uiHandler) {

    }

    public void m1(String data) {
        Log.v("brad", "Service => -1");
    }

    public void m2() {

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.v("brad", "onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.v("brad", "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("brad", "onDestroy()");
    }


}
