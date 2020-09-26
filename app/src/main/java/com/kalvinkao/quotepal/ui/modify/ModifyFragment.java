package com.kalvinkao.quotepal.ui.modify;

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

public class ModifyFragment extends Fragment {

    private ModifyViewModel modifyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modifyViewModel =
                ViewModelProviders.of(this).get(ModifyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_modify, container, false);


        return root;
    }
}