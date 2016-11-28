package appewtc.masterung.myshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Pc on 9/11/2559.
 */

public class FoodAdapter extends BaseAdapter {
    //Explicit
    private Context context;
    private String[] iconString,titleString,priceString;
    public FoodAdapter(Context context,
                       String[] iconString,
                       String[] titleString,
                       String[] priceString){
        this.context = context;
        this.iconString = iconString;
        this.priceString = priceString;
    }   //constructor
    @Override
    public int getCount() {
        return iconString.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.product_listview,viewGroup,false);
        return null;
    }
}   //Main class
