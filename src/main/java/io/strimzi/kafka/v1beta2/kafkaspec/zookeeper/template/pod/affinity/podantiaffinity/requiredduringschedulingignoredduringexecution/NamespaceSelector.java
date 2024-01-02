package io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"matchExpressions","matchLabels"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NamespaceSelector implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions> matchExpressions;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchLabels")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchLabels matchLabels;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchLabels getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.namespaceselector.MatchLabels matchLabels) {
        this.matchLabels = matchLabels;
    }
}
