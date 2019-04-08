package com.example.android.mynewsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context   of the app
     * @param last_news is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> last_news) {
        super(context, 0, last_news);

    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        // Find the news at the given position in the list of news
        News currentNews = getItem(position);

        // Find the TextView with view Section Id
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);
        // Format the magnitude to show 1 decimal place
        String formattedSection = currentNews.getSection();
        // Display the section of the current news in that TextView
        sectionView.setText(formattedSection);

        // Find the TextView with view ID title
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getTitle();
        // Display the location of the current earthquake in that TextView
        titleView.setText(title);

        // Find the TextView with view ID type
        TextView typeView = (TextView) listItemView.findViewById(R.id.type);
        String type = currentNews.getType();
        // Display the location offset of the current earthquake in that TextView
        typeView.setText(type);


        // Find the TextView with view ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        // Format the date string (i.e. "Mar 3, 1984")
        String date = currentNews.getDate();
        // Display the date of the current earthquake in that TextView
        dateView.setText(date);


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

}


