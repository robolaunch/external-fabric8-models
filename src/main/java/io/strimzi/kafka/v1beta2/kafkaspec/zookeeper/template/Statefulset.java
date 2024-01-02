package io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","podManagementPolicy"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Statefulset implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Metadata applied to the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metadata applied to the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.statefulset.Metadata metadata;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.statefulset.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.statefulset.Metadata metadata) {
        this.metadata = metadata;
    }

    public enum PodManagementPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("OrderedReady")
        ORDEREDREADY("OrderedReady"), @com.fasterxml.jackson.annotation.JsonProperty("Parallel")
        PARALLEL("Parallel");

        java.lang.String value;

        PodManagementPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * PodManagementPolicy which will be used for this StatefulSet. Valid values are `Parallel` and `OrderedReady`. Defaults to `Parallel`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podManagementPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("PodManagementPolicy which will be used for this StatefulSet. Valid values are `Parallel` and `OrderedReady`. Defaults to `Parallel`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private PodManagementPolicy podManagementPolicy;

    public PodManagementPolicy getPodManagementPolicy() {
        return podManagementPolicy;
    }

    public void setPodManagementPolicy(PodManagementPolicy podManagementPolicy) {
        this.podManagementPolicy = podManagementPolicy;
    }
}

