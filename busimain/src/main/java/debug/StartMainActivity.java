package debug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import component.csz.com.componentsample.main.R;


/**
 * Created by csz on 2018/11/29.
 * 模块独立调试入口
 */

public class StartMainActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debug_activity_main_start);
    }
}
