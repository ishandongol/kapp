package com.bitcakecodes.kapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class BlocksActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_block);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Intent intent_to_main = new Intent(BlocksActivity.this, MainActivity.class);
            startActivity(intent_to_main);
            finish();
            //super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_ku) {
            Intent intent_main = new Intent(BlocksActivity.this, MainActivity.class);
            startActivity(intent_main);
            finish();
        }

        else if(id == R.id.nav_blocks){
            Toast.makeText(this, "Blocks.",
                    Toast.LENGTH_LONG).show();
        }

        else if (id == R.id.nav_us) {
            Toast.makeText(this, "About Us",
                    Toast.LENGTH_LONG).show();


        }

        else if (id == R.id.nav_share) {

            // Create the text message with a string
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_SUBJECT, "I am in Computer Department");
            sendIntent.setType("text/plain");

            // Verify that the intent will resolve to an activity
            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(sendIntent);
            }
            else{
                Toast.makeText(this, "Cannot open SMS app.", Toast.LENGTH_SHORT).show();
            }



        } else if (id == R.id.nav_send) {


            Intent sendIntent = new Intent(Intent.ACTION_SENDTO);
            sendIntent.setData(Uri.parse("smsto:"));

            sendIntent.putExtra("sms_body", "I am in computer department");

            if (sendIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(sendIntent);
            }
            else{
                Toast.makeText(this, "Cannot open SMS app.", Toast.LENGTH_SHORT).show();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void dispDepartmentInfo(View view){

        String [] key;
        key = new String[2];
        Intent intent = new Intent(this, ScrollingActivity.class);
        Bundle mBundle = new Bundle();
        key[0]="BlocksActivity";
        switch (view.getId()) {
            case R.id.one:
                key[1]="1";
                break;
            case R.id.two:
                key[1]="2";
                break;
            case R.id.three:
                key[1]="3";
                break;
            case R.id.four:
                key[1]="4";
                break;
            case R.id.five:
                key[1]="5";
                break;
            case R.id.six:
                key[1]="6";
                break;
            case R.id.seven:
                key[1]="7";
                break;
            case R.id.eight:
                key[1]="8";
                break;
            case R.id.nine:
                key[1]="10";
                break;
            case R.id.ten:
                key[1]="10";
                break;
            case R.id.eleven:
                key[1]="9";
                break;
            case R.id.twelve:
                key[1]="12";
                break;
            case R.id.thirteen:
                key[1]="13";
                break;
            case R.id.fourteen:
                key[1]="14";
                break;
            case R.id.fifteen:
                key[1]="15";
                break;
            case R.id.sixteen:
                key[1]="16";
                break;
            case R.id.seventeen:
                key[1]="17";
                break;
            case R.id.eighteen:
                key[1]="18";
                break;
            case R.id.nineteen:
                key[1]="19";
                break;
            case R.id.twenty:
                key[1]="20";
                break;
            case R.id.twentyone:
                key[1]="21";
                break;
            case R.id.twentytwo:
                key[1]="22";
                break;
            case R.id.twentythree:
                key[1]="23";
                break;
            case R.id.twentyfour:
                key[1]="24";
                break;
            case R.id.twentyfive:
                key[1]="25";
                break;
            case R.id.twentysix:
                key[1]="26";
                break;
            case R.id.twentyseven:
                key[1]="27";
                break;
            case R.id.twentyeight:
                key[1]="28";
                break;
            case R.id.twentynine:
                key[1]="29";
                break;
            case R.id.thirty:
                key[1]="30";
                break;
            case R.id.thirtyone:
                key[1]="31";
                break;
            case R.id.thirtytwo:
                key[1]="32";
                break;
            case R.id.thirtythree:
                key[1]="33";
                break;
            case R.id.thirtyfour:
                key[1]="34";
                break;

        }
        mBundle.putStringArray("data", key);
        intent.putExtras(mBundle);
        startActivity(intent);
        finish();

    }


}