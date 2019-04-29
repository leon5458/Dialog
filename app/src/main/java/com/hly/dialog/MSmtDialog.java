package com.hly.dialog;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.text.TextUtils;

/**
 * ~~~~~~文件描述:~~~~~~
 * ~~~~~~作者:huleiyang~~~~~~
 * ~~~~~~创建时间:2019/4/29~~~~~~
 * ~~~~~~更改时间:2019/4/29~~~~~~
 * ~~~~~~版本号:2.0~~~~~~
 */
public class MSmtDialog {
    public static AlertDialog.Builder getConfirmDialog(Context context,
                                                           String title,
                                                           String message,
                                                           String okString,
                                                           String centerString,
                                                           String cancleString,
                                                           DialogInterface.OnClickListener onOkClickListener,
                                                           DialogInterface.OnClickListener onCenterClickListener,
                                                           DialogInterface.OnClickListener onCancleClickListener) {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(title);
            builder.setMessage(message);
            builder.setPositiveButton(okString, onOkClickListener);
            builder.setNeutralButton(centerString,onCenterClickListener);
            builder.setNegativeButton(cancleString, onCancleClickListener);
            return builder;
        }









    }

