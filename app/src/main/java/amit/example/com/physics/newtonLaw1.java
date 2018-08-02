package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class newtonLaw1 extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newton_law1);
        pdfView=(PDFView)findViewById(R.id.newton1);
        pdfView.fromAsset("NewtonsLaw5.pdf").load();
    }
}
