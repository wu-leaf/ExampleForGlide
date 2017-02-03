package com.veyron.www.exampleforglide.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.veyron.www.exampleforglide.R;
import com.veyron.www.exampleforglide.adapter.GlideRecyclerviewAdapter;
import com.veyron.www.exampleforglide.constant.PicUrl;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Veyron on 2017/2/3.
 * Function：Recyclerview中使用Glide
 */
public class GlideRecyclerviewActivity extends AppCompatActivity {

    @Bind(R.id.rv_glide)
    RecyclerView mRvGlide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_recyclerview);
        ButterKnife.bind(this);
        initData();
    }

    private void initData() {

        // 初始化Recyclerview
        GlideRecyclerviewAdapter glideRecyclerviewAdapter = new GlideRecyclerviewAdapter(this,PicUrl.mDatas);
        mRvGlide.setAdapter(glideRecyclerviewAdapter);
        mRvGlide.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
