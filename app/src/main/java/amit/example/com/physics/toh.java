package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class toh extends AppCompatActivity {
    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toh);
        pdfView=(PDFView)findViewById(R.id.toh33);
        pdfView.fromAsset("transmission16.pdf").load();
    }
}
