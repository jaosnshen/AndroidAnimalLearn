package animal.com.shenhangye.constomanimaldemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class BasicView extends View {


    public BasicView(Context context) {
        super(context);
    }

    public BasicView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BasicView(Context context,  AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public BasicView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        canvas.drawARGB(120,0,255-255,0);
        Paint paint=new Paint();
        paint.setColor(0x32F00);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(50);
        canvas.drawCircle(190,200,150,paint);


        paint.setColor(0x23F42);
        canvas.drawCircle(190,200,100,paint);

        canvas.drawLine(190,200,1300,1100,paint);

          paint.setColor(0xFFFFFFFF);
          Path mPath=new Path();
//        mPath.moveTo(10,10);
//        mPath.lineTo(10,100);
//        mPath.lineTo(300,100);
//        canvas.drawPath(mPath,paint);
//


//
        paint.setStrokeWidth(10);
        mPath.moveTo(10,10);
        RectF mReact=new RectF(100,10,800,300);
        canvas.clipRect(mReact);
//        mPath.arcTo(mReact,0,360);
//        canvas.drawPath(mPath,paint);


    }



}
