package in.marino.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class VideoActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_display);

        ArrayList<News> newsList = new ArrayList<News>();
        newsList.add(new News("Video headline 1", "Upload date 1", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 2", "Upload date 2", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 3", "Upload date 3", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 4", "Upload date 4", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 5", "Upload date 5", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 6", "Upload date 6", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 7", "Upload date 7", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 8", "Upload date 8", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 9", "Upload date 9", R.drawable.tw__ic_play_pressed));
        newsList.add(new News("Video headline 10", "Upload date 10", R.drawable.tw__ic_play_pressed));

        NewsAdapter newsAdapter = new NewsAdapter(this, newsList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(newsAdapter);
    }
}
