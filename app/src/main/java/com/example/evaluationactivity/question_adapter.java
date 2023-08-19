package com.example.evaluationactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class question_adapter extends ArrayAdapter<question_list> {

    public question_adapter(@NonNull Context context, ArrayList<question_list> RatingModelArrayList) {
        super(context, 0, RatingModelArrayList);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in listview.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.rating_qeustion_design, parent, false);
        }

        question_list question = getItem(position);

        TextView userName;
        TextView id;
        TextView qu;
        RatingBar ratingBar;
        EditText msg;

        userName = listitemView.findViewById(R.id.txt_name);
        id =listitemView.findViewById(R.id.txt_id);
        qu =listitemView.findViewById(R.id.txt_qu);
        ratingBar= listitemView.findViewById(R.id.rating);
        msg = listitemView.findViewById(R.id.message);

        userName.setText(question.getUserName());
        id.setText(question.getUserID());
        qu.setText(question.getQuetions());
        ratingBar.setRating(question.getRating());
        msg.setText(question.getYourOpinion());



        return listitemView;
    }
    }
