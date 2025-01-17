package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"preference","weight"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PreferredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A node selector term, associated with the corresponding weight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preference")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A node selector term, associated with the corresponding weight.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference preference;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference getPreference() {
        return preference;
    }

    public void setPreference(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference preference) {
        this.preference = preference;
    }

    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

