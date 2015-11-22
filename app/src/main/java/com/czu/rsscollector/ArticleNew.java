package com.czu.rsscollector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ArticleNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article_new);

        Button btnSaveA = (Button) findViewById(R.id.btnSaveA);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickNew(View v){
        switch (v.getId()) {
            case R.id.btnSaveA:
                Toast.makeText(getApplicationContext(), "Článek uložen", Toast.LENGTH_SHORT).show();
            break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
}
