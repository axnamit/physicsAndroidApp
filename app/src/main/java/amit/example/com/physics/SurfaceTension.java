package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SurfaceTension extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_tension);

        pdfView=(PDFView)findViewById(R.id.ST);
        pdfView.fromAsset("surfacetension11.pdf").load();
    }
}
