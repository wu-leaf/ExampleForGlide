package com.veyron.www.exampleforglide.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.veyron.www.exampleforglide.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.bt_glide_base)
    Button mBtGlideBase;
    @Bind(R.id.bt_glide_recyclerview)
    Button mBtGlideRecyclerview;
    @Bind(R.id.bt_glide_tranfromations)
    Button mBtGlideTranfromations;
    @Bind(R.id.activity_main)
    LinearLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.bt_glide_base, R.id.bt_glide_recyclerview, R.id.bt_glide_tranfromations})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_glide_base:
                Intent intent1 = new Intent(MainActivity.this, GlideBaseActivity.class);
                startActivity(intent1);
                break;
            case R.id.bt_glide_recyclerview:
                Intent intent2 = new Intent(MainActivity.this, GlideRecyclerviewActivity.class);
                startActivity(intent2);
                break;
            case R.id.bt_glide_tranfromations:
                Intent intent3 = new Intent(MainActivity.this, GlideTranformationsActivity.class);
                startActivity(intent3);
                break;
        }
    }
}
