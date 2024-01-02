package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.useroperator.logging;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapKeyRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ValueFrom implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Reference to the key in the ConfigMap containing the configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapKeyRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Reference to the key in the ConfigMap containing the configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.useroperator.logging.valuefrom.ConfigMapKeyRef configMapKeyRef;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.useroperator.logging.valuefrom.ConfigMapKeyRef getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.useroperator.logging.valuefrom.ConfigMapKeyRef configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }
}

