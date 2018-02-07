package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by MAIN-ONO on 2/5/2018.
 */

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewholder> {

    private String[]mWeatherData;

    public ForecastAdapter(){

    }

    @Override
    public ForecastAdapterViewholder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItems = R.layout.forecast_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmidiately = false;

        View view = inflater.inflate(layoutIdForListItems, viewGroup,shouldAttachToParentImmidiately);
        return new ForecastAdapterViewholder(view);
    }

    @Override
    public void onBindViewHolder(ForecastAdapterViewholder holder, int position) {
      String dayWeather = mWeatherData[position];
       holder.mWeatherTextView.setText(dayWeather);
    }

    @Override
    public int getItemCount() {
       if (mWeatherData == null) return 0;
       return mWeatherData.length;
    }

    public class ForecastAdapterViewholder extends RecyclerView.ViewHolder {

        public final TextView mWeatherTextView;

        public ForecastAdapterViewholder(View view){
            super(view);

            mWeatherTextView = (TextView)view.findViewById(R.id.tv_weather_data);
        }
    }
    public void setmWeatherData(String[]weatherData){
        mWeatherData =weatherData;
        notifyDataSetChanged();

    }
}
