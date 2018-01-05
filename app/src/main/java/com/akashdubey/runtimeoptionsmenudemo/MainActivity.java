package com.akashdubey.runtimeoptionsmenudemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int COMPUTER=0;
    private static final int GAMEPAD=1;
    private static final int CAMERA=2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuItem it1=menu.add(menu.NONE,COMPUTER,menu.NONE,"Computer");
        MenuItem it2=menu.add(menu.NONE,GAMEPAD,menu.NONE,"Gamepad");
        MenuItem it3=menu.add(menu.NONE,CAMERA,menu.NONE,"camera");

//        it1.setIcon(R.drawable.ic_launcher_background);
//        it1.setShowAsAction(it1.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case COMPUTER:
                Toast.makeText(this, "Selection:: Computer", Toast.LENGTH_SHORT).show();
                break;
            case GAMEPAD:
                Toast.makeText(this, "Selection:: Gamepad ", Toast.LENGTH_SHORT).show();
                break;
            case CAMERA:
                Toast.makeText(this, "Selection:: Camera", Toast.LENGTH_SHORT).show();
                break;
            default:
                ;
        }
        return super.onOptionsItemSelected(item);
    }
}
