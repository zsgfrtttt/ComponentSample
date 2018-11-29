package component.csz.com.componentsample.busib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by csz on 2018/11/29.
 */
@Route(path = "/busib/boot2")
public class Boot2Activity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b_boot);
    }

    public void toMain(View view){
        ARouter.getInstance().build("/main/boot").navigation();
        finish();
    }
}
