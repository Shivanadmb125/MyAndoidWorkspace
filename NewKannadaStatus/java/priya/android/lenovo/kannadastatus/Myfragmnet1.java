package priya.android.lenovo.kannadastatus;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class Myfragmnet1 extends Fragment {
    AdView adView2;
    CardView c1;
    CardView c10;
    CardView c11;
    CardView c12;
    CardView c2;
    CardView c3;
    CardView c4;
    CardView c5;
    CardView c6;
    CardView c7;
    CardView c8;
    CardView c9;
    Button chanakya;
    Button dialogue;
    Button gaade;
    int i;
    private InterstitialAd interstitialAd;
    Button jeevan;
    Button jokes;
    Button kategalu;
    Button man;
    MainActivity mn;
    Button preeti;
    Button shubashit;
    Button status;
    Button vachan;
    Button vagatu;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_myfragmnet1, container, false);
        MobileAds.initialize(getActivity(), "ca-app-pub-8352911767923333/9820205772");
        this.adView2 = (AdView) v.findViewById(R.id.adView2);
        AdRequest adRequest = new Builder().build();
        this.interstitialAd = new InterstitialAd(getActivity());
        this.interstitialAd.setAdUnitId("ca-app-pub-8352911767923333/6235349835");
        this.interstitialAd.loadAd(new Builder().build());
        this.c1 = (CardView) v.findViewById(R.id.card1);
        this.c2 = (CardView) v.findViewById(R.id.card2);
        this.c3 = (CardView) v.findViewById(R.id.card3);
        this.c4 = (CardView) v.findViewById(R.id.card4);
        this.c5 = (CardView) v.findViewById(R.id.card5);
        this.c6 = (CardView) v.findViewById(R.id.card6);
        this.c7 = (CardView) v.findViewById(R.id.card7);
        this.c8 = (CardView) v.findViewById(R.id.card8);
        this.c9 = (CardView) v.findViewById(R.id.card9);
        this.c10 = (CardView) v.findViewById(R.id.card10);
        this.c11 = (CardView) v.findViewById(R.id.card11);
        this.c12 = (CardView) v.findViewById(R.id.card12);
        this.preeti = (Button) v.findViewById(R.id.preeti);
        this.jeevan = (Button) v.findViewById(R.id.jeevan);
        this.status = (Button) v.findViewById(R.id.status);
        this.jokes = (Button) v.findViewById(R.id.jokes);
        this.shubashit = (Button) v.findViewById(R.id.shubashit);
        this.vachan = (Button) v.findViewById(R.id.vachana);
        this.gaade = (Button) v.findViewById(R.id.gaade);
        this.dialogue = (Button) v.findViewById(R.id.dialogue);
        this.vagatu = (Button) v.findViewById(R.id.vagatu);
        this.kategalu = (Button) v.findViewById(R.id.kategalu);
        this.man = (Button) v.findViewById(R.id.man);
        this.chanakya = (Button) v.findViewById(R.id.chanakya);
        this.interstitialAd.setAdListener(new AdListener() {
            public void onAdClosed() {
                super.onAdClosed();
                Myfragmnet1.this.interstitialAd.loadAd(new Builder().build());
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(Myfragmnet1.this.i);
            }
        });
        this.adView2.loadAd(adRequest);
        this.preeti.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 1;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(1);
            }
        });
        this.jeevan.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 2;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(2);
            }
        });
        this.status.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 3;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(3);
            }
        });
        this.jokes.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 4;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(4);
            }
        });
        this.shubashit.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 5;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(5);
            }
        });
        this.vachan.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 6;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(6);
            }
        });
        this.gaade.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 7;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(7);
            }
        });
        this.dialogue.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 8;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(8);
            }
        });
        this.vagatu.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 9;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(9);
            }
        });
        this.kategalu.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 10;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(10);
            }
        });
        this.man.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 11;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(11);
            }
        });
        this.chanakya.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 12;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(12);
            }
        });
        this.c1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 1;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(1);
            }
        });
        this.c2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 2;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(2);
            }
        });
        this.c3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 3;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(3);
            }
        });
        this.c4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 4;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(4);
            }
        });
        this.c5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 5;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(5);
            }
        });
        this.c6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 6;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(6);
            }
        });
        this.c7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 7;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(7);
            }
        });
        this.c8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 8;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(8);
            }
        });
        this.c9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 9;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(9);
            }
        });
        this.c10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 10;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(10);
            }
        });
        this.c11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 11;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(11);
            }
        });
        this.c12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (Myfragmnet1.this.interstitialAd.isLoaded()) {
                    Myfragmnet1.this.i = 12;
                    Myfragmnet1.this.interstitialAd.show();
                    return;
                }
                Myfragmnet1.this.mn = (MainActivity) Myfragmnet1.this.getActivity();
                Myfragmnet1.this.mn.f2(12);
            }
        });
        return v;
    }
}
