package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
private  TextView mStory;
private  Button mButtonUpper;
private  Button mButtonLower;
private int mStoryIndex = 1;

    //    private TextView mStory = findViewById(R.id.storyTextView) ;
//    private Button mButtonUpper = findViewById(R.id.buttonTop);
//    private Button mButtonLower= findViewById(R.id.buttonBottom);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
mStory = findViewById(R.id.storyTextView);
mButtonUpper = findViewById(R.id.buttonTop);
mButtonLower = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonUpper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex ==1) {
                    mStory.setText(R.string.T3_Story);
                    mButtonUpper.setText(R.string.T3_Ans1);
                    mButtonLower.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else if (mStoryIndex==2){
                    mStory.setText(R.string.T3_Story);
                    mButtonUpper.setText(R.string.T3_Ans1);
                    mButtonLower.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else if (mStoryIndex==3){
                    mStory.setText(R.string.T6_End);
                    mButtonUpper.setText("");
                    mButtonLower.setText("");
                    }
                    }});
        mButtonLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (mStoryIndex==1) {
                mStory.setText(R.string.T2_Story);
                mButtonUpper.setText(R.string.T2_Ans1);
                mButtonLower.setText(R.string.T2_Ans2);
                mStoryIndex = 2;
            }else if (mStoryIndex==2){
                mStory.setText(R.string.T4_End);
                mButtonUpper.setText("");
                mButtonLower.setText("");
            }else if (mStoryIndex==3){
                mStory.setText(R.string.T5_End);
                mButtonUpper.setText("");
                mButtonLower.setText("");
            }
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }
}
