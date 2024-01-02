package tech.stackable.superset.v1alpha1.supersetclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authentication","clusterOperation","credentialsSecret","listenerClass","mapboxSecret","vectorAggregatorConfigMapName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClusterConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The Superset [authentication](https://docs.stackable.tech/home/nightly/superset/usage-guide/security) settings. Currently the underlying Flask App Builder only supports one authentication mechanism at a time. This means the operator will error out if multiple references to an AuthenticationClass are provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authentication")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Superset [authentication](https://docs.stackable.tech/home/nightly/superset/usage-guide/security) settings. Currently the underlying Flask App Builder only supports one authentication mechanism at a time. This means the operator will error out if multiple references to an AuthenticationClass are provided.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.Authentication> authentication = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.Authentication> getAuthentication() {
        return authentication;
    }

    public void setAuthentication(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.Authentication> authentication) {
        this.authentication = authentication;
    }

    /**
     * [Cluster operations](https://docs.stackable.tech/home/nightly/concepts/operations/cluster_operations) properties, allow stopping the product instance as well as pausing reconciliation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterOperation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[Cluster operations](https://docs.stackable.tech/home/nightly/concepts/operations/cluster_operations) properties, allow stopping the product instance as well as pausing reconciliation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.ClusterOperation clusterOperation = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"stopped\":false,\"reconciliationPaused\":false}", tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.ClusterOperation.class);

    public tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.ClusterOperation getClusterOperation() {
        return clusterOperation;
    }

    public void setClusterOperation(tech.stackable.superset.v1alpha1.supersetclusterspec.clusterconfig.ClusterOperation clusterOperation) {
        this.clusterOperation = clusterOperation;
    }

    /**
     * The name of the Secret object containing the admin user credentials and database connection details. Read the [getting started guide first steps](https://docs.stackable.tech/home/nightly/superset/getting_started/first_steps) to find out more.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("credentialsSecret")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the Secret object containing the admin user credentials and database connection details. Read the [getting started guide first steps](https://docs.stackable.tech/home/nightly/superset/getting_started/first_steps) to find out more.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String credentialsSecret;

    public String getCredentialsSecret() {
        return credentialsSecret;
    }

    public void setCredentialsSecret(String credentialsSecret) {
        this.credentialsSecret = credentialsSecret;
    }

    public enum ListenerClass {

        @com.fasterxml.jackson.annotation.JsonProperty("cluster-internal")
        CLUSTERINTERNAL("cluster-internal"), @com.fasterxml.jackson.annotation.JsonProperty("external-unstable")
        EXTERNALUNSTABLE("external-unstable"), @com.fasterxml.jackson.annotation.JsonProperty("external-stable")
        EXTERNALSTABLE("external-stable");

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
     * This field controls which type of Service the Operator creates for this SupersetCluster:
     *
     *  cluster-internal: Use a ClusterIP service
     *
     *  external-unstable: Use a NodePort service
     *
     *  external-stable: Use a LoadBalancer service
     *
     * This is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass.html) will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field controls which type of Service the Operator creates for this SupersetCluster:\n\n* cluster-internal: Use a ClusterIP service\n\n* external-unstable: Use a NodePort service\n\n* external-stable: Use a LoadBalancer service\n\nThis is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass.html) will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ListenerClass listenerClass = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"cluster-internal\"", ListenerClass.class);

    public ListenerClass getListenerClass() {
        return listenerClass;
    }

    public void setListenerClass(ListenerClass listenerClass) {
        this.listenerClass = listenerClass;
    }

    /**
     * The name of a Secret object. The Secret should contain a key `connections.mapboxApiKey`. This is the API key required for map charts to work that use mapbox. The token should be in the JWT format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mapboxSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of a Secret object. The Secret should contain a key `connections.mapboxApiKey`. This is the API key required for map charts to work that use mapbox. The token should be in the JWT format.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String mapboxSecret;

    public String getMapboxSecret() {
        return mapboxSecret;
    }

    public void setMapboxSecret(String mapboxSecret) {
        this.mapboxSecret = mapboxSecret;
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
}

