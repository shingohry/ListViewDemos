package com.example.hirayashingo.listviewdemos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    // ListViewに表示するアイテム
    private static final String[] items = {
            "Mac",
            "iPad",
            "iPhone",
            "Watch",
            "TV"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ListViewを取得
        ListView listView = (ListView)findViewById(R.id.listView);

        // Adapterを作成
        ListAdapter adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        // ListViewにAdapterを設定
        listView.setAdapter(adapter);
    }
}
