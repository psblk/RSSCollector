package com.czu.rsscollector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNews = (Button) findViewById(R.id.btnNews);
        Button btnSaved = (Button) findViewById(R.id.btnSaved);
        Button btnChannels = (Button) findViewById(R.id.btnChannels);
    }

    public void onClick(View v){
        switch (v.getId()) {
            case R.id.btnNews:
                Intent News = new Intent(this, com.czu.rsscollector.News.class);
                startActivity(News);
                break;
            case R.id.btnSaved:
                Intent Saved = new Intent(this, com.czu.rsscollector.Saved.class);
                startActivity(Saved);
                break;
            case R.id.btnChannels:
                Intent Channels = new Intent(this, com.czu.rsscollector.Channels.class);
                startActivity(Channels);
                break;
        }
    }
}
