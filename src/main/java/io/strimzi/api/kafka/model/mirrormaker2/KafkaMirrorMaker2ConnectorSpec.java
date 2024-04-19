/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.mirrormaker2;

import io.sundr.builder.annotations.Buildable;

import java.util.HashMap;
import java.util.Map;

@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class KafkaMirrorMaker2ConnectorSpec {
    private Integer tasksMax;
    private Boolean pause;
    private Map<String, Object> config = new HashMap<>(0);

    public Integer getTasksMax() {
        return tasksMax;
    }

    public void setTasksMax(Integer tasksMax) {
        this.tasksMax = tasksMax;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    public Boolean getPause() {
        return pause;
    }

    public void setPause(Boolean pause) {
        this.pause = pause;
    }

}
