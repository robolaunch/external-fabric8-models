package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeSelectorTerms"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RequiredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelectorTerms")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> getNodeSelectorTerms() {
        return nodeSelectorTerms;
    }

    public void setNodeSelectorTerms(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.pod.affinity.nodeaffinity.requiredduringschedulingignoredduringexecution.NodeSelectorTerms> nodeSelectorTerms) {
        this.nodeSelectorTerms = nodeSelectorTerms;
    }
}

