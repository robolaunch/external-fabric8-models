package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ServiceAccount implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Metadata applied to the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metadata applied to the resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.serviceaccount.Metadata metadata;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.serviceaccount.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.serviceaccount.Metadata metadata) {
        this.metadata = metadata;
    }
}

