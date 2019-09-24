package com.rohman.menuapp;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void menu(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_menu:
                Toast.makeText(this, "menu 1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_menu2:
                Toast.makeText(this, "menu 2", Toast.LENGTH_SHORT).show();

                break;
            case R.id.bugs:
                Toast.makeText(this, "Bug", Toast.LENGTH_SHORT).show();

                break;
        }
    }
}
