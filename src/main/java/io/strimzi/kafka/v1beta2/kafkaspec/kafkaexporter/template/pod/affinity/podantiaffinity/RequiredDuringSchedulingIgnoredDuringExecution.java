package io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"labelSelector","namespaceSelector","namespaces","topologyKey"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RequiredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("labelSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.LabelSelector labelSelector;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaceSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector namespaceSelector;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(io.strimzi.kafka.v1beta2.kafkaspec.kafkaexporter.template.pod.affinity.podantiaffinity.requiredduringschedulingignoredduringexecution.NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaces")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> namespaces;

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("topologyKey")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topologyKey;

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
    }
}

