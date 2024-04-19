/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.common;

import io.fabric8.kubernetes.api.model.ConfigMapKeySelector;
import io.sundr.builder.annotations.Buildable;

/**
 * Representation for a value read from a given key of a config map in the same namespace as the referrer.
 */
@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class ExternalConfigurationReference {
    private ConfigMapKeySelector configMapKeyRef;

    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }
}

