package animal.com.shenhangye.constomanimaldemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

import animal.com.shenhangye.constomanimaldemo.R;

public class CodeAnimalActivity extends AppCompatActivity {

    private Button btnScale;
    private Button btnAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code_animal);
        btnScale=findViewById(R.id.code_scale);
        findViewById(R.id.code_scale).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ScaleAnimation scaleAnimation=new ScaleAnimation(0.0f,1.4f,0.0f,1.4f,
                        Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);//RELATIVE相对于自己
                scaleAnimation.setDuration(7000);
                btnScale.startAnimation(scaleAnimation);
              //  btnScale。se
            }
        });

        btnAlpha=findViewById(R.id.alpha);
        findViewById(R.id.alpha).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlphaAnimation alphaAnimation=new AlphaAnimation(1.0f,0.1f);
                alphaAnimation.setDuration(3000);
                alphaAnimation.setFillBefore(true);
                btnScale.startAnimation(alphaAnimation);
            }
        });
    }
}
