package com.example.contextmenuapp1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mtxtMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtxtMenu=findViewById(R.id.txtContextMenu);

        registerForContextMenu(mtxtMenu);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        getMenuInflater().inflate(R.menu.menu_example,menu);

    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {


        switch ((item.getItemId()))
        {
            case R.id.item1Apple:
                Toast.makeText(getApplicationContext(),"You clicked"+item.getTitle(),Toast.LENGTH_LONG).show();
                return true;

            case R.id.item2Banana:
                Toast.makeText(getApplicationContext(),"You clicked"+item.getTitle(),Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onContextItemSelected(item);
        }


    }
}