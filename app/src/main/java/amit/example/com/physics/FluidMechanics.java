package amit.example.com.physics;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FluidMechanics extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluid_mechanics);
        pdfView=(PDFView)findViewById(R.id.fluid);
        pdfView.fromAsset("fluiedmechanics12.pdf").load();
    }
}
