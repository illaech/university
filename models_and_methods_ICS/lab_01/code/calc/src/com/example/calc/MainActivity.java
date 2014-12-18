package com.example.calc;

import java.util.Random;

import android.app.Activity; 
import android.content.res.TypedArray;
import android.graphics.Color; 
import android.os.Bundle; 
import android.os.Handler;
import android.view.View; 
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout; 
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private ImageButton img1;
	private ImageButton img2;
	private ImageButton img3;
	private ImageButton img4;
	private ImageButton img5;
	private ImageButton img6;
	private Toast toast;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        img1 = (ImageButton) findViewById(R.id.img1); 
        img2 = (ImageButton) findViewById(R.id.img2); 
        img3 = (ImageButton) findViewById(R.id.img3);
        img4 = (ImageButton) findViewById(R.id.img4); 
        img5 = (ImageButton) findViewById(R.id.img5); 
        img6 = (ImageButton) findViewById(R.id.img6); 
        
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);
        img4.setOnClickListener(this);
        img5.setOnClickListener(this);
        img6.setOnClickListener(this);
    }
    
    public void onClick(View view) { 
    	int time = 700;
    	int ball = (new Random()).nextInt(6) + 1;
    	TypedArray cats = getResources().obtainTypedArray(R.array.cats);
    	int cat = (new Random()).nextInt(cats.length());
    	ImageButton winner = null;
    	switch (ball) {
	    	case 1: {
	    		winner = img1;
	    		break;
	    	}
	    	case 2: {
	    		winner = img2;
	    		break;
	    	}
	    	case 3: {
	    		winner = img3;
	    		break;
	    	}
	    	case 4: {
	    		winner = img4;
	    		break;
	    	}
	    	case 5: {
	    		winner = img5;
	    		break;
	    	}
	    	case 6: {
	    		winner = img6;
	    		break;
	    	}
    	}
        if (img1.equals(view)) { 
          if (img1 == winner) {
            img1.setImageResource(R.drawable.ball);
            showToast("Lucky!");
            time = 1200;
          } else {
            img1.setImageResource(cats.getResourceId(cat, R.drawable.cat_0));
            showToast("Take cat!");
            winner.setImageResource(R.drawable.ball);
          }
        } else if (img2.equals(view)) { 
            if (img2 == winner) {
                img2.setImageResource(R.drawable.ball);
                showToast("Lucky!");
                time = 1200;
              } else {
                img2.setImageResource(cats.getResourceId(cat, R.drawable.cat_0));
                showToast("Take cat!");
                winner.setImageResource(R.drawable.ball);
              } 
        } else if (img3.equals(view)) { 
            if (img3 == winner) {
                img3.setImageResource(R.drawable.ball);
                showToast("Lucky!");
                time = 1200;
              } else {
                img3.setImageResource(cats.getResourceId(cat, R.drawable.cat_0));
                showToast("Take cat!");
                winner.setImageResource(R.drawable.ball);
              }
        } else if (img4.equals(view)) { 
            if (img4 == winner) {
                img4.setImageResource(R.drawable.ball);
                showToast("Lucky!");
                time = 1200;
              } else {
                img4.setImageResource(cats.getResourceId(cat, R.drawable.cat_0));
                showToast("Take cat!");
                winner.setImageResource(R.drawable.ball);
              }
        } else if (img5.equals(view)) { 
            if (img5 == winner) {
                img5.setImageResource(R.drawable.ball);
                showToast("Lucky!");
                time = 1200;
              } else {
                img5.setImageResource(cats.getResourceId(cat, R.drawable.cat_0));
                showToast("Take cat!");
                winner.setImageResource(R.drawable.ball);
              }
        } else if (img6.equals(view)) { 
            if (img6 == winner) {
                img6.setImageResource(R.drawable.ball);
                showToast("Lucky!");
                time = 1200;
              } else {
                img6.setImageResource(cats.getResourceId(cat, R.drawable.cat_0));
                showToast("Take cat!");
                winner.setImageResource(R.drawable.ball);
              }
        }
        
        (new Handler()).postDelayed(new Runnable() {
        	public void run() {
        		setBoxes();
        		toast.cancel();
        	}
        }, time);
      } 
     
      private void setBoxes() {
    	  img1.setImageResource(R.drawable.box);
    	  img2.setImageResource(R.drawable.box);
    	  img3.setImageResource(R.drawable.box);
    	  img4.setImageResource(R.drawable.box);
    	  img5.setImageResource(R.drawable.box);
    	  img6.setImageResource(R.drawable.box);
      }
    
      private void showToast(String text) {
    	toast = Toast.makeText(getBaseContext(), text, Toast.LENGTH_SHORT);
    	toast.show();
      }
    
}
