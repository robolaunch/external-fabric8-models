package tech.stackable.zookeeper.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterRef"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ZookeeperZnodeSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The reference to the ZookeeperCluster that this ZNode belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The reference to the ZookeeperCluster that this ZNode belongs to.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperznodespec.ClusterRef clusterRef = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"name\":null,\"namespace\":null}", tech.stackable.zookeeper.v1alpha1.zookeeperznodespec.ClusterRef.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperznodespec.ClusterRef getClusterRef() {
        return clusterRef;
    }

    public void setClusterRef(tech.stackable.zookeeper.v1alpha1.zookeeperznodespec.ClusterRef clusterRef) {
        this.clusterRef = clusterRef;
    }
}

