/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.mirrormaker2;

import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * This test ensures we get a correct tree of POJOs when reading a JSON/YAML `KafkaMirrorMaker2` resource.
 */
public class KafkaMirrorMaker2Test {
    @Test
    public void testFailingBuilder()   {
        KafkaMirrorMaker2 mm2 = new KafkaMirrorMaker2Builder()
            .withNewSpec()
                .withConnectCluster("target")
                .withClusters(new KafkaMirrorMaker2ClusterSpecBuilder()
                        .withAlias("source")
                        .withBootstrapServers("source:9092")
                        .build(),
                        new KafkaMirrorMaker2ClusterSpecBuilder()
                                .withAlias("target")
                                .withBootstrapServers("target:9092")
                                .build())
                .withMirrors(new KafkaMirrorMaker2MirrorSpecBuilder()
                        .withSourceCluster("source")
                        .withTargetCluster("target")
                        .withNewSourceConnector()
                            .withTasksMax(5)
                            .withConfig(Map.of("sync.topic.acls.enabled", "false"))
                        .endSourceConnector()
                        .withNewCheckpointConnector()
                            .withTasksMax(3)
                            .withConfig(Map.of("sync.group.offsets.enabled", "true"))
                        .endCheckpointConnector()
                        .withTopicsPattern("my-topic-.*")
                        .withTopicsExcludePattern("exclude-topic-.*")
                        .withGroupsPattern("my-group-.*")
                        .withGroupsExcludePattern("exclude-group-.*")
                        .build())
            .endSpec()
            .build();

        KafkaMirrorMaker2 mm2b = new KafkaMirrorMaker2Builder(mm2)
                .editSpec()
                    .withNewInlineLogging()
                        .addToLoggers("ddd", "ddd")
                    .endInlineLogging()
                    .editFirstMirror()
                        .withSourceCluster("xxx")
                        .withTargetCluster("kafkaTargetClusterName")
                    .endMirror()
                .endSpec()
                .build();
    }

        @Test
    public void testSucceedingBuilder()   {
        KafkaMirrorMaker2 mm2 = new KafkaMirrorMaker2Builder()
            .withNewSpec()
                .withConnectCluster("target")
                .withClusters(new KafkaMirrorMaker2ClusterSpecBuilder()
                        .withAlias("source")
                        .withBootstrapServers("source:9092")
                        .build(),
                        new KafkaMirrorMaker2ClusterSpecBuilder()
                                .withAlias("target")
                                .withBootstrapServers("target:9092")
                                .build())
                .withMirrors(new KafkaMirrorMaker2MirrorSpecBuilder()
                        .withSourceCluster("source")
                        .withTargetCluster("target")
                        .withNewSourceConnector()
                            .withTasksMax(5)
                            .withConfig(Map.of("sync.topic.acls.enabled", "false"))
                        .endSourceConnector()
                        .withNewCheckpointConnector()
                            .withTasksMax(3)
                            .withConfig(Map.of("sync.group.offsets.enabled", "true"))
                        .endCheckpointConnector()
                        .withTopicsPattern("my-topic-.*")
                        .withTopicsExcludePattern("exclude-topic-.*")
                        .withGroupsPattern("my-group-.*")
                        .withGroupsExcludePattern("exclude-group-.*")
                        .build())
            .endSpec()
            .build();

        KafkaMirrorMaker2 mm2b = new KafkaMirrorMaker2Builder(mm2)
                .editSpec()
                    //.withNewInlineLogging()
                    //    .addToLoggers("ddd", "ddd")
                    //.endInlineLogging()
                    .editFirstMirror()
                        .withSourceCluster("xxx")
                        .withTargetCluster("kafkaTargetClusterName")
                    .endMirror()
                .endSpec()
                .build();
    }
}
