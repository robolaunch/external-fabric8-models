package tech.stackable.nifi.v1alpha1.nificlusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","extraVolumes","listenerClass","sensitiveProperties","vectorAggregatorConfigMapName","zookeeperConfigMapName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClusterConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authentication options for NiFi (required). Read more about authentication in the [security documentation](https://docs.stackable.tech/home/nightly/nifi/usage_guide/security).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authentication options for NiFi (required). Read more about authentication in the [security documentation](https://docs.stackable.tech/home/nightly/nifi/usage_guide/security).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.Authentication> authentication;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.Authentication> getAuthentication() {
        return authentication;
    }

    public void setAuthentication(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.Authentication> authentication) {
        this.authentication = authentication;
    }

    /**
     * Extra volumes to mount into every container, this can be useful to for example make client certificates, keytabs or similar things available to processors These volumes will be mounted below `/stackable/userdata/{volumename}`. See also the [external files usage guide](https://docs.stackable.tech/home/nightly/nifi/usage_guide/extra-volumes).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraVolumes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Extra volumes to mount into every container, this can be useful to for example make client certificates, keytabs or similar things available to processors These volumes will be mounted below `/stackable/userdata/{volumename}`. See also the [external files usage guide](https://docs.stackable.tech/home/nightly/nifi/usage_guide/extra-volumes).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.ExtraVolumes> extraVolumes;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.ExtraVolumes> getExtraVolumes() {
        return extraVolumes;
    }

    public void setExtraVolumes(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.ExtraVolumes> extraVolumes) {
        this.extraVolumes = extraVolumes;
    }

    public enum ListenerClass {

        @com.fasterxml.jackson.annotation.JsonProperty("cluster-internal")
        CLUSTERINTERNAL("cluster-internal"), @com.fasterxml.jackson.annotation.JsonProperty("external-unstable")
        EXTERNALUNSTABLE("external-unstable");

        java.lang.String value;

        ListenerClass(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * This field controls which type of Service the Operator creates for this NifiCluster:
     *
     *  cluster-internal: Use a ClusterIP service
     *
     *  external-unstable: Use a NodePort service
     *
     * This is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass.html) will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field controls which type of Service the Operator creates for this NifiCluster:\n\n* cluster-internal: Use a ClusterIP service\n\n* external-unstable: Use a NodePort service\n\nThis is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass.html) will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ListenerClass listenerClass = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"cluster-internal\"", ListenerClass.class);

    public ListenerClass getListenerClass() {
        return listenerClass;
    }

    public void setListenerClass(ListenerClass listenerClass) {
        this.listenerClass = listenerClass;
    }

    /**
     * These settings configure the encryption of sensitive properties in NiFi processors. NiFi supports encrypting sensitive properties in processors as they are written to disk. You can configure the encryption algorithm and the key to use. You can also let the operator generate an encryption key for you.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveProperties")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("These settings configure the encryption of sensitive properties in NiFi processors. NiFi supports encrypting sensitive properties in processors as they are written to disk. You can configure the encryption algorithm and the key to use. You can also let the operator generate an encryption key for you.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.SensitiveProperties sensitiveProperties;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.SensitiveProperties getSensitiveProperties() {
        return sensitiveProperties;
    }

    public void setSensitiveProperties(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.SensitiveProperties sensitiveProperties) {
        this.sensitiveProperties = sensitiveProperties;
    }

    /**
     * Name of the Vector aggregator [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery). It must contain the key `ADDRESS` with the address of the Vector aggregator. Follow the [logging tutorial](https://docs.stackable.tech/home/nightly/tutorials/logging-vector-aggregator) to learn how to configure log aggregation with Vector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorAggregatorConfigMapName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the Vector aggregator [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery). It must contain the key `ADDRESS` with the address of the Vector aggregator. Follow the [logging tutorial](https://docs.stackable.tech/home/nightly/tutorials/logging-vector-aggregator) to learn how to configure log aggregation with Vector.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String vectorAggregatorConfigMapName;

    public String getVectorAggregatorConfigMapName() {
        return vectorAggregatorConfigMapName;
    }

    public void setVectorAggregatorConfigMapName(String vectorAggregatorConfigMapName) {
        this.vectorAggregatorConfigMapName = vectorAggregatorConfigMapName;
    }

    /**
     * NiFi requires a ZooKeeper cluster connection to run. Provide the name of the ZooKeeper [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) here. When using the [Stackable operator for Apache ZooKeeper](https://docs.stackable.tech/home/nightly/zookeeper/) to deploy a ZooKeeper cluster, this will simply be the name of your ZookeeperCluster resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zookeeperConfigMapName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NiFi requires a ZooKeeper cluster connection to run. Provide the name of the ZooKeeper [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) here. When using the [Stackable operator for Apache ZooKeeper](https://docs.stackable.tech/home/nightly/zookeeper/) to deploy a ZooKeeper cluster, this will simply be the name of your ZookeeperCluster resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String zookeeperConfigMapName;

    public String getZookeeperConfigMapName() {
        return zookeeperConfigMapName;
    }

    public void setZookeeperConfigMapName(String zookeeperConfigMapName) {
        this.zookeeperConfigMapName = zookeeperConfigMapName;
    }
}

