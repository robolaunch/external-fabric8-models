package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"preference","weight"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PreferredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("preference")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference preference;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference getPreference() {
        return preference;
    }

    public void setPreference(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference preference) {
        this.preference = preference;
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
