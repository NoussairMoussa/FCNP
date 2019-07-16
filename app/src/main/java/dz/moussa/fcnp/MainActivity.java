package dz.moussa.fcnp;

import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG="handle phone call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        if (getOriginalConnection() instanceof GsmCdmaConnection) {

            GsmCdmaConnection gc = (GsmCdmaConnection) getOriginalConnection();

            if (gc.isForwarded()) {

                properties |= PROPERTY_WAS_FORWARDED;

            }

        }
*/

    }
}

