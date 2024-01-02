package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"metadata","spec"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PodOverrides implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.Metadata metadata;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.Metadata metadata) {
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("spec")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.Spec spec;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.Spec getSpec() {
        return spec;
    }

    public void setSpec(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.Spec spec) {
        this.spec = spec;
    }
}

