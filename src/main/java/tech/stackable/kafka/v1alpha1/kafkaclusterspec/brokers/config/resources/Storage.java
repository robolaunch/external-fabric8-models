package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"logDirs"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("logDirs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.storage.LogDirs logDirs = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.storage.LogDirs.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.storage.LogDirs getLogDirs() {
        return logDirs;
    }

    public void setLogDirs(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.storage.LogDirs logDirs) {
        this.logDirs = logDirs;
    }
}

