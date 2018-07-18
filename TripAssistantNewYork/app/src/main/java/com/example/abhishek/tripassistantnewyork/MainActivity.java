package com.example.abhishek.tripassistantnewyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.drawable.ic_icon);


        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn9 = (Button) findViewById(R.id.button9);

        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn9.setOnClickListener(this);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    /**
     * Called when the user taps the World Trade Center button
     */
    public void displaywtcinfo(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayWtcInfo.class);
        startActivity(intent);
    }

    /** Called when the user taps the Brooklyn Bridge button */
    public void displaybrooklynbridgeinfo(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayBrooklynBridgeInfo.class);
        startActivity(intent);
    }

    /** Called when the user taps the Central Park button */
    public void displaycentralparkinfo(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayCentralParkInfo.class);
        startActivity(intent);
    }

    /** Called when the user taps the Broadway button */
    public void displaybroadwayinfo(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, DisplayBroadwayInfo.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_share: {
                final Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "TripAssistant");
                intent.putExtra(Intent.EXTRA_TEXT, "Check out the destination I have selected");
                startActivity(Intent.createChooser(intent, "Share the information through"));
                return true;
            }
            case R.id.action_settings:
                Toast.makeText(this, "Settings item is clicked", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button9:
                Intent lb = new Intent(this, LongBeach.class);
                startActivity(lb);
                break;
            case R.id.button4:
                Intent nf = new Intent(this, NiagraFalls.class);
                startActivity(nf);
                break;
            case R.id.button6:
                Intent sol = new Intent(this, StatueOfLiberty.class);
                startActivity(sol);
                break;
            case R.id.button7:
                Intent ts = new Intent(this, TimesSquare.class);
                startActivity(ts);
                break;
            case R.id.button5:
                Intent rc = new Intent(this, RockefellerCenter.class);
                startActivity(rc);
                break;
        }
    }
}
