package com.czu.rsscollector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Edit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        Button btnSaveCh = (Button) findViewById(R.id.btnSaveCh);
        Button btnDeleteCh = (Button) findViewById(R.id.btnDeleteCh);

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

    public void onClickEdit(View v){
        switch (v.getId()) {
            case R.id.btnSaveCh:
                Toast.makeText(getApplicationContext(), "Kanál uložen", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDeleteCh:
                Toast.makeText(getApplicationContext(), "Kanál odstraněn", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
