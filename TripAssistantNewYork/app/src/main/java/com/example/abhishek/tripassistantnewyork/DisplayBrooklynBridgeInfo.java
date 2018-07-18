package com.example.abhishek.tripassistantnewyork;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayBrooklynBridgeInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_brooklyn_bridge_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String message = intent.getStringExtra("name");
        EditText editTextMultibb=(EditText) findViewById(R.id.editTextbbet);
        editTextMultibb.setEnabled(false);
        editTextMultibb.setKeyListener(null);

        TextView bbstaytext1=(TextView)findViewById(R.id.textViewbbsr1);
        bbstaytext1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bbstaytext2=(TextView)findViewById(R.id.textViewbbsr2);
        bbstaytext2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bbstaytext3=(TextView)findViewById(R.id.textViewbbsr3);
        bbstaytext3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bbrestfirsttext=(TextView)findViewById(R.id.textViewbbres1);
        bbrestfirsttext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bbrestsecondtext=(TextView)findViewById(R.id.textViewbbres2);
        bbrestsecondtext.setMovementMethod(LinkMovementMethod.getInstance());

        TextView bbrestthirdtext=(TextView)findViewById(R.id.textViewbbres3);
        bbrestthirdtext.setMovementMethod(LinkMovementMethod.getInstance());



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    public void bbshareChooserIntent(View view)
    {
        try {
            final Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_SUBJECT, "Brooklyn Bridge Trip Information");
            intent.putExtra(Intent.EXTRA_TEXT, "Find the below details:-");
            startActivity(Intent.createChooser(intent, "Share the trip information through..."));
        }catch(Throwable t)
        {
            Toast.makeText(this, "Request failed try again: " + t.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
