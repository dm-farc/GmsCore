/*
 * Copyright 2013-2015 µg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.microg.gms.checkin;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import java.io.IOException;

public class CheckinService extends IntentService {
    private static final String TAG = "GmsCheckinSvc";

    public CheckinService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        try {
            LastCheckinInfo info = CheckinManager.checkin(this);
            if (info != null) {
                Log.d(TAG, "Checked in as " + Long.toHexString(info.androidId));
            }
        } catch (Exception e) {
            Log.w(TAG, e);
        }
        stopSelf();
    }
}