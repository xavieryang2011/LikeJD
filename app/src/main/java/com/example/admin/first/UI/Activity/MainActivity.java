package com.example.admin.first.UI.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.admin.first.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.itv_home_page)
    TextView itvHomePage;
    @Bind(R.id.tv_home_page)
    TextView tvHomePage;
    @Bind(R.id.rl_home_page)
    RelativeLayout rlHomePage;
    @Bind(R.id.itv_type)
    TextView itvType;
    @Bind(R.id.itv_find)
    TextView itvFind;
    @Bind(R.id.itv_shop_car)
    TextView itvShopCar;
    @Bind(R.id.itv_me)
    TextView itvMe;
    @Bind(R.id.ll_bottom_bar)
    LinearLayout llBottomBar;
    @Bind(R.id.main_fragment_container)
    RelativeLayout mainFragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initView();

    }

    private void initView() {
        Typeface iconfont = Typeface.createFromAsset(getAssets(), "iconfont/iconfont.ttf");
        itvHomePage.setTypeface(iconfont);
        itvMe.setTypeface(iconfont);
        itvFind.setTypeface(iconfont);
        itvShopCar.setTypeface(iconfont);
        itvType.setTypeface(iconfont);

    }
}
