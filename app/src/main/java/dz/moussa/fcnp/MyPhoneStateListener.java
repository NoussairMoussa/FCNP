package dz.moussa.fcnp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.util.Log;
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
        if(cfi==true) {
            Toast.makeText(context, "True", Toast.LENGTH_LONG).show();
            sendNotification();
        }
        //else
            //Toast.makeText(context, "False", Toast.LENGTH_LONG).show();
    }

    protected void sendNotification()
    {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification builder = new NotificationCompat.Builder(this.context, MainActivity.CHANNEL_ID)
                .setSmallIcon(android.R.drawable.btn_star)
                .setContentTitle(context.getString(R.string.notif_title))
                .setContentText(context.getString(R.string.notif_content))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .build();

        notificationManager.notify(1, builder);

    }

    /*
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
    */
}

