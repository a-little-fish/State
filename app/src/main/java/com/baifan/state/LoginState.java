package com.baifan.state;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by baifan on 16/5/18.
 */
public class LoginState implements UserState {
    @Override
    public void forwoard(Context context) {
        Toast.makeText(context, "转发微博", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "评论", Toast.LENGTH_SHORT).show();
    }
}
