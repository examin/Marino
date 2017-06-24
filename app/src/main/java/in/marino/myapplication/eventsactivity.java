package in.marino.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_display);

        ArrayList<News> newsList = new ArrayList<News>();
        newsList.add(new News("Event headline 1", "Upload date 1", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 2", "Upload date 2", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 3", "Upload date 3", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 4", "Upload date 4", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 5", "Upload date 5", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 6", "Upload date 6", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 7", "Upload date 7", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 8", "Upload date 8", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 9", "Upload date 9", R.drawable.ic_event_black_24dp));
        newsList.add(new News("Event headline 10", "Upload date 10", R.drawable.ic_event_black_24dp));

        NewsAdapter newsAdapter = new NewsAdapter(this, newsList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(newsAdapter);
    }
}
