package com.example.hp.hbd_shiva;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<DataModel> implements View.OnClickListener{

    private ArrayList<DataModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView text1;
        TextView text2;
        ImageView img;
    }

    public CustomAdapter(ArrayList<DataModel> data, Context context) {
        super(context, R.layout.row, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {

        int position=(Integer) v.getTag();
        Object object= getItem(position);
        DataModel dataModel=(DataModel)object;


    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        DataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {



            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row, parent, false);
            viewHolder.text1 = (TextView) convertView.findViewById(R.id.text1);
            Typeface face=Typeface.createFromAsset(mContext.getAssets(),"fonts/dancing.ttf");
            Typeface face2=Typeface.createFromAsset(mContext.getAssets(),"fonts/lobster.ttf");

            viewHolder.text1.setTypeface(face);
            viewHolder.text2 = (TextView) convertView.findViewById(R.id.text2);
            viewHolder.text2.setTypeface(face2);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }


        lastPosition = position;

        viewHolder.text1.setText(dataModel.gettext1());

        viewHolder.text2.setText(dataModel.gettext2());
        viewHolder.img.setImageResource(dataModel.getimg());
        viewHolder.img.setOnClickListener(this);
        viewHolder.img.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }
}