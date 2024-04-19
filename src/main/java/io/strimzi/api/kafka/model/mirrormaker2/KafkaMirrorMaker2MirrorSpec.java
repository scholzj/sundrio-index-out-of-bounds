/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.mirrormaker2;

import io.sundr.builder.annotations.Buildable;

import java.io.Serializable;

import static java.util.Collections.emptyMap;

@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API
)
public class KafkaMirrorMaker2MirrorSpec implements Serializable {
    private String sourceCluster;
    private String targetCluster;
    private KafkaMirrorMaker2ConnectorSpec sourceConnector;
    private KafkaMirrorMaker2ConnectorSpec checkpointConnector;
    private KafkaMirrorMaker2ConnectorSpec heartbeatConnector;
    private String topicsPattern;
    private String topicsBlacklistPattern;
    private String topicsExcludePattern;
    private String groupsPattern;
    private String groupsBlacklistPattern;
    private String groupsExcludePattern;

    public String getTopicsPattern() {
        return topicsPattern;
    }

    public void setTopicsPattern(String topicsPattern) {
        this.topicsPattern = topicsPattern;
    }

    public String getTopicsBlacklistPattern() {
        return topicsBlacklistPattern;
    }

    public void setTopicsBlacklistPattern(String topicsBlacklistPattern) {
        this.topicsBlacklistPattern = topicsBlacklistPattern;
    }

    public String getTopicsExcludePattern() {
        return topicsExcludePattern;
    }

    public void setTopicsExcludePattern(String topicsExcludePattern) {
        this.topicsExcludePattern = topicsExcludePattern;
    }

    public String getGroupsPattern() {
        return groupsPattern;
    }

    public void setGroupsPattern(String groupsPattern) {
        this.groupsPattern = groupsPattern;
    }

    public String getGroupsBlacklistPattern() {
        return groupsBlacklistPattern;
    }

    public void setGroupsBlacklistPattern(String groupsBlacklistPattern) {
        this.groupsBlacklistPattern = groupsBlacklistPattern;
    }

    public String getGroupsExcludePattern() {
        return groupsExcludePattern;
    }

    public void setGroupsExcludePattern(String groupsExcludePattern) {
        this.groupsExcludePattern = groupsExcludePattern;
    }

    public String getSourceCluster() {
        return sourceCluster;
    }

    public void setSourceCluster(String sourceCluster) {
        this.sourceCluster = sourceCluster;
    }

    public String getTargetCluster() {
        return targetCluster;
    }

    public void setTargetCluster(String targetCluster) {
        this.targetCluster = targetCluster;
    }

    public KafkaMirrorMaker2ConnectorSpec getSourceConnector() {
        return sourceConnector;
    }

    public void setSourceConnector(KafkaMirrorMaker2ConnectorSpec sourceConnector) {
        this.sourceConnector = sourceConnector;
    }

    public KafkaMirrorMaker2ConnectorSpec getCheckpointConnector() {
        return checkpointConnector;
    }

    public void setCheckpointConnector(KafkaMirrorMaker2ConnectorSpec checkpointConnector) {
        this.checkpointConnector = checkpointConnector;
    }

    public KafkaMirrorMaker2ConnectorSpec getHeartbeatConnector() {
        return heartbeatConnector;
    }

    public void setHeartbeatConnector(KafkaMirrorMaker2ConnectorSpec heartbeatConnector) {
        this.heartbeatConnector = heartbeatConnector;
    }
}

