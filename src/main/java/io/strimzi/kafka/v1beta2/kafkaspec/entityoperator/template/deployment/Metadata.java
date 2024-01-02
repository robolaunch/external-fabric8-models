package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"annotations","labels"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Metadata implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Annotations added to the Kubernetes resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Annotations added to the Kubernetes resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment.metadata.Annotations annotations;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment.metadata.Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment.metadata.Annotations annotations) {
        this.annotations = annotations;
    }

    /**
     * Labels added to the Kubernetes resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Labels added to the Kubernetes resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment.metadata.Labels labels;

    public io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment.metadata.Labels getLabels() {
        return labels;
    }

    public void setLabels(io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.template.deployment.metadata.Labels labels) {
        this.labels = labels;
    }
}

