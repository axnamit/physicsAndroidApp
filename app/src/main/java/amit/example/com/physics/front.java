package amit.example.com.physics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class front extends AppCompatActivity {
    Button button,btn;
    private AdView mAdView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        button=(Button)findViewById(R.id.button2);
        btn=(Button)findViewById(R.id.button3);

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(front.this,MainActivity.class);
                    startActivity(intent);
                }
            });
        MobileAds.initialize(this,"ca-app-pub-3819211104411482~5304634511");

        mAdView =findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(front.this,about.class);
            startActivity(intent);
        }
    });
    }
}
