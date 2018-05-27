package priya.android.lenovo.kannadastatus;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Splashscreen extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_splashscreen, container, false);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                ((MainActivity) Splashscreen.this.getActivity()).f1();
            }
        }, 2000);
        return v;
    }
}
