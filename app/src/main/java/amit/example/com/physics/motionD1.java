package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class motionD1 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motion_d1);

        pdfView=(PDFView)findViewById(R.id.motiond1);

        pdfView.fromAsset("motionOneDimension3.pdf").load();
    }
}
