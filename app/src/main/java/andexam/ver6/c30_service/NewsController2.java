package andexam.ver6.c30_service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import andexam.ver6.R;

public class NewsController2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newscontroller);
    }

    public void mOnClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.newsstart:
                intent = new Intent(this, NewsService2.class);
                startService(intent);
                break;
        }
    }
}