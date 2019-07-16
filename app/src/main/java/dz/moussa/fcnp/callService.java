package dz.moussa.fcnp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class callService extends Service  {
    public callService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
