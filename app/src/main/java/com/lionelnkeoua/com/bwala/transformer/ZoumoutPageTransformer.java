package com.lionelnkeoua.com.bwala.transformer;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Lionel on 19/02/2018.
 */
public class ZoumoutPageTransformer implements ViewPager.PageTransformer {
    //mes variables qui gere l'angle de scroll
    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;

    @Override
    public void transformPage(View page, float position) {
            int largeurPage = page.getWidth();
            int hauteurPage = page.getHeight();

        if (position < -1){
            //cette methode gere quand le view est inferieur a 1
            page.setAlpha(0);
        }   else  if (position<=1){
            float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
            float vertMargin = hauteurPage * (1 - scaleFactor) /2;
            float horizMargin = largeurPage * (1 - scaleFactor) /2;

            if (position<0){
                page.setTranslationX(horizMargin - vertMargin / 2);
            } else {
                page.setTranslationY(-horizMargin + vertMargin / 2);
            }

            page.setScaleX(scaleFactor);
            page.setScaleY(scaleFactor);

            page.setAlpha(MIN_ALPHA + (scaleFactor - MIN_SCALE) / (1 - MIN_SCALE) * (1 - MIN_ALPHA));
        }   else {
            page.setAlpha(0);
        }
    }
}
