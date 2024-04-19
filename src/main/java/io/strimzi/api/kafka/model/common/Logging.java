/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Describes the logging configuration
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(name = InlineLogging.TYPE_INLINE, value = InlineLogging.class),
    @JsonSubTypes.Type(name = ExternalLogging.TYPE_EXTERNAL, value = ExternalLogging.class),
})
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class Logging {
    public abstract String getType();
}

