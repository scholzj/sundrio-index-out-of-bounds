/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.common;

import io.sundr.builder.annotations.Buildable;

import java.util.Map;

/**
 * Logging config is given inline with the resource
 */
@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class InlineLogging extends Logging {
public static final String TYPE_INLINE = "inline";

    private Map<String, String> loggers = null;

    public String getType() {
        return TYPE_INLINE;
    }

    public Map<String, String> getLoggers() {
        return loggers;
    }

    public void setLoggers(Map<String, String> loggers) {
        this.loggers = loggers;
    }
}
