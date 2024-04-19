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
public class KafkaMirrorMaker2ClusterSpec {
    private String alias;
    private String bootstrapServers;
    protected Map<String, Object> config = new HashMap<>(0);

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }
}
