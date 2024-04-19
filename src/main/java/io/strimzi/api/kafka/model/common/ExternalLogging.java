/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.common;

import io.sundr.builder.annotations.Buildable;

/**
 * Logging config comes from an existing, user-supplied config map
 */
@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class ExternalLogging extends Logging {
    public static final String TYPE_EXTERNAL = "external";

    private ExternalConfigurationReference valueFrom;

    public String getType() {
        return TYPE_EXTERNAL;
    }

    public ExternalConfigurationReference getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(ExternalConfigurationReference valueFrom) {
        this.valueFrom = valueFrom;
    }
}
