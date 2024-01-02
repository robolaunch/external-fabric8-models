package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"name","source"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ResourceClaims implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.resourceclaims.Source source;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.resourceclaims.Source getSource() {
        return source;
    }

    public void setSource(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.podoverrides.spec.resourceclaims.Source source) {
        this.source = source;
    }
}

