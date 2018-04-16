package com.radomir.logocrack;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PickLevelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_level);

        String[] list = {"Level 1", "Level 2", "Level 3", "Retro 1"};

        final ListView listView = findViewById(R.id.LevelList);
        final PickLevelAdapter adaptor = new PickLevelAdapter(getApplicationContext(), R.layout.pick_level_list_layout, list);
        listView.setAdapter(adaptor);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, final View view, int position, long id) {
                view.animate().setDuration(2000).alpha(0).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        view.setAlpha(1);
                        Intent showQuestion = new Intent(PickLevelActivity.this, QuestionActivity.class);
                        startActivity(showQuestion);
                    }
                });
            }
        });
    }

    private class PickLevelAdapter extends BaseAdapter {

        private Context context;
        private int layoutResource;
        private String[] list;

        public PickLevelAdapter(Context context, int layoutResource, String[] list) {
            super();
            this.context = context;
            this.layoutResource = layoutResource;
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.length;
        }

        @Override
        public Object getItem(int position) {
            return list[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if(convertView == null) {
                LayoutInflater inflator = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflator.inflate(layoutResource, parent, false);
            }
            ((TextView)view.findViewById(R.id.pick_level_list_title)).setText(list[position]);
            return view;
        }
    }
}
