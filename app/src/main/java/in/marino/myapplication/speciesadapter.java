package in.marino.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpeciesAdapter extends ArrayAdapter<Species>
{
    public SpeciesAdapter (Activity context, ArrayList<Species> speciesArrayList)
    {
        super(context, 0, speciesArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Species species = getItem(position);

        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.resources_item, parent, false);
        }

        ImageView speciesImage = (ImageView) convertView.findViewById(R.id.species_image);
        speciesImage.setImageResource(species.getImageId());

        TextView speciesName = (TextView) convertView.findViewById(R.id.species_name);
        speciesName.setText(species.getSpeciesBiology());

        return convertView;
    }
}
