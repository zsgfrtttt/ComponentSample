package component.csz.com.componentsample;

import com.alibaba.android.arouter.launcher.ARouter;
import com.csz.common.base.CommonApplication;


/**
 * Created by csz on 2018/11/29.
 */

public class App extends CommonApplication{

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            //一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(this);
    }
}
