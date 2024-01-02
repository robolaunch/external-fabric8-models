package io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ipBlock","namespaceSelector","podSelector"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NetworkPolicyPeers implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("ipBlock")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.IpBlock ipBlock;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.IpBlock getIpBlock() {
        return ipBlock;
    }

    public void setIpBlock(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.IpBlock ipBlock) {
        this.ipBlock = ipBlock;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaceSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.NamespaceSelector namespaceSelector;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.NamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.PodSelector podSelector;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.PodSelector getPodSelector() {
        return podSelector;
    }

    public void setPodSelector(io.strimzi.kafka.v1beta2.kafkaspec.kafka.listeners.networkpolicypeers.PodSelector podSelector) {
        this.podSelector = podSelector;
    }
}

