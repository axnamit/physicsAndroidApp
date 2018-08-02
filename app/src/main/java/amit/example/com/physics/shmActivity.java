package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class shmActivity extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shm);
        pdfView=(PDFView)findViewById(R.id.shmView);
        pdfView.fromAsset("shm17.pdf").load();
    }
}
