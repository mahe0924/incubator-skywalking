/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.collector.storage.ui.service;

import org.apache.skywalking.apm.collector.storage.ui.common.Node;

/**
 * @author peng-yongsheng
 */
public class ServiceNode extends Node {
    private int sla;
    private long calls;
    private int numOfServiceAlarm;
    private int applicationId;

    public int getSla() {
        return sla;
    }

    public void setSla(int sla) {
        this.sla = sla;
    }

    public long getCalls() {
        return calls;
    }

    public void setCalls(long calls) {
        this.calls = calls;
    }

    public int getNumOfServiceAlarm() {
        return numOfServiceAlarm;
    }

    public void setNumOfServiceAlarm(int numOfServiceAlarm) {
        this.numOfServiceAlarm = numOfServiceAlarm;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }
}
