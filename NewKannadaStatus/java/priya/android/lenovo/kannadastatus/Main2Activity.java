package priya.android.lenovo.kannadastatus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;

public class Main2Activity extends AppCompatActivity {
    private static final int START_LEVEL = 1;
    private static final String TOAST_TEXT = "Test ads are being shown. To show live ads, replace the ad unit ID in res/values/strings.xml with your own ad unit ID.";
    private InterstitialAd mInterstitialAd;
    private int mLevel;
    private TextView mLevelTextView;
    private Button mNextLevelButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        this.mNextLevelButton = (Button) findViewById(R.id.next_level_button);
        this.mNextLevelButton.setEnabled(false);
        this.mNextLevelButton.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Main2Activity.this.showInterstitial();
            }
        });
        this.mLevelTextView = (TextView) findViewById(R.id.level);
        this.mLevel = START_LEVEL;
        this.mInterstitialAd = newInterstitialAd();
        loadInterstitial();
        Toast.makeText(this, TOAST_TEXT, START_LEVEL).show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main2, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private InterstitialAd newInterstitialAd() {
        InterstitialAd interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getString(R.string.interstitial_ad_unit_id));
        interstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                Main2Activity.this.mNextLevelButton.setEnabled(true);
            }

            public void onAdFailedToLoad(int errorCode) {
                Main2Activity.this.mNextLevelButton.setEnabled(true);
            }

            public void onAdClosed() {
                Main2Activity.this.goToNextLevel();
            }
        });
        return interstitialAd;
    }

    private void showInterstitial() {
        if (this.mInterstitialAd == null || !this.mInterstitialAd.isLoaded()) {
            Toast.makeText(this, "Ad did not load", 0).show();
            goToNextLevel();
            return;
        }
        this.mInterstitialAd.show();
    }

    private void loadInterstitial() {
        this.mNextLevelButton.setEnabled(false);
        this.mInterstitialAd.loadAd(new Builder().setRequestAgent("android_studio:ad_template").build());
    }

    private void goToNextLevel() {
        TextView textView = this.mLevelTextView;
        StringBuilder append = new StringBuilder().append("Level ");
        int i = this.mLevel + START_LEVEL;
        this.mLevel = i;
        textView.setText(append.append(i).toString());
        this.mInterstitialAd = newInterstitialAd();
        loadInterstitial();
    }
}
