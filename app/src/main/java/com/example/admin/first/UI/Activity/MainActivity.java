package com.example.admin.first.UI.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.admin.first.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.itv_home_page)
    TextView itvHomePage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();

    }

    private void initView() {
        Typeface iconfont=Typeface.createFromAsset(getAssets(),"iconfont/iconfont.ttf");
        itvHomePage.setTypeface(iconfont);
    }
}
