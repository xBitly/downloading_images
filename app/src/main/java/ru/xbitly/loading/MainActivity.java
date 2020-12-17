package ru.xbitly.loading;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new DownloadImageTask((ImageView) findViewById(R.id.imageView))
                .execute("https://i.pinimg.com/736x/85/ab/50/85ab50b53035e3ac17a5f52e7c53c477--cat-traps-funny-cat-pictures.jpg");
    }
}