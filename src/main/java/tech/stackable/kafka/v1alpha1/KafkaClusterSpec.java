package tech.stackable.kafka.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"brokers","clusterConfig","clusterOperation","image"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaClusterSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * This struct represents a role - e.g. HDFS datanodes or Trino workers. It has a [`HashMap`] containing all the roleGroups that are part of this role. Additionally, there is a `config`, which is configurable at the role *and* roleGroup level. Everything at roleGroup level is merged on top of what is configured on role level using the [`Merge`] trait. There is also a second form of config, which can only be configured at role level, the `roleConfig`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokers")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This struct represents a role - e.g. HDFS datanodes or Trino workers. It has a [`HashMap`] containing all the roleGroups that are part of this role. Additionally, there is a `config`, which is configurable at the role *and* roleGroup level. Everything at roleGroup level is merged on top of what is configured on role level using the [`Merge`] trait. There is also a second form of config, which can only be configured at role level, the `roleConfig`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.Brokers brokers;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.Brokers getBrokers() {
        return brokers;
    }

    public void setBrokers(tech.stackable.kafka.v1alpha1.kafkaclusterspec.Brokers brokers) {
        this.brokers = brokers;
    }

    /**
     * Kafka settings that affect all roles and role groups. The settings in the `clusterConfig` are cluster wide settings that do not need to be configurable at role or role group level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterConfig")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka settings that affect all roles and role groups. The settings in the `clusterConfig` are cluster wide settings that do not need to be configurable at role or role group level.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterConfig clusterConfig;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    public void setClusterConfig(tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * [Cluster operations](https://docs.stackable.tech/home/nightly/concepts/operations/cluster_operations) properties, allow stopping the product instance as well as pausing reconciliation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterOperation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[Cluster operations](https://docs.stackable.tech/home/nightly/concepts/operations/cluster_operations) properties, allow stopping the product instance as well as pausing reconciliation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterOperation clusterOperation = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"stopped\":false,\"reconciliationPaused\":false}", tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterOperation.class);

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterOperation getClusterOperation() {
        return clusterOperation;
    }

    public void setClusterOperation(tech.stackable.kafka.v1alpha1.kafkaclusterspec.ClusterOperation clusterOperation) {
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
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.Image image;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.Image getImage() {
        return image;
    }

    public void setImage(tech.stackable.kafka.v1alpha1.kafkaclusterspec.Image image) {
        this.image = image;
    }
}

