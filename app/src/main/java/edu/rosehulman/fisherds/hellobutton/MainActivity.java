package edu.rosehulman.fisherds.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private TextView mMessageTextView;
  private static final String TAG = "HelloButton";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mMessageTextView = findViewById(R.id.message_text_view);
//    mMessageTextView.setText("Quick test");
//    Log.d(TAG, "This is a console log for developers.");

    // Cause a crash on purpose
//    mMessageTextView = findViewById(0);
//    mMessageTextView.setText("This will crash!");
  }

  public void pressedDecrement(View view) {
    Log.d(TAG, "You pressed the decrement button");
  }

  public void pressedReset(View view) {
    Log.d(TAG, "You pressed the reset button");
  }

  public void pressedIncrement(View view) {
    Log.d(TAG, "You pressed the increment button");
  }

}
