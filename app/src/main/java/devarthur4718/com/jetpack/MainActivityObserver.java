package devarthur4718.com.jetpack;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {


    private String TAG = this.getClass().getName();


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void mOnCreateEvent(){
        Log.i(TAG,  "Observer ON_CREATE");
    }
}
