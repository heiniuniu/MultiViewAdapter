package com.ahamed.multiviewadapter;

import android.content.Context;
import com.ahamed.multiviewadapter.util.SimpleDividerDecoration;

@Deprecated public class SimpleItemDecoration extends SimpleDividerDecoration
    implements ItemDecorator {

  public SimpleItemDecoration(Context context, int orientation) {
    super(context, orientation);
  }
}