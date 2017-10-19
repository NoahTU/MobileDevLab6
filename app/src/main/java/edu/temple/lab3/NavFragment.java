package edu.temple.lab3;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class NavFragment extends Fragment {
    private ArrayAdapter<String> adapter;

    SenderInterface activty;

    GridView gridview;
    View v;

    /*public NavFragment() {
        // Required empty public constructor
    }*/

    public static NavFragment newInstance() {
        return new NavFragment();
    }

    @Override
    public void onAttach(Activity c) {
        super.onAttach(c);
        activty = (SenderInterface) c;
    }


    /*@Override
    public void onDetach() {
        activty = null;
    }*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        v= inflater.inflate(R.layout.fragment_nav, container, false);
        Resources res = this.getResources();

        String[] gridLabels= res.getStringArray(R.array.colors_array);
        gridview = (GridView) v.findViewById(R.id.grid);


        //spinnerColor = (Spinner)findViewById(R.id.spinner);

        //adapter = new ArrayAdapter<String>(this, android.R.layout.simple_gallery_item, colors);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // spinnerColor.setAdapter(adapter);

    /*adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, gridLabels);*/

        gridview.setAdapter(new CustomAdapter(getActivity(), gridLabels));

        //gridview.setAdapter(new CustomGridAdapter( this, colors ));

        //spinnerColor.setSelection(0);

        //onclicklistener
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String picked="";
                picked = adapterView.getItemAtPosition(i).toString();

                System.out.println("hey!"+picked);
                activty.acceptMessage(picked);
                /*int count=0;
                String c;

                while (count<colors.length){
                    c=colors[count];
                    view.setBackgroundColor(Color.BLUE);
                    getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                    count++;
                }*/



                /*Intent launchBoardActivity = new Intent(PaletteActivity.this, Change.class);
                launchBoardActivity.putExtra("color", picked);
                startActivity(launchBoardActivity);*/



            }
        });



        return v;
    }

    public interface SenderInterface {
        public void acceptMessage(String message);
    }

}
