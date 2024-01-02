package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"containers","enableVectorAgent"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Logging implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Log configuration per container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("containers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Log configuration per container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.Containers> containers;

    public java.util.Map<java.lang.String, tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.Containers> getContainers() {
        return containers;
    }

    public void setContainers(java.util.Map<java.lang.String, tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.logging.Containers> containers) {
        this.containers = containers;
    }

    /**
     * Wether or not to deploy a container with the Vector log agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("enableVectorAgent")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Wether or not to deploy a container with the Vector log agent.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Boolean enableVectorAgent;

    public Boolean getEnableVectorAgent() {
        return enableVectorAgent;
    }

    public void setEnableVectorAgent(Boolean enableVectorAgent) {
        this.enableVectorAgent = enableVectorAgent;
    }
}

