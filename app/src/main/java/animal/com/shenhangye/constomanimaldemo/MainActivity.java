package animal.com.shenhangye.constomanimaldemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import animal.com.shenhangye.constomanimaldemo.activity.PaintDemoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.paintDemo).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        Intent mIntent;
        if (id==R.id.paintDemo){
            mIntent=new Intent(MainActivity.this,PaintDemoActivity.class);
            startActivity(mIntent);
        }
    }
}
