package com.reactnativecommunity.blurview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.Nullable;

public class BlurView extends FrameLayout {

  // TODO : Implement this if needed in android

  private Drawable frameClearDrawable;
  private float blurRadius = 0f;
  private int overlayColor = 0;
  private boolean blurAutoUpdate = false;
  private boolean blurEnabled = true;

  public BlurView(Context context) {
    super(context);
  }

  public BlurView(Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);
  }

  public BlurView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
    super(context, attrs, defStyleAttr);
  }

  // Dummy function for setupWith
  public BlurView setupWith(View view) {
    // Do setup with the provided view
    return this;
  }

  // Dummy function for setFrameClearDrawable
  public BlurView setFrameClearDrawable(Drawable drawable) {
    this.frameClearDrawable = drawable;
    return this;
  }

  // Dummy function for setBlurRadius
  public BlurView setBlurRadius(float radius) {
    this.blurRadius = radius;
    return this;
  }

  // Dummy function for setOverlayColor
  public BlurView setOverlayColor(int color) {
    this.overlayColor = color;
    return this;
  }

  // Dummy function for setBlurAutoUpdate
  public BlurView setBlurAutoUpdate(boolean autoUpdate) {
    this.blurAutoUpdate = autoUpdate;
    return this;
  }

  // Dummy function for setBlurEnabled
  public BlurView setBlurEnabled(boolean enabled) {
    this.blurEnabled = enabled;
    return this;
  }
}
