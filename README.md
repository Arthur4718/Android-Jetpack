# Android-Jetpack
A demo app using Android JetPack 2.0, with Java, to observe an activity Lifecycle. 


Android Jetpack has a lot of features. Inside the Architecture we can use Lifecicle observer to observe Activity lifecicles and act acordlingly. 



# Dependencies

I created this project with AndroidX support enabled, and then added the following libraries from jetpack.

```
def lifecycle_version = "2.0.0"
    implementation "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
    // Optional : Kotlin extension (https://d.android.com/kotlin/ktx)
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
```


Then, created a MainActivityObserver Java Classs. 

```java 

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {


    private String TAG = this.getClass().getName();


    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void mOnCreateEvent(){
        Log.i(TAG,  "Observer ON_Create");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void mOnStartEvent(){
        Log.i(TAG,  "Observer ON_Start");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void mOnResumeEvent(){
        Log.i(TAG,  "Observer ON_Resume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void mOnDestroyEvent(){
        Log.i(TAG,  "Observer ON_Destroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void mOnStopEvent(){
        Log.i(TAG,  "Observer ON_Stop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void mOnPauseEvent(){
        Log.i(TAG,  "Observer ON_Pause");
    }
}

```

To compare the lifecycle observer and the actual lifecycle from the activity, i added logs on every MainActivity lifecycle event. Its also on this activty that i bind our observer so he can do his job. 


```java 
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "Owner ON_CREATE");

        getLifecycle().addObserver(new MainActivityObserver());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Owner ON_START");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Owner ON_RESUME");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Owner ON_DESTROY");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Owner ON_STOP");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Owner ON_PAUSE");
    }
}
```
