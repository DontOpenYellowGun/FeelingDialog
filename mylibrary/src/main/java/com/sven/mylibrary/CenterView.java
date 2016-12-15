package com.sven.mylibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;

import com.race604.drawable.wave.WaveDrawable;

/**
 * Created by Sven on 2016/12/15.
 */

public class CenterView extends CardView {

    private ImageView waveImageView;
    private Context context;

    public CenterView(Context context) {
        this(context, null);
    }

    public CenterView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CenterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        this.context = context;
        waveImageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.view_wave, null, false);
        addView(waveImageView);

        WaveDrawable mWaveDrawable = new WaveDrawable(context, R.drawable.bg_feeling_loading);
        mWaveDrawable.setIndeterminate(true);
        mWaveDrawable.setWaveSpeed(40);
        mWaveDrawable.setWaveAmplitude(150);
        mWaveDrawable.setWaveLength(400);
        mWaveDrawable.setColorFilter(Color.parseColor("#ffcb4f"), PorterDuff.Mode.SRC_ATOP);
        waveImageView.setImageDrawable(mWaveDrawable);
        setContentPadding(DensityUtil.dip2px(20), DensityUtil.dip2px(20), DensityUtil.dip2px(20), DensityUtil.dip2px(20));
        setCardBackgroundColor(Color.parseColor("#ffffff"));
        setCardElevation(DensityUtil.dip2px(10));
        setRadius(DensityUtil.dip2px(10));


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(DensityUtil.dip2px(140), DensityUtil.dip2px(140));

    }
}
