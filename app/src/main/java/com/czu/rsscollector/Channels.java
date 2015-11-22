package com.czu.rsscollector;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


public class Channels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channels);

        Button btnSaveA = (Button) findViewById(R.id.btnDeleteA);

        ListView listChannels = (ListView) findViewById(R.id.listchannels);
        String[] itemsChannels = new String[] {
                "Kanál 1",
                "Kanál 2",
                "Kanál 3",
                "Kanál 4"};
        ArrayAdapter<String> adapterChannels = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, itemsChannels);
        listChannels.setAdapter(adapterChannels);

        listChannels.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String item = ((TextView) view).getText().toString();

                Intent Edit = new Intent(Channels.this, com.czu.rsscollector.Edit.class);
                startActivity(Edit);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void onClickCh(View v){
        switch (v.getId()) {
            case R.id.btnAddCh:
                Intent Add = new Intent(Channels.this, com.czu.rsscollector.Add.class);
                startActivity(Add);
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
