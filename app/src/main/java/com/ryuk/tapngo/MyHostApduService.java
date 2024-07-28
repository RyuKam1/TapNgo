package com.ryuk.tapngo;

import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;

public class MyHostApduService extends HostApduService {
    private static final String UID = "63C8A418";

    @Override
    public byte[] processCommandApdu(byte[] commandApdu, Bundle extras) {
        // Return the custom UID
        return UID.getBytes();
    }

    @Override
    public void onDeactivated(int reason) {
        // Handle deactivation
    }
}