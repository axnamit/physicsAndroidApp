package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class thermom extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermom);

        pdfView=(PDFView)findViewById(R.id.ther);
        pdfView.fromAsset("therommetry13.pdf").load();
    }
}
