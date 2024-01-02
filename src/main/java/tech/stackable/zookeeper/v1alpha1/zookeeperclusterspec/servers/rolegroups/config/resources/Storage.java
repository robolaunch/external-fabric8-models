package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"data"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("data")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.resources.storage.Data data = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.resources.storage.Data.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.resources.storage.Data getData() {
        return data;
    }

    public void setData(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.resources.storage.Data data) {
        this.data = data;
    }
}

