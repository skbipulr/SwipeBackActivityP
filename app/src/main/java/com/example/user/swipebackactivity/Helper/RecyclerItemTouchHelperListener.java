package com.example.user.swipebackactivity.Helper;

import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

public  interface RecyclerItemTouchHelperListener {

    void onSwiped(RecyclerView.ViewHolder viewHolder,int direction,int position);
}
