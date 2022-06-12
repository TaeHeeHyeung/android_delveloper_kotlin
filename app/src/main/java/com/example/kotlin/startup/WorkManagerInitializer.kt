package com.example.kotlin.startup

import android.content.Context
import androidx.startup.Initializer
import androidx.work.Configuration
import androidx.work.WorkManager
import java.util.*
import kotlin.collections.ArrayList

//Startup library =>  컴포넌트를 초기화 할 때 사용한다.
//이전에 앱에서 컴포넌트 초기화를 위해 content provider 를 사용한 경우, App Startup 사용 시에는 제거해야 한다.
//*컴포넌트 : Activity, Service, BroadcastReceiver, ContentProvider
class WorkManagerInitializer : Initializer<WorkManager> {
    override fun create(context: Context): WorkManager {
        val configuration = Configuration.Builder().build()
        WorkManager.initialize(context, configuration)
        return WorkManager.getInstance(context)
    }

    //java
    //generic
    // <? extends Foo>: ? 에는 Foo 을 상속한 어떤 것도 사용가능 (사용 확장) ex) (class name: Foo 사용가능)
    // <? super Integer>: ?에는 Integer 의 상위 타입만 사용 가능 (사용 제한) ex) (Object Number, Integer 사용가능)

    //kotlin => java
    // out: extends
    // in: super


    //in, out

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {

//        var list: ArrayList<*>
//        list.add("string")
        return mutableListOf()
    }

}