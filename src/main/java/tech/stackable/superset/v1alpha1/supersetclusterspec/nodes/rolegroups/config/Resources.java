package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"cpu","memory","storage"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Cpu cpu = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"min\":null,\"max\":null}", tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Cpu.class);

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Cpu getCpu() {
        return cpu;
    }

    public void setCpu(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Cpu cpu) {
        this.cpu = cpu;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Memory memory;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Memory getMemory() {
        return memory;
    }

    public void setMemory(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Memory memory) {
        this.memory = memory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Storage storage;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Storage getStorage() {
        return storage;
    }

    public void setStorage(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.resources.Storage storage) {
        this.storage = storage;
    }
}

