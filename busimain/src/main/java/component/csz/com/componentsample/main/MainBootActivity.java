package component.csz.com.componentsample.main;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by csz on 2018/11/29.
 */

@Route(path = "/main/boot")
public class MainBootActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_boot);
    }

    public void toA(View view){
        ARouter.getInstance().build("/busia/boot1").navigation();
        finish();
    }
}
