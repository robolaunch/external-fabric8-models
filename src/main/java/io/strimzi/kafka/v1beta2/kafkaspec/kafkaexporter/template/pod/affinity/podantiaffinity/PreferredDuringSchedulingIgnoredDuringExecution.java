package io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"podAffinityTerm","weight"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PreferredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("podAffinityTerm")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm podAffinityTerm;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long weight;

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }
}

