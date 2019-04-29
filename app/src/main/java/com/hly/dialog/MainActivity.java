package com.hly.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.preference.DialogPreference;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final int IDD_THREE_BUTTONS = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                showDialog(IDD_THREE_BUTTONS);
                  MSmtDialog.getConfirmDialog(MainActivity.this, "提示:", "感谢使用", "加群", "进入软件","联系作者" ,new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {
                          Toast.makeText(MainActivity.this, "111", Toast.LENGTH_SHORT).show();
                      }
                  }, new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {
                          Toast.makeText(MainActivity.this, "222", Toast.LENGTH_SHORT).show();
                      }
                  }, new DialogInterface.OnClickListener() {
                      @Override
                      public void onClick(DialogInterface dialog, int which) {
                          Toast.makeText(MainActivity.this, "333", Toast.LENGTH_SHORT).show();
                      }
                  }).create().show();


            }
        });
    }
    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case IDD_THREE_BUTTONS:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("提示：");//对话框标题
                builder.setMessage("感谢使用")//对话框内容
                        .setCancelable(false)//屏蔽对话框外范围操作 false为设置
                        .setPositiveButton("加群",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setNeutralButton("进入软件",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();
                                    }
                                })
                        .setNegativeButton("联系作者",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int id) {
                                        dialog.cancel();

                                    }
                                });
                return builder.create();
            default:
                return null;
        }
    }



}
