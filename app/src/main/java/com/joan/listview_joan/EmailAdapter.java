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
        TextView textViewName = convertView.findViewById(R.id.textViewName);
        ImageView imageViewRead = convertView.findViewById(R.id.imageViewRead);

        EmailItem item = getItem(position);
        imageViewProfile.setImageResource(item.getImageResource());
        textViewName.setText(item.getName());
        imageViewRead.setVisibility(item.isRead() ? View.INVISIBLE : View.VISIBLE);

        return convertView;
    }
}
