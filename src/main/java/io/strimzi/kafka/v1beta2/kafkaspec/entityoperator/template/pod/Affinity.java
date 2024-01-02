package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeAffinity","podAffinity","podAntiAffinity"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.NodeAffinity nodeAffinity;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.PodAffinity podAffinity;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.PodAntiAffinity podAntiAffinity;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }
}
