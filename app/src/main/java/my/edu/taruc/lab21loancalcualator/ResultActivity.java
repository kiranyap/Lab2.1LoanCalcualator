package my.edu.taruc.lab21loancalcualator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //get input data from another activity
        Intent intent = getIntent(); //asking "who called me?"
        double payment;
        String status;

        payment = intent.getDoubleExtra(MainActivity.MONTHLY_PAYMENT, 0);
        status = intent.getStringExtra(MainActivity.LOAD_STATUS);
    }


    public void closeActivity(View view)
    {
        finish();
    }
}
