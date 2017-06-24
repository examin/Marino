package in.marino.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News>
{
    public NewsAdapter (Activity context, ArrayList<News> newsArrayList)
    {
        super(context, 0, newsArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.new_item, parent, false);
        }

        // Get the {@link News} object located at this position in the list
        News currentNews = getItem(position);

        // Find the TextView in the resources_item.xml layout with the ID version_name
        TextView headlineTextView = (TextView) listItemView.findViewById(R.id.item_headline);
        // Get the version headline from the current News object and
        // set this text on the name TextView
        headlineTextView.setText(currentNews.getHeadline());

        // Find the TextView in the resources_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.item_upload_date);
        // Get the upload date from the current News object and
        // set this text on the number TextView
        numberTextView.setText(currentNews.getUploadDate());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.item_image);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        iconView.setImageResource(currentNews.getImageId());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
