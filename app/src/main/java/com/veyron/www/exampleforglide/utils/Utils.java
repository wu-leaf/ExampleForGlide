package com.veyron.www.exampleforglide.utils;

import android.content.Context;

/**
 * Created by Veyron on 2017/2/3.
 * Function：调节分辨率工具
 */
public class Utils {
    public static int dip2px(Context context, float dp) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }
}
