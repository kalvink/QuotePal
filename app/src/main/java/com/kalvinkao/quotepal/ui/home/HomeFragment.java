package com.kalvinkao.quotepal.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.quotepal.R;

import java.util.Calendar;
import java.util.TimeZone;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //Date
        final TextView textView = root.findViewById(R.id.text_date);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int year = calendar.get(Calendar.YEAR);
        int m = calendar.get(Calendar.MONTH);
        String month = "January";
        if (m == 0) {
            month = "January";
        } else if (m == 1) {
            month = "February";
        } else if (m == 2) {
            month = "March";
        } else if (m == 3) {
            month = "April";
        } else if (m == 4) {
            month = "May";
        } else if (m == 5) {
            month = "June";
        } else if (m == 6) {
            month = "July";
        } else if (m == 7) {
            month = "August";
        } else if (m == 8) {
            month = "September";
        } else if (m == 9) {
            month = "October";
        } else if (m == 10) {
            month = "November";
        } else if (m == 11) {
            month = "December";
        }
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int dow = calendar.get(Calendar.DAY_OF_WEEK);
        String dayofweek = "Sunday";
        if (dow == 1) {
            dayofweek = "Sunday";
        } else if (dow == 2) {
            dayofweek = "Monday";
        } else if (dow == 3) {
            dayofweek = "Tuesday";
        } else if (dow == 4) {
            dayofweek = "Wednesday";
        } else if (dow == 5) {
            dayofweek = "Thursday";
        } else if (dow == 6) {
            dayofweek = "Friday";
        } else if (dow == 7) {
            dayofweek = "Saturday";
        }
        textView.setText(dayofweek + ", " + month + " " + day + ", " + year);

        return root;
    }


}