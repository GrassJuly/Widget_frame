package org.runjing.widget_frame;

import android.os.Bundle;
import android.view.View;

import org.runjing.widget.R;
import org.runjing.widget_frame.utls.PopupWindowUtil;
import org.runjing.widget_frame.widget.pop.MiddlePopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPop();
            }
        });

    }


    public void showPop() {
        PopupWindowUtil.showPopWindow(this, "ceshi", "", false, new MiddlePopupWindow.PopupWindowCallBack() {
            @Override
            public void onNegativeButtonClick() {

            }

            @Override
            public void onPositiveButtonClick() {

            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
    }
}
