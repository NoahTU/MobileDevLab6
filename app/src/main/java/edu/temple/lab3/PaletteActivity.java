package edu.temple.lab3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PaletteActivity extends AppCompatActivity implements NavFragment.SenderInterface{

    //Spinner spinnerColor;

    DetailsFragment receiver;

    GridView gridview;

    boolean twoPanes;

    private ArrayAdapter<String> adapter;

    private static final String[] colors= {
                "red",
                "blue",
                "green",
                "yellow",
                "gray",
            "black",
            "light gray",
            "white",
            "magenta",
            "cyan",
    };


    //private static final String[] gridLabels= res.getStringArray(R.array.colors_array);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);



        receiver = new DetailsFragment();
        NavFragment sender = new NavFragment();



        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_nav, sender)
                .commit();

        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_details, receiver)
                .commit();

        //getWindow().getDecorView().setBackgroundColor(Color.RED);
        /*ArrayAdapter<String> adapter;

        String[] colors = {
                "Colors",
                "red",
                "blue",
                "green",
                "black",
                "white",
                "yellow",
        };*/


        //  Determine if only one or two panes are visible
        twoPanes = (findViewById(R.id.fragment_details) != null);
        System.out.println(twoPanes);

        //  Load navigation fragment by default
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_nav, new NavFragment());
        fragmentTransaction.commit();

        /*
         *  Check if details pain is visible in current layout (e.g. large or landscape)
         *  and load fragment if true.
         */
        //if (twoPanes){
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_details, new DetailsFragment());
            fragmentTransaction.commit();
       // }

        /*Resources res = this.getResources();
        String[] gridLabels= res.getStringArray(R.array.colors_array);
        gridview = (GridView) findViewById(R.id.grid);


        //spinnerColor = (Spinner)findViewById(R.id.spinner);

        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, colors);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       // spinnerColor.setAdapter(adapter);

    //adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, gridLabels);

        gridview.setAdapter(new CustomAdapter(this, gridLabels));

        //gridview.setAdapter(new CustomGridAdapter( this, colors ));

        //spinnerColor.setSelection(0);

        //onclicklistener
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String picked = adapterView.getItemAtPosition(i).toString();





                Intent launchBoardActivity = new Intent(PaletteActivity.this, Change.class);
                launchBoardActivity.putExtra("color", picked);
                startActivity(launchBoardActivity);


            }
        });*/

    }

    @Override
    public void acceptMessage(String message) {
        System.out.println("BOI "+message);
        receiver.setMessage(message);
    }
}
