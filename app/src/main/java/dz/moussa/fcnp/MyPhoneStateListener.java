package dz.moussa.fcnp;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;

public class MyPhoneStateListener extends PhoneStateListener {

    public static Boolean phoneRinging = false;
    private final Context context;

    public MyPhoneStateListener(Context context)
    {
        this.context = context;
    }

    @Override
    public void onCallForwardingIndicatorChanged(boolean cfi) {
        if(cfi==true)
            Toast.makeText(context, "True", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(context, "False", Toast.LENGTH_LONG).show();
    }

    public void onCallStateChanged(int state, String incomingNumber) {

        switch (state) {
            case TelephonyManager.CALL_STATE_IDLE:
                Log.d("pDEBUG", "IDLE");
                Toast.makeText(context, "IDLE", Toast.LENGTH_LONG).show();
                phoneRinging = false;
                break;
            case TelephonyManager.CALL_STATE_OFFHOOK:
                Log.d("pDEBUG", "OFFHOOK");
                Toast.makeText(context, "OFFHOOK", Toast.LENGTH_LONG).show();
                phoneRinging = false;
                break;
            case TelephonyManager.CALL_STATE_RINGING:
                Log.d("pDEBUG", "RINGING");
                Toast.makeText(context, "RINGING", Toast.LENGTH_LONG).show();
                phoneRinging = true;
                break;
            default:
                Toast.makeText(context, "Unknown", Toast.LENGTH_LONG).show();
                Log.d("pDEBUG", "Unknown phone state=" + state);
        }
    }
}

