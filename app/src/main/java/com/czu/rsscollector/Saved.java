package com.czu.rsscollector;

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

public class Saved extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saved);

        ListView listSaved = (ListView) findViewById(R.id.listsaved);
        String[] itemsSaved = new String[] {
                "Uložený článek 1",
                "Uložený článek 2",
                "Uložený článek 3",
                "Uložený článek 4"};
        ArrayAdapter<String> adapterSaved = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemsSaved);
        listSaved.setAdapter(adapterSaved);

        listSaved.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView) view).getText().toString();

                Intent ArticleSaved = new Intent(Saved.this, com.czu.rsscollector.ArticleSaved.class);
                startActivity(ArticleSaved);
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
