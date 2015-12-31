package com.lanjiessh.base.widgets;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/**
 * Created by Vin on 2015/12/31.
 */
public class NoUnderlineClickSpan extends ClickableSpan {

    @Override
    public void onClick(View widget) {

    }

    @Override
    public void updateDrawState(TextPaint ds) {
        ds.setColor(ds.linkColor);
        ds.setUnderlineText(false);
    }
}