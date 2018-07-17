package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 17045740 on 17/7/2018.
 */

class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<ItemList> itemLists;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ItemList> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        itemLists = objects;
    }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater
                    = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(layout_id, parent, false);
            TextView tvname = rowView.findViewById(R.id.tvtodo);
            TextView tvdate = rowView.findViewById(R.id.tvdate);
            ItemList currentItem = itemLists.get(position);
            tvname.setText(currentItem.getName());
            tvdate.setText(currentItem.getDateString());
            return rowView;

    }
}
