package priya.android.lenovo.kannadastatus;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        FragmentTransaction tt = getSupportFragmentManager().beginTransaction();
        tt.add(R.id.fram1, new Splashscreen());
        tt.commit();
    }

    public void f1() {
        FragmentTransaction tt = getSupportFragmentManager().beginTransaction();
        tt.replace(R.id.fram1, new Myfragmnet1());
        tt.commit();
    }

    public void f2(int i) {
        FragmentTransaction tt = getSupportFragmentManager().beginTransaction();
        Myfragment2 m2 = new Myfragment2();
        Bundle b = new Bundle();
        b.putInt("s", i);
        m2.setArguments(b);
        tt.replace(R.id.fram1, m2);
        tt.addToBackStack(null);
        tt.commitAllowingStateLoss();
    }
}
