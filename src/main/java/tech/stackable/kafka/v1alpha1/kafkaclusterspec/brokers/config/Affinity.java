package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeAffinity","nodeSelector","podAffinity","podAntiAffinity"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Node affinity is a group of node affinity scheduling rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Node affinity is a group of node affinity scheduling rules.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.NodeAffinity nodeAffinity;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nodeSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.NodeSelector nodeSelector;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.NodeSelector getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.NodeSelector nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    /**
     * Pod affinity is a group of inter pod affinity scheduling rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod affinity is a group of inter pod affinity scheduling rules.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.PodAffinity podAffinity;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    /**
     * Pod anti affinity is a group of inter pod anti affinity scheduling rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod anti affinity is a group of inter pod anti affinity scheduling rules.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.PodAntiAffinity podAntiAffinity;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }
}

