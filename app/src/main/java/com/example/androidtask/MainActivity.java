package com.example.androidtask;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.androidtask.Adapter.Adapter1;
import com.example.androidtask.models.Item;
import com.example.androidtask.models.Item1;
import com.example.androidtask.models.Item2;
import com.example.androidtask.models.Item3;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerViewId);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        List<Item> items = new ArrayList<>();
        Item3 item31 = new Item3("Treehouse Hideaway", "Live the real Jungle Book experience perched high above the treetops inside India’s most popular tiger reserve – Bandhavgarh National Park. Spread over a large forested estate, Treehouse Hideaway strikes the perfect balance between rustic-chic and luxury, with high exposed beams framing the ceilings and plush furnishings to keep you comfortable.", Color.argb(255, 255, 178, 102), Color.argb(45, 255, 0, 102));
        items.add(new Item(2, item31));
        Item1 item12 = new Item1(R.drawable.img2, "Explore shades of green", "Lavish Greens", Color.argb(255, 0, 102, 0), Color.argb(255, 204, 255, 204));
        items.add(new Item(0, item12));
        Item2 item22 = new Item2("Bring flower power to your house!", R.drawable.rose, Color.argb(180, 255, 153, 204));
        items.add(new Item(1, item22));
        Item1 item11 = new Item1(R.drawable.img3, "The Night Sky", "Mountains Calling!", Color.argb(255, 0, 51, 102), Color.argb(255, 204, 229, 255));
        items.add(new Item(0, item11));
        Item2 item21 = new Item2("Earth provides enough to satisfy every man's needs, but not every man's greed. Save Earth Campaign!", R.drawable.earthday, Color.argb(180, 0, 59, 0));
        items.add(new Item(1, item21));
        Item2 item2 = new Item2("Live Webinar on Cloud and Thunderstorm formation. Join Now!", R.drawable.thunderstorm, Color.argb(180, 70, 130, 180));
        items.add(new Item(1, item2));
        Item1 item1 = new Item1(R.drawable.img1, "Explore More", "The freshness of the fields", Color.argb(255, 204, 102, 0), Color.argb(255, 255, 229, 204));
        items.add(new Item(0, item1));
        Item3 item3 = new Item3("Tierra Chiloé", "The uniquely designed Tierra Chiloé occupies pride of place in the mysterious Chiloé archipelago, offering breathtaking views of the islands from its 12 exclusive rooms. The hotel has been built to optimize the use of renewable resources, and benefit the local community through employment opportunities and low-impact tourism, while offering every conceivable luxury. Enjoy leisurely boat rides through tranquil waterways, see a host of wildlife, and learn about local legends and customs from the expert Chilean staff.", Color.argb(255, 160, 160, 160), Color.argb(45, 0, 160, 160));
        items.add(new Item(2, item3));
        Item2 item23 = new Item2("Ever wondered, where does these fruits get their colors from?", R.drawable.fruit, Color.argb(180, 204, 0, 0));
        items.add(new Item(1, item23));
        Item3 item32 = new Item3("Send Bonsai", "", Color.argb(255, 139, 0, 0), Color.argb(45, 220, 20, 60));
        items.add(new Item(2, item32));

        recyclerView.setAdapter(new Adapter1(items));
    }
}