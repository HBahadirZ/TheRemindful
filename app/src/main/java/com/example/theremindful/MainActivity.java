package com.example.theremindful;

import android.app.Fragment;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity  {
    @Override // This method will override the OnCreate method from a superclass
              // (AppCompatActivity )
    protected void onCreate(Bundle savedInstanceState) {
        // OnCreate is being called to do the initial setup that Android requires
        // super notation means that this is a superclass
        super.onCreate(savedInstanceState);

        // this sets the UI layout for the activity by referencing the XML file
        // activity_main.xml
        setContentView(R.layout.activity_main);

        // this allows users to switch between different parts of the screen by tapping navigation
        // items
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);

        // this is a listener to respond to a navigation item (e.g., images, journal, music)
        // The navListener will determine which fragment should be displayed when an item is selected.

        bottomNav.setOnNavigationItemSelectedListener(navListener);

        // set the default fragment when the activity is first created
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new ImagesFragment()).commit();
    }
    // This listener is triggered whenever a navigation item in the BottomNavigationView is selected.
    // It helps switch between different fragments based on the selected item.
    private BottomNavigationView,OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        // noNull means it can never be null
        public boolean onNavigationItemSelected(@NoNull MenuItem item) {
            // the fragment variable that will hold the fragment to be displayed
            Fragment selectedFragment = null;

            // the switch statement to check which nav item is selected
            switch (item.getItemId()) {
                case R.id.nav_images:
                    // if the images item selected it creates a new instance of images
                    selectedFragment = new ImagesFragment();
                    break;
                case R.id.nav_journal:
                    // If the journal item is selected it creates a new instance of journal
                    selectedFragment = new JournalFragment();
                    break;
                case R.id.nav_music:
                    selectedFragment = new MusicFragment();
                    break;
                case R.id.nav_tasks:
                    selectedFragment = new TasksFragment();
                    break;
            }
            // Once the appropriate fragment is determined, this code replaces the current fragment
            // in the fragment_container with the selected fragment. This is what makes the content
            // of the screen change based on the user's selection.
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();

            // return true to indicate that the item was successfully handled
            return true;

        }
    };
}
