package component.csz.com.componentsample.busia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;


/**
 * Created by csz on 2018/11/29.
 */

@Route(path = "/busia/boot1")
public class Boot1Activity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_boot);
    }

    public void toB(View view){
        ARouter.getInstance().build("/busib/boot2").navigation();
        finish();
    }
}
