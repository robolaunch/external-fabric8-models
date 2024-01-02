package tech.stackable.zookeeper.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"conditions","discoveryHash"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ZookeeperClusterStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.zookeeper.v1alpha1.zookeeperclusterstatus.Conditions> conditions = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<tech.stackable.zookeeper.v1alpha1.zookeeperclusterstatus.Conditions> getConditions() {
        return conditions;
    }

    public void setConditions(java.util.List<tech.stackable.zookeeper.v1alpha1.zookeeperclusterstatus.Conditions> conditions) {
        this.conditions = conditions;
    }

    /**
     * An opaque value that changes every time a discovery detail does
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryHash")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("An opaque value that changes every time a discovery detail does")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String discoveryHash;

    public String getDiscoveryHash() {
        return discoveryHash;
    }

    public void setDiscoveryHash(String discoveryHash) {
        this.discoveryHash = discoveryHash;
    }
}

