package nabila.bookingroomapps;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class BookingForm extends AppCompatActivity {

    EditText Btitle, Bname, Bdivision;
    TextView Bdate, Btime;
    Spinner Broom;
    Button btn_booking;
    DatePickerDialog BdateDialog;
    TimePickerDialog BtimeDialog;

    public String titleB;
    public String nameB;
    public String dateB;
    public String timeB;
    public String roomB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_form);
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction T = manager.beginTransaction();
        DashboardFragment DF = new DashboardFragment();

        Btitle = (EditText) findViewById(R.id.Btitle);
        Bname = (EditText) findViewById(R.id.Bname);
        Bdivision = (EditText) findViewById(R.id.Bdivision);
        Bdate = (TextView) findViewById(R.id.Bdate);
        Btime = (TextView) findViewById(R.id.Btime);
        Broom = (Spinner) findViewById(R.id.Broom);

        btn_booking = (Button) findViewById(R.id.btn_booking);
        btn_booking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                titleB = String.valueOf(Btitle.getText());
                nameB = Bname.getText().toString();


            }
        });
    }
}
