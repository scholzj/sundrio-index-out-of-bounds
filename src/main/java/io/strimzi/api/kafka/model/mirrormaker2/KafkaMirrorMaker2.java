/*
 * Copyright Strimzi authors.
 * License: Apache License 2.0 (see the file LICENSE or http://apache.org/licenses/LICENSE-2.0.html).
 */
package io.strimzi.api.kafka.model.mirrormaker2;

import io.fabric8.kubernetes.api.model.Namespaced;
import io.fabric8.kubernetes.client.CustomResource;
import io.sundr.builder.annotations.Buildable;

@Buildable(
        editableEnabled = false
        //builderPackage = Constants.FABRIC8_KUBERNETES_API,
        //refs = {@BuildableReference(CustomResource.class), @BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class)}
)
public class KafkaMirrorMaker2 {
    private static final long serialVersionUID = 1L;

    // Added to avoid duplication during Json serialization
    private String apiVersion;
    private String kind;
    private KafkaMirrorMaker2Spec spec;
    private KafkaMirrorMaker2Status status;

    public KafkaMirrorMaker2Spec getSpec() {
        return this.spec;
    }

    public void setSpec(KafkaMirrorMaker2Spec spec) {
        this.spec = spec;
    }

    public KafkaMirrorMaker2Status getStatus() {
        return this.status;
    }

    public void setStatus(KafkaMirrorMaker2Status status) {
        this.status = status;
    }
}
