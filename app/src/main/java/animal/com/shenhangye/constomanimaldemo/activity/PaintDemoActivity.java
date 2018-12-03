package animal.com.shenhangye.constomanimaldemo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import animal.com.shenhangye.constomanimaldemo.R;

public class PaintDemoActivity extends AppCompatActivity {


    private Button mScale;

    private Button mAphl;

    private Button mRotate;

    private Button mTranslate;

    private Button setTest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint_demo);

        mScale=findViewById(R.id.scaleTest);
        mAphl=findViewById(R.id.alphTest);
        mRotate=findViewById(R.id.rotateTest);
        mTranslate=findViewById(R.id.translateTest);
        setTest=findViewById(R.id.setTest);

        findViewById(R.id.scaleTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(PaintDemoActivity.this,R.anim.scaleanim);
                mScale.startAnimation(animation);
            }
        });

        findViewById(R.id.alphTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(PaintDemoActivity.this,R.anim.alphaanim);
                mAphl.startAnimation(animation);
            }
        });


        findViewById(R.id.rotateTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(PaintDemoActivity.this,R.anim.rotateanim);
                mRotate.startAnimation(animation);
            }
        });


        findViewById(R.id.translateTest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(PaintDemoActivity.this,R.anim.translateanim);
                mTranslate.startAnimation(animation);
            }
        });

        setTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation=AnimationUtils.loadAnimation(PaintDemoActivity.this,R.anim.setanimal);
                setTest.startAnimation(animation);
            }
        });
    }




}
