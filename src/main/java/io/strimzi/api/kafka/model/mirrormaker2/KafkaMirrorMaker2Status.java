/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.mirrormaker2;

import io.sundr.builder.annotations.Buildable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Represents a status of the Kafka MirrorMaker 2 resource
 */
@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class KafkaMirrorMaker2Status {
    private List<Map<String, Object>> connectors = new ArrayList<>(3);

    public List<Map<String, Object>> getConnectors() {
        return connectors;
    }

    public void setConnectors(List<Map<String, Object>> connectors) {
        this.connectors = connectors;
    }
}