package com.veyron.www.exampleforglide.activity;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.DrawableRequestBuilder;
import com.bumptech.glide.Glide;
import com.veyron.www.exampleforglide.R;

import java.io.File;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Veyron on 2017/2/3.
 * Function：基本用法
 */
public class GlideBaseActivity extends AppCompatActivity {

    @Bind(R.id.tv_glide_1)
    TextView mTvGlide1;
    @Bind(R.id.iv_glide_1)
    ImageView mIvGlide1;
    @Bind(R.id.tv_glide_2)
    TextView mTvGlide2;
    @Bind(R.id.iv_glide_2)
    ImageView mIvGlide2;
    @Bind(R.id.tv_glide_3)
    TextView mTvGlide3;
    @Bind(R.id.iv_glide_3)
    ImageView mIvGlide3;
    @Bind(R.id.tv_glide_4)
    TextView mTvGlide4;
    @Bind(R.id.iv_glide_4)
    ImageView mIvGlide4;
    @Bind(R.id.tv_glide_5)
    TextView mTvGlide5;
    @Bind(R.id.iv_glide_5)
    ImageView mIvGlide5;
    @Bind(R.id.tv_glide_6)
    TextView mTvGlide6;
    @Bind(R.id.iv_glide_6)
    ImageView mIvGlide6;
    @Bind(R.id.tv_glide_7)
    TextView mTvGlide7;
    @Bind(R.id.iv_glide_7)
    ImageView mIvGlide7;
    @Bind(R.id.tv_glide_8)
    TextView mTvGlide8;
    @Bind(R.id.iv_glide_8)
    ImageView mIvGlide8;
    @Bind(R.id.tv_glide_9)
    TextView mTvGlide9;
    @Bind(R.id.iv_glide_9)
    ImageView mIvGlide9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide_base);
        ButterKnife.bind(this);
        initDate();
    }

    private void initDate() {
        //（1）加载网络图片
        mTvGlide1.setText("（1）加载网络图片");
        Glide.with(this).load("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1486705588&di=67da4e9f61411c1aa4cde5fd96d6283e&imgtype=jpg&er=1&src=http%3A%2F%2Fcdn.duitang.com%2Fuploads%2Fitem%2F201507%2F30%2F20150730141558_nMxy3.jpeg").into(mIvGlide1);

        //（2）加载资源图片
        mTvGlide2.setText("（2）加载资源图片");
        Glide.with(this).load(R.drawable.timg).into(mIvGlide2);

        //（3）加载本地图片
        mTvGlide3.setText("（3）加载本地图片");
        String path = Environment.getExternalStorageDirectory() + "/meinv1.jpg";
        File file = new File(path);
        Uri uri = Uri.fromFile(file);
        Glide.with(this).load(uri).into(mIvGlide3);

        // （4）加载网络gif
        mTvGlide4.setText("（4）加载网络gif");
        String gifUrl = "http://img3.100bt.com/upload/ttq/20140623/1403522553427.gif";
        Glide.with(this).load(gifUrl).placeholder(R.mipmap.ic_launcher).into(mIvGlide4);

        // （5）加载资源gif
        mTvGlide5.setText("（5）加载资源gif");
        Glide.with(this).load(R.drawable.local).asGif().placeholder(R.mipmap.ic_launcher).into(mIvGlide5);

        //（6）加载本地gif
        mTvGlide6.setText("（6）加载本地gif");//sd卡
        String gifPath = Environment.getExternalStorageDirectory() + "/meinv2.jpg";
        File gifFile = new File(gifPath);
        Glide.with(this).load(gifFile).placeholder(R.mipmap.ic_launcher).into(mIvGlide6);

        //（7）加载本地小视频和快照
        mTvGlide7.setText("（7）加载本地小视频和快照");
        String videoPath = Environment.getExternalStorageDirectory() + "/video.mp4";
        File videoFile = new File(videoPath);
        Glide.with(this).load(Uri.fromFile(videoFile)).placeholder(R.mipmap.ic_launcher).into(mIvGlide7);

        //（8）设置缩略图比例,然后，先加载缩略图，再加载原图
        mTvGlide8.setText("（8）设置缩略图比例,然后，先加载缩略图，再加载原图");
        String urlPath = Environment.getExternalStorageDirectory() + "/meinv1.jpg";
        Glide.with(this).load(new File(urlPath)).thumbnail(0.1f).centerCrop().placeholder(R.mipmap.ic_launcher).into(mIvGlide8);

        //（9）先建立一个缩略图对象，然后，先加载缩略图，再加载原图
        mTvGlide9.setText("（9）先建立一个缩略图对象，然后，先加载缩略图，再加载原图");
        DrawableRequestBuilder thumbnailRequest = Glide.with(this).load(new File(urlPath));
        Glide.with(this).load(Uri.fromFile(videoFile)).thumbnail(thumbnailRequest).centerCrop().placeholder(R.mipmap.ic_launcher).into(mIvGlide9);
    }
}
