/*
 * Copyright 2016–2017 Nicolas Gnyra
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

package com.nicoco007.jeuxdelaesd.events;

import com.nicoco007.jeuxdelaesd.model.Location;

import java.util.ArrayList;

public class LocationsUpdatedEventArgs {
    private boolean successful;
    private ArrayList<Location> locations;
    private boolean notifyOnError;

    public LocationsUpdatedEventArgs(boolean successful, ArrayList<Location> locations, boolean notifyOnError) {
        this.successful = successful;
        this.locations = locations;
        this.notifyOnError = notifyOnError;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public ArrayList<Location> getLocations() {
        return locations;
    }

    public boolean shouldNotifyOnError() {
        return notifyOnError;
    }
}
