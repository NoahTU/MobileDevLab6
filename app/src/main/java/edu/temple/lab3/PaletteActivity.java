package edu.temple.lab3;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class PaletteActivity extends AppCompatActivity implements NavFragment.SenderInterface{

    //Spinner spinnerColor;

    //DetailsFragment receiver= new DetailsFragment();

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



        //receiver = new DetailsFragment();


        /*getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_details, receiver)
                .commit();*/



        //  Determine if only one or two panes are visible
        twoPanes = (findViewById(R.id.fragment_details) != null);
        System.out.println(twoPanes);
        //System.out.println(twoPanes);

        if (getResources().getConfiguration().orientation==1){
            twoPanes=false;
        }

        //  Load navigation fragment by default
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_nav, new NavFragment());
        fragmentTransaction.commit();


        NavFragment sender = new NavFragment();

        //DetailsFragment receiver= new DetailsFragment();


        getFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_nav, sender)
                .commit();
        /*
         *  Check if details pain is visible in current layout (e.g. large or landscape)
         *  and load fragment if true.
         */
        if (twoPanes){

           /* fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.add(R.id.fragment_details, new DetailsFragment());
            System.out.println("MAKES IT HERE 0");
           // fragmentTransaction.add(R.id.fragment_nav, new NavFragment());
            fragmentTransaction.commit();
            getFragmentManager()
                    .executePendingTransactions();*/




            /*DetailsFragment receiver = new DetailsFragment();
            getFragmentManager()
                    .beginTransaction()
                    // .add(R.id.fragment_details, receiver)
                    .add(R.id.fragment_details, receiver)
                    .addToBackStack(null)
                    .commit();
            getFragmentManager()
                    .executePendingTransactions();*/


            DetailsFragment receiver = new DetailsFragment();
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fragment_details, receiver);
            fragmentTransaction.commit();



            System.out.println("MAKES IT HERE 1");
            //DetailsFragment receiver = new DetailsFragment();
            /*getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragment_details, receiver)
                    .commit();
            getFragmentManager()
                    .executePendingTransactions();*/
            System.out.println("MAKES IT HERE 2");
        }

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

        DetailsFragment receiver= new DetailsFragment();

        if (!twoPanes) {
            //DetailsFragment receiver= new DetailsFragment();
            //receiver = new DetailsFragment();

            //receiver.setMessage(message);
            getFragmentManager()
                    .beginTransaction()
                   // .add(R.id.fragment_details, receiver)
                    .replace(R.id.fragment_nav, receiver)
                    .addToBackStack(null)
                    .commit();
            getFragmentManager()
                    .executePendingTransactions();

            //receiver.setMessage(message);
            System.out.println(message);


           // findViewById(R.id.dett).setBackgroundColor(Color.BLACK);

            if (message.equals("red")||message.equals("rojo")) {

                findViewById(R.id.det).setBackgroundColor(Color.RED);

                //t.setText(message);
//            Toast.makeText(getContext(), picked, Toast.LENGTH_SHORT).show();

                // setContentView(R.layout.canvas);
                //getWindow().getDecorView().setBackgroundColor(Color.RED);



            }

            if (message.equals("blue")||message.equals("azul")) {

                //view.setBackgroundColor(Color.BLUE);
                findViewById(R.id.det).setBackgroundColor(Color.BLUE);
            }
            if (message.equals("green")||message.equals("verde")) {

                //view.setBackgroundColor(Color.GREEN);
                findViewById(R.id.det).setBackgroundColor(Color.GREEN);
            }
            if (message.equals("yellow")||message.equals("amarillo")) {

                //view.setBackgroundColor(Color.YELLOW);
                findViewById(R.id.det).setBackgroundColor(Color.YELLOW);
            }
            if (message.equals("gray")||message.equals("gris")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.GRAY);

            }
            if (message.equals("black")||message.equals("negro")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.BLACK);;

            }
            if (message.equals("light gray")||message.equals("gris claro")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.LTGRAY);

            }
            if (message.equals("white")||message.equals("blanco")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.WHITE);

            }
            if (message.equals("magenta")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.MAGENTA);

            }
            if (message.equals("cyan")||message.equals("cian")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.CYAN);

            }

        }
        else{
            //receiver.setMessage(message);
            if (message.equals("red")||message.equals("rojo")) {

                findViewById(R.id.det).setBackgroundColor(Color.RED);

                //t.setText(message);
//            Toast.makeText(getContext(), picked, Toast.LENGTH_SHORT).show();

                // setContentView(R.layout.canvas);
                //getWindow().getDecorView().setBackgroundColor(Color.RED);



            }

            if (message.equals("blue")||message.equals("azul")) {

                //view.setBackgroundColor(Color.BLUE);
                findViewById(R.id.det).setBackgroundColor(Color.BLUE);
            }
            if (message.equals("green")||message.equals("verde")) {

                //view.setBackgroundColor(Color.GREEN);
                findViewById(R.id.det).setBackgroundColor(Color.GREEN);
            }
            if (message.equals("yellow")||message.equals("amarillo")) {

                //view.setBackgroundColor(Color.YELLOW);
                findViewById(R.id.det).setBackgroundColor(Color.YELLOW);
            }
            if (message.equals("gray")||message.equals("gris")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.GRAY);

            }
            if (message.equals("black")||message.equals("negro")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.BLACK);;

            }
            if (message.equals("light gray")||message.equals("gris claro")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.LTGRAY);

            }
            if (message.equals("white")||message.equals("blanco")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.WHITE);

            }
            if (message.equals("magenta")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.MAGENTA);

            }
            if (message.equals("cyan")||message.equals("cian")) {

                // view.setBackgroundColor(Color.GRAY);
                findViewById(R.id.det).setBackgroundColor(Color.CYAN);

            }
        }


    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.switch_fragments) {
            //  Only display switch action if in single pane mode
            if (!twoPanes) {
                doTransition();
            } else {
                Toast.makeText(PaletteActivity.this, "Action Disabled", Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void doTransition(){
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_nav, new DetailsFragment())
                .addToBackStack(null)
                .commit();
    }*/


}
