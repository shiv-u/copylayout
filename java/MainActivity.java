package com.androidexample.copyted;

import android.media.Image;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean firstpressed = true;
    private boolean secondpressed=true;
    public boolean third=true;
    public boolean radio=true;
    public boolean account=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display();
    }
    public void account_red(View view)
    {
        ImageButton button=(ImageButton) view;
        int icon;
        if(account)
        {
            account=false;
            icon=R.drawable.redaccount;
        }
        else
        {
            account=true;
            icon=R.drawable.ic_account_circle_black_24dp;

        }
        button.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),icon));
    }
    public void radio_red(View view)
    {
        ImageButton button=(ImageButton) view;
        int icon;
        if(radio)
        {
            radio=false;
            icon=R.drawable.redradio;

        }
        else
        {
            radio=true;
            icon=R.drawable.radio;

        }
        button.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),icon));

    }

    public void playlist_red(View view)
    {
        int icon;
        ImageButton button=(ImageButton) view;
        if(third)
        {
            third=false;
            icon=R.drawable.playlistred;


        }
        else
        {
           third=true;
            icon=R.drawable.ic_playlist_play_black_24dp;

        }
        button.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),icon));

    }

    public void display() {
        TextView yourtextview = findViewById(R.id.ted);
        String text = "<font color=#cc0029><b>TED</b></font> <font color=#cc0029>Talks</font>";
        yourtextview.setText(Html.fromHtml(text));
    }

    public void first_red(View view) {
        ImageButton button = (ImageButton) view;
        int icon;
        if (firstpressed) {
            firstpressed = false;
            icon = R.drawable.redlist;

        } else {
            firstpressed = true;
            icon = R.drawable.ic_list_black_24dp;


        }

        button.setImageDrawable(
                ContextCompat.getDrawable(getApplicationContext(), icon));


    }
    public void bulb_red(View view)
    {
        ImageButton button=(ImageButton) view;
        int icon;
        if(secondpressed)
        {
            secondpressed=false;
            icon=R.drawable.redbulb;


        }
        else
        {
            secondpressed=true;
            icon=R.drawable.ic_lightbulb_outline_black_24dp;

        }
        button.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),icon));
    }
}