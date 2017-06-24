package in.marino.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_display);

        ArrayList<News> newsList = new ArrayList<News>();
        newsList.add(new News("News headline 1", "Upload date 1"));
        newsList.add(new News("News headline 2", "Upload date 2"));
        newsList.add(new News("News headline 3", "Upload date 3"));
        newsList.add(new News("News headline 4", "Upload date 4"));
        newsList.add(new News("News headline 5", "Upload date 5"));
        newsList.add(new News("News headline 6", "Upload date 6"));
        newsList.add(new News("News headline 7", "Upload date 7"));
        newsList.add(new News("News headline 8", "Upload date 8"));
        newsList.add(new News("News headline 9", "Upload date 9"));
        newsList.add(new News("News headline 10", "Upload date 10"));


        NewsAdapter newsAdapter = new NewsAdapter(this, newsList);

        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(newsAdapter);
    }
}
