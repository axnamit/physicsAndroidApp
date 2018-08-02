package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Thermodynamics extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thermodynamics);
        pdfView=(PDFView)findViewById(R.id.Dyther);
        pdfView.fromAsset("theromodynamics15.pdf").load();
    }
}
