package io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"broker","class"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Overrides implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Id of the kafka broker (broker identifier).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("broker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Id of the kafka broker (broker identifier).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long broker;

    public Long getBroker() {
        return broker;
    }

    public void setBroker(Long broker) {
        this.broker = broker;
    }

    /**
     * The storage class to use for dynamic volume allocation for this broker.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The storage class to use for dynamic volume allocation for this broker.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _class;

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }
}

