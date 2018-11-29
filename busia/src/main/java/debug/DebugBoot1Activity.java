package debug;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import component.csz.com.componentsample.busia.R;

/**
 * Created by csz on 2018/11/29.
 * 模块独立调试入口
 */

public class DebugBoot1Activity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.debug_activity_a_boot);
    }
}
