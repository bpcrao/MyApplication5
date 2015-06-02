package com.example.gouthami.myapplication5;

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

    /** Called when the user touches the button */
    public void sendMessageCapstone(View view) {
        showToaster(getResources().getString(R.string.mess_capstone));
    }

    private void showToaster(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void sendMessageSpotify(View view) {
        showToaster(getResources().getString(R.string.mess_spotify));
    }

    public void sendMessageScores(View view){
        showToaster(getResources().getString(R.string.mess_scores));
    }

    public void sendMessageLibrary(View view){
        showToaster(getResources().getString(R.string.mess_library));
    }

    public void sendMessageBuildBig(View view){
        showToaster(getResources().getString(R.string.mess_buildbig));
    }

    public void sendMessageXYZ(View view){
        showToaster(getResources().getString(R.string.mess_xyz));
    }
}
