package in.marino.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ScientistActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scientist);

        View news = findViewById(R.id.news_text_views);
        View events = findViewById(R.id.events_text_views);
        View video = findViewById(R.id.video_text_views);
        View search = findViewById(R.id.search_text_views);

        news.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ScientistActivity.this, NewsActivity.class));
            }
        });

        events.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ScientistActivity.this, EventsActivity.class));
            }
        });

        video.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(ScientistActivity.this, VideoActivity.class));
            }
        });

//        search.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//
//            public void onClick(View v)
//            {
//                startActivity(new Intent(ScientistActivity.this, SearchActivity.class));
//            }
//        });
    }
}
