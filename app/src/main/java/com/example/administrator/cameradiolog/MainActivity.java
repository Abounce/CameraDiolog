package com.example.administrator.cameradiolog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void start(View v){
        new ActionSheetDialog(MainActivity.this).Builder()

                .addSheetItem("拍照", ActionSheetDialog.SheetItemColor.RED, new ActionSheetDialog.OnSheetItemClickListener() {
                    @Override
                    public void onClick(int witch) {
                        Toast.makeText(MainActivity.this, "拍照", Toast.LENGTH_SHORT).show();
                    }
                }).addSheetItem("打开相册",ActionSheetDialog.SheetItemColor.BULE, new ActionSheetDialog.OnSheetItemClickListener() {
            @Override
            public void onClick(int witch) {
                Toast.makeText(MainActivity.this, "打开相册", Toast.LENGTH_SHORT).show();
            }
        }).addSheetItem("新加的", ActionSheetDialog.SheetItemColor.BULE, new ActionSheetDialog.OnSheetItemClickListener() {
            @Override
            public void onClick(int witch) {
                Toast.makeText(MainActivity.this, "新加的", Toast.LENGTH_SHORT).show();
            }
        }).setTitle("标题").show();
    }
}
