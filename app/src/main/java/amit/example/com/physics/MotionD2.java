package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MotionD2 extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_d2);

        pdfView=(PDFView)findViewById(R.id.motiond2);

        pdfView.fromAsset("motionTwoDimension4.pdf").load();
    }
}
