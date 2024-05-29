package com.joan.listview_joan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class EmailAdapter extends ArrayAdapter<EmailItem> {

    public EmailAdapter(Context context, List<EmailItem> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_email, parent, false);
        }

        ImageView imageViewProfile = convertView.findViewById(R.id.imageViewProfile);
        TextView textViewDate = convertView.findViewById(R.id.textViewDate);
        TextView textViewTitle = convertView.findViewById(R.id.textViewTitle);
        TextView textViewPreview = convertView.findViewById(R.id.textViewPreview);
        TextView textViewCountry = convertView.findViewById(R.id.textViewCountry);
        ImageView imageViewRead = convertView.findViewById(R.id.imageViewRead);

        EmailItem item = getItem(position);
        imageViewProfile.setImageResource(item.getImageResource());
        textViewDate.setText(item.getDate());
        textViewTitle.setText(item.getTitle());
        textViewPreview.setText(item.getPreview());
        textViewCountry.setText(item.getCountry());
        imageViewRead.setVisibility(item.isRead() ? View.INVISIBLE : View.VISIBLE);

        return convertView;
    }
}
