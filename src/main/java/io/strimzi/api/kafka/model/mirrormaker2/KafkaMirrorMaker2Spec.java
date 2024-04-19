/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.mirrormaker2;

import io.strimzi.api.kafka.model.common.Logging;
import io.sundr.builder.annotations.Buildable;

import java.util.List;

@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class KafkaMirrorMaker2Spec {
    private Logging logging;
    private List<KafkaMirrorMaker2ClusterSpec> clusters;
    private String connectCluster;
    private List<KafkaMirrorMaker2MirrorSpec> mirrors;

    public Logging getLogging() {
        return logging;
    }

    public void setLogging(Logging logging) {
        this.logging = logging;
    }

    public List<KafkaMirrorMaker2ClusterSpec> getClusters() {
        return clusters;
    }

    public void setClusters(List<KafkaMirrorMaker2ClusterSpec> clusters) {
        this.clusters = clusters;
    }

    public String getConnectCluster() {
        return connectCluster;
    }

    public void setConnectCluster(String connectCluster) {
        this.connectCluster = connectCluster;
    }

    public List<KafkaMirrorMaker2MirrorSpec> getMirrors() {
        return mirrors;
    }

    public void setMirrors(List<KafkaMirrorMaker2MirrorSpec> mirrors) {
        this.mirrors = mirrors;
    }
}
