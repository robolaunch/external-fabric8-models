package io.strimzi.kafka.v1beta2.kafkastatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"addresses","bootstrapServers","certificates","name","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Listeners implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A list of the addresses for this listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("addresses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of the addresses for this listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.listeners.Addresses> addresses;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.listeners.Addresses> getAddresses() {
        return addresses;
    }

    public void setAddresses(java.util.List<io.strimzi.kafka.v1beta2.kafkastatus.listeners.Addresses> addresses) {
        this.addresses = addresses;
    }

    /**
     * A comma-separated list of `host:port` pairs for connecting to the Kafka cluster using this listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapServers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A comma-separated list of `host:port` pairs for connecting to the Kafka cluster using this listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String bootstrapServers;

    public String getBootstrapServers() {
        return bootstrapServers;
    }

    public void setBootstrapServers(String bootstrapServers) {
        this.bootstrapServers = bootstrapServers;
    }

    /**
     * A list of TLS certificates which can be used to verify the identity of the server when connecting to the given listener. Set only for `tls` and `external` listeners.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificates")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A list of TLS certificates which can be used to verify the identity of the server when connecting to the given listener. Set only for `tls` and `external` listeners.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> certificates;

    public java.util.List<String> getCertificates() {
        return certificates;
    }

    public void setCertificates(java.util.List<String> certificates) {
        this.certificates = certificates;
    }

    /**
     * The name of the listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of the listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

