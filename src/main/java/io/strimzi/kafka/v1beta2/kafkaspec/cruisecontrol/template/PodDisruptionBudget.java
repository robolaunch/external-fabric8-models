package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"maxUnavailable","metadata"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PodDisruptionBudget implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Maximum number of unavailable pods to allow automatic Pod eviction. A Pod eviction is allowed when the `maxUnavailable` number of pods or fewer are unavailable after the eviction. Setting this value to 0 prevents all voluntary evictions, so the pods must be evicted manually. Defaults to 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxUnavailable")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum number of unavailable pods to allow automatic Pod eviction. A Pod eviction is allowed when the `maxUnavailable` number of pods or fewer are unavailable after the eviction. Setting this value to 0 prevents all voluntary evictions, so the pods must be evicted manually. Defaults to 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxUnavailable;

    public Long getMaxUnavailable() {
        return maxUnavailable;
    }

    public void setMaxUnavailable(Long maxUnavailable) {
        this.maxUnavailable = maxUnavailable;
    }

    /**
     * Metadata to apply to the `PodDisruptionBudgetTemplate` resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metadata to apply to the `PodDisruptionBudgetTemplate` resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.poddisruptionbudget.Metadata metadata;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.poddisruptionbudget.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.template.poddisruptionbudget.Metadata metadata) {
        this.metadata = metadata;
    }
}

