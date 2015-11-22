package com.czu.rsscollector;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class News extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ListView listNews = (ListView) findViewById(R.id.listnews);
        String[] itemsNews = new String[] {
                "Nadpis 1",
                "Nadpis 2",
                "Nadpis 3",
                "Nadpis 4"};
        ArrayAdapter<String> adapterNews = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemsNews);
        listNews.setAdapter(adapterNews);

        listNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView) view).getText().toString();

                Intent ArticleNew = new Intent(News.this, com.czu.rsscollector.ArticleNew.class);
                startActivity(ArticleNew);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
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
