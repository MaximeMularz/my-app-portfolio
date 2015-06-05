package com.hostabee.nanodegree;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches the spotifyStreamerButton */
    public void spotifyStreamer(View view) {
        makeToast("This button will load my spotify App");
    }

    /** Called when the user touches the scoresApp Button */
    public void scoresApp(View view) {
        makeToast("This button will load my scores App");
    }

    /** Called when the user touches the libraryApp Button */
    public void libraryApp(View view) {
        makeToast("This button will load my library App");
    }

    /** Called when the user touches the buildItBigger Button */
    public void buildItBigger(View view) {
        makeToast("This button will load my build it bigger App");
    }

    /** Called when the user touches the baconReader Button */
    public void baconReader(View view) {
        makeToast("This button will load my bacon reader app");
    }

    /** Called when the user touches the ownapp Button */
    public void capstoneMyOwnApp(View view) {
        makeToast("This button will load my own app");
    }

    /** Display toast with text as param */
    private void makeToast(String text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }





}
