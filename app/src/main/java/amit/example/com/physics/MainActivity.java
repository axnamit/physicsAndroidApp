package amit.example.com.physics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
public Button vector,unit,motion1,Ktg,thermomm,motion2,NLM1,friction,wpe,toh2,RM1,Gravity11,elastic,surfaceT,fluieM,thermoDy,shmbutton,wavebutton;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vector=(Button)findViewById(R.id.vector);
        unit=(Button)findViewById(R.id.unitD);
        motion1=(Button)findViewById(R.id.motion11);
        motion2=(Button)findViewById(R.id.motion22);
        NLM1=(Button)findViewById(R.id.NLM1);
        friction=(Button)findViewById(R.id.FRICTION);
        wpe=(Button)findViewById(R.id.WPE);
        RM1=(Button)findViewById(R.id.rm1);
        Gravity11=(Button)findViewById(R.id.gravity1);
        elastic=(Button)findViewById(R.id.el);
        surfaceT=(Button)findViewById(R.id.surface);
        fluieM=(Button)findViewById(R.id.fm);
        thermomm=(Button)findViewById(R.id.thermo);
        Ktg=(Button)findViewById(R.id.ktg);
        thermoDy=(Button)findViewById(R.id.thermodynamics);
        toh2=(Button)findViewById(R.id.TOH);
        shmbutton=(Button)findViewById(R.id.SHM);
        wavebutton=(Button)findViewById(R.id.WAS);

        vector.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vectorIntent=new Intent(MainActivity.this,vector_layout.class);
                startActivity(vectorIntent);
            }
        });
        unit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,UnitDimension.class);
                startActivity(i);


            }
        });
        motion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I=new Intent(MainActivity.this,motionD1.class);
                startActivity(I);

            }
        });
        motion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MotionD2.class);
                startActivity(intent);
            }
        });
        NLM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,newtonLaw1.class);
                startActivity(intent);
            }
        });
        friction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,frictionA.class);
                startActivity(intent);
            }
        });

        wpe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Wpe.class);
                startActivity(intent);
            }
        });
        RM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,rm1.class);
                startActivity(intent);
            }
        });

        Gravity11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Gravity.class);
                startActivity(intent);
            }
        });
        elastic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Elasticity.class);
                startActivity(intent);
            }
        });
        surfaceT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,SurfaceTension.class);
                startActivity(intent);
            }
        });
        fluieM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FluidMechanics.class);
                startActivity(intent);
            }
        });
        thermomm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,thermom.class);
                startActivity(intent);
            }
        });
        Ktg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ktglay.class);
                startActivity(intent);
            }
        });
        thermoDy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Thermodynamics.class);
                startActivity(intent);
            }
        });
        toh2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,toh.class);
                startActivity(intent);
            }
        });
        shmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,shmActivity.class);
                startActivity(intent);
            }
        });
        wavebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,waveActivity.class);
                startActivity(intent);
            }
        });
        MobileAds.initialize(this,"ca-app-pub-3819211104411482~5304634511");

        mAdView =findViewById(R.id.adView);
        AdRequest adRequest=new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }
}
