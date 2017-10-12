package edu.temple.lab3;

import android.content.Intent;
import android.graphics.Color;
import android.widget.BaseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter {

    String [] result;
    private Context context;
    private static LayoutInflater inflater=null;
    //private Context c;
    public CustomAdapter(Context main, String[] prgmNameList) {
        // TODO Auto-generated constructor stub
        result=prgmNameList;
        this.context=main;
       // inflater = ( LayoutInflater )context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return result[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        final View rowView;
        final TextView tv;

       /*if (convertView != null){
            rowView= convertView;
           tv = (TextView) convertView;

        }
        else{
           tv= new TextView(context);
           tv.setLayoutParams(new GridView.LayoutParams(1000,85));
            rowView= new View(context);
        }*/

        tv= new TextView(context);


        if (position==0){
            tv.setBackgroundColor(Color.RED);
        }
        if (position==1){
            tv.setBackgroundColor(Color.BLUE);
        }
        if (position==2){
            tv.setBackgroundColor(Color.GREEN);
        }
        if (position==3){
            tv.setBackgroundColor(Color.YELLOW);
        }
        if (position==4){
            tv.setBackgroundColor(Color.GRAY);
        }
        if (position==5){
            tv.setBackgroundColor(Color.BLACK);
        }
        if (position==6){
            tv.setBackgroundColor(Color.LTGRAY);
        }
        if (position==7){
            tv.setBackgroundColor(Color.WHITE);
        }
        if (position==8){
            tv.setBackgroundColor(Color.MAGENTA);
        }
        if (position==9){
            tv.setBackgroundColor(Color.CYAN);
        }



        /*tv.setBackgroundColor(Color.RED);
        tv.setBackgroundColor(Color.BLUE);
        tv.setBackgroundColor(Color.GREEN);
        tv.setBackgroundColor(Color.YELLOW);
        tv.setBackgroundColor(Color.GRAY);
        tv.setBackgroundColor(Color.BLACK);
        tv.setBackgroundColor(Color.LTGRAY);
        tv.setBackgroundColor(Color.WHITE);
        tv.setBackgroundColor(Color.MAGENTA);
        tv.setBackgroundColor(Color.CYAN);*/

        tv.setText(result[position]);

        /*tv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                //Toast.makeText(context, "You Clicked "+result[position], Toast.LENGTH_LONG).show();



                String picked = result[position];

                if (picked.equals("red")){

                    tv.setBackgroundColor(Color.RED);


                    Intent launchBoardActivity = new Intent(PaletteActivity.this, Change.class);
                    launchBoardActivity.putExtra("red", "red");
                    startActivity(launchBoardActivity);

                    /*Toast.makeText(getApplicationContext(),
                            picked, Toast.LENGTH_SHORT).show();

                    setContentView(R.layout.canvas);
                    getWindow().getDecorView().setBackgroundColor(Color.RED);
                }
                if (picked.equals("blue")){

                    tv.setBackgroundColor(Color.BLUE);

                    //setContentView(R.layout.canvas);
                    //getWindow().getDecorView().setBackgroundColor(Color.BLUE);
                }
                if (picked.equals("green")){

                    tv.setBackgroundColor(Color.GREEN);
                    //getWindow().getDecorView().setBackgroundColor(Color.GREEN);
                }
                if (picked.equals("yellow")){

                    tv.setBackgroundColor(Color.YELLOW);
                    //getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
                }
                if (picked.equals("gray")){

                    tv.setBackgroundColor(Color.GRAY);
                    //getWindow().getDecorView().setBackgroundColor(Color.GRAY);

                }
                if (picked.equals("black")){

                    tv.setBackgroundColor(Color.GRAY);
                    //getWindow().getDecorView().setBackgroundColor(Color.BLACK);

                }
                if (picked.equals("light gray")){

                    tv.setBackgroundColor(Color.LTGRAY);
                    //getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);

                }
                if (picked.equals("white")){

                    tv.setBackgroundColor(Color.WHITE);
                    //getWindow().getDecorView().setBackgroundColor(Color.WHITE);

                }
                if (picked.equals("magenta")){

                    tv.setBackgroundColor(Color.MAGENTA);
                    //getWindow().getDecorView().setBackgroundColor(Color.MAGENTA);

                }
                if (picked.equals("cyan")){

                    tv.setBackgroundColor(Color.CYAN);
                    //getWindow().getDecorView().setBackgroundColor(Color.CYAN);

                }

            }
        });*/

        //return rowView;
        return tv;
    }

} 