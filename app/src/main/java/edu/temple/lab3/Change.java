package edu.temple.lab3;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by xxnoa_000 on 9/28/2017.
 */

public class Change extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.canvas);
        //setTitle("Canvas");

        String picked = getIntent().getStringExtra("color");

        if (picked.equals("red")||picked.equals("rojo")) {

            //view.setBackgroundColor(Color.RED);

            //Toast.makeText(getApplicationContext(), picked, Toast.LENGTH_SHORT).show();

            // setContentView(R.layout.canvas);
            getWindow().getDecorView().setBackgroundColor(Color.RED);



        }

        if (picked.equals("blue")||picked.equals("azul")) {

            //view.setBackgroundColor(Color.BLUE);
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }
        if (picked.equals("green")||picked.equals("verde")) {

            //view.setBackgroundColor(Color.GREEN);
            getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }
        if (picked.equals("yellow")||picked.equals("amarillo")) {

            //view.setBackgroundColor(Color.YELLOW);
            getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }
        if (picked.equals("gray")||picked.equals("gris")) {

            // view.setBackgroundColor(Color.GRAY);
            getWindow().getDecorView().setBackgroundColor(Color.GRAY);

        }
        if (picked.equals("black")||picked.equals("negro")) {

            // view.setBackgroundColor(Color.GRAY);
            getWindow().getDecorView().setBackgroundColor(Color.BLACK);

        }
        if (picked.equals("light gray")||picked.equals("gris claro")) {

            // view.setBackgroundColor(Color.GRAY);
            getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);

        }
        if (picked.equals("white")||picked.equals("blanco")) {

            // view.setBackgroundColor(Color.GRAY);
            getWindow().getDecorView().setBackgroundColor(Color.WHITE);

        }
        if (picked.equals("magenta")) {

            // view.setBackgroundColor(Color.GRAY);
            getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);

        }
        if (picked.equals("cyan")||picked.equals("cian")) {

            // view.setBackgroundColor(Color.GRAY);
            getWindow().getDecorView().setBackgroundColor(Color.CYAN);

        }
        //getWindow().getDecorView().setBackgroundColor(Color.GREEN);
    }

}
