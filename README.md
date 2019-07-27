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



import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;


```java 
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
