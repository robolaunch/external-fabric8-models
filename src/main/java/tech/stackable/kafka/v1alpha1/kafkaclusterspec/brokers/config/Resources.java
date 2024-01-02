package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cpu","memory","storage"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Cpu cpu = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"min\":null,\"max\":null}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Cpu.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Cpu getCpu() {
        return cpu;
    }

    public void setCpu(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Cpu cpu) {
        this.cpu = cpu;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Memory memory;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Memory getMemory() {
        return memory;
    }

    public void setMemory(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Memory memory) {
        this.memory = memory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Storage storage;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Storage getStorage() {
        return storage;
    }

    public void setStorage(tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.config.resources.Storage storage) {
        this.storage = storage;
    }
}
