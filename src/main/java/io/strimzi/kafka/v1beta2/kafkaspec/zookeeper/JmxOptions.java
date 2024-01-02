package io.strimzi.kafka.v1beta2.kafkaspec.zookeeper;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class JmxOptions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication configuration for connecting to the JMX port.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication configuration for connecting to the JMX port.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.jmxoptions.Authentication authentication;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.jmxoptions.Authentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.jmxoptions.Authentication authentication) {
        this.authentication = authentication;
    }
}

