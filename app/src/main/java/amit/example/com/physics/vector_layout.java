package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class vector_layout extends AppCompatActivity {

    PDFView vectorVi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vector_layout);


        vectorVi=(PDFView)findViewById(R.id.vectorView);
        vectorVi.fromAsset("vector1.pdf").load();
    }
}
