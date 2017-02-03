package com.veyron.www.exampleforglide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.veyron.www.exampleforglide.R;
import com.veyron.www.exampleforglide.adapter.GlideTranformationsAdapter;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Veyron on 2017/2/3.
 * Function：使用裁剪
 */
public class GlideTranformationsActivity extends AppCompatActivity {

    @Bind(R.id.rv_glide_transformations)
    RecyclerView mRvGlideTransformations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_tranformations);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {
        // 初始化Recyclerview
        GlideTranformationsAdapter glideTranformationsAdapter = new GlideTranformationsAdapter(this);
        mRvGlideTransformations.setAdapter(glideTranformationsAdapter);
        mRvGlideTransformations.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
