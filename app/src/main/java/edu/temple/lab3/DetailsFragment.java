package edu.temple.lab3;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsFragment extends Fragment {

    TextView textView;

    View RootView;
    //String p="";

    public static DetailsFragment newInstance() {
        return new DetailsFragment();
    }

    public DetailsFragment() {
        // Required empty public constructor
    }


    /*@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        RootView = inflater.inflate(R.layout.fragment_details, container, false);

        textView=  (TextView)RootView.findViewById(R.id.det);


        /*if (p.equals("red")){
            t.setBackgroundColor(Color.RED);
        }

        if (p.equals("blue")){
            t.setBackgroundColor(Color.RED);
        }*/
            //t.setBackgroundColor(Color.RED);

            //Toast.makeText(getApplicationContext(), picked, Toast.LENGTH_SHORT).show();

            // setContentView(R.layout.canvas);
            //getWindow().getDecorView().setBackgroundColor(Color.RED);






        //return inflater.inflate(R.layout.fragment_details, container, false);
        return RootView;

    }

    void setMessage(String message){
        String picked= message;
        //p=message;
        //TextView tv=  (TextView)getView().findViewById(R.id.det);

       // t.setBackgroundColor(Color.RED);


        if (picked.equals("red")||picked.equals("rojo")) {

            textView.setBackgroundColor(Color.RED);

            //t.setText(message);
//            Toast.makeText(getContext(), picked, Toast.LENGTH_SHORT).show();

            // setContentView(R.layout.canvas);
            //getWindow().getDecorView().setBackgroundColor(Color.RED);



        }

        if (picked.equals("blue")||picked.equals("azul")) {

            //view.setBackgroundColor(Color.BLUE);
            textView.setBackgroundColor(Color.BLUE);
        }
        if (picked.equals("green")||picked.equals("verde")) {

            //view.setBackgroundColor(Color.GREEN);
            textView.setBackgroundColor(Color.GREEN);
        }
        if (picked.equals("yellow")||picked.equals("amarillo")) {

            //view.setBackgroundColor(Color.YELLOW);
            textView.setBackgroundColor(Color.YELLOW);
        }
        if (picked.equals("gray")||picked.equals("gris")) {

            // view.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.GRAY);

        }
        if (picked.equals("black")||picked.equals("negro")) {

            // view.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.BLACK);;

        }
        if (picked.equals("light gray")||picked.equals("gris claro")) {

            // view.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.LTGRAY);

        }
        if (picked.equals("white")||picked.equals("blanco")) {

            // view.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.WHITE);

        }
        if (picked.equals("magenta")) {

            // view.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.MAGENTA);

        }
        if (picked.equals("cyan")||picked.equals("cian")) {

            // view.setBackgroundColor(Color.GRAY);
            textView.setBackgroundColor(Color.CYAN);

        }

    }

}
