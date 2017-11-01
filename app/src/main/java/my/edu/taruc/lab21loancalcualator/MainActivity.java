package my.edu.taruc.lab21loancalcualator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAD_STATUS = "status";

    private EditText editTextCarPrice, editTextDownPayment, editTextLoadPeriod, editTextInterestRate, editTextSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextCarPrice = (EditText)findViewById(R.id.editTextCarPrice);
        editTextDownPayment = (EditText)findViewById(R.id.editTextDownPayment);
        editTextLoadPeriod = (EditText)findViewById(R.id.editTextLoadPeriod);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);
        editTextSalary = (EditText)findViewById(R.id.editTextSalary);

    }

    public void calculateLoad(View view)
    {
        //create an explicit intent
        Intent intent = new Intent(this, ResultActivity.class);

        //TODO: calculate monthly payment and determine
        //load application status; approve or reject

        double monthlyPayment, carPrice, downPayment, interestRate, salary, totalInterest, totalLoan;
        String status= "";


        carPrice = Double.parseDouble(editTextCarPrice.getText().toString());
        downPayment = Double.parseDouble(editTextDownPayment.getText().toString());
        interestRate = Double.parseDouble(editTextInterestRate.getText().toString());
        


        //passing data using putExtra method
        //putExtra(TAG, value)

        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAD_STATUS, status);


        startActivity(intent);
    }
}
