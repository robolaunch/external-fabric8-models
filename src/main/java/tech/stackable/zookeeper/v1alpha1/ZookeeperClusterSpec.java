package tech.stackable.zookeeper.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterConfig","clusterOperation","image","servers"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ZookeeperClusterSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Settings that affect all roles and role groups. The settings in the `clusterConfig` are cluster wide settings that do not need to be configurable at role or role group level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Settings that affect all roles and role groups. The settings in the `clusterConfig` are cluster wide settings that do not need to be configurable at role or role group level.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterConfig clusterConfig = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"authentication\":[],\"tls\":{\"quorumSecretClass\":\"tls\",\"serverSecretClass\":\"tls\"},\"listenerClass\":\"cluster-internal\"}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterConfig.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    public void setClusterConfig(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * [Cluster operations](https://docs.stackable.tech/home/nightly/concepts/operations/cluster_operations) properties, allow stopping the product instance as well as pausing reconciliation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterOperation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[Cluster operations](https://docs.stackable.tech/home/nightly/concepts/operations/cluster_operations) properties, allow stopping the product instance as well as pausing reconciliation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterOperation clusterOperation = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"stopped\":false,\"reconciliationPaused\":false}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterOperation.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterOperation getClusterOperation() {
        return clusterOperation;
    }

    public void setClusterOperation(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.ClusterOperation clusterOperation) {
        this.clusterOperation = clusterOperation;
    }

    /**
     * Specify which image to use, the easiest way is to only configure the `productVersion`. You can also configure a custom image registry to pull from, as well as completely custom images.
     *
     * Consult the [Product image selection documentation](https://docs.stackable.tech/home/nightly/concepts/product_image_selection) for details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specify which image to use, the easiest way is to only configure the `productVersion`. You can also configure a custom image registry to pull from, as well as completely custom images.\n\nConsult the [Product image selection documentation](https://docs.stackable.tech/home/nightly/concepts/product_image_selection) for details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.Image image;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.Image getImage() {
        return image;
    }

    public void setImage(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.Image image) {
        this.image = image;
    }

    /**
     * This struct represents a role - e.g. HDFS datanodes or Trino workers. It has a [`HashMap`] containing all the roleGroups that are part of this role. Additionally, there is a `config`, which is configurable at the role *and* roleGroup level. Everything at roleGroup level is merged on top of what is configured on role level using the [`Merge`] trait. There is also a second form of config, which can only be configured at role level, the `roleConfig`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This struct represents a role - e.g. HDFS datanodes or Trino workers. It has a [`HashMap`] containing all the roleGroups that are part of this role. Additionally, there is a `config`, which is configurable at the role *and* roleGroup level. Everything at roleGroup level is merged on top of what is configured on role level using the [`Merge`] trait. There is also a second form of config, which can only be configured at role level, the `roleConfig`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.Servers servers;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.Servers getServers() {
        return servers;
    }

    public void setServers(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.Servers servers) {
        this.servers = servers;
    }
}

