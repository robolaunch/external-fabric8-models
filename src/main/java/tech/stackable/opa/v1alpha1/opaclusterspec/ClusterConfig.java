package tech.stackable.opa.v1alpha1.opaclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"listenerClass","vectorAggregatorConfigMapName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ClusterConfig implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * This field controls which type of Service the Operator creates for this OpaCluster:
     *
     *  cluster-internal: Use a ClusterIP service
     *
     *  external-unstable: Use a NodePort service
     *
     *  external-stable: Use a LoadBalancer service
     *
     * This is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which ListenerClass <https://docs.stackable.tech/home/stable/listener-operator/listenerclass.html> will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerClass")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field controls which type of Service the Operator creates for this OpaCluster:\n\n* cluster-internal: Use a ClusterIP service\n\n* external-unstable: Use a NodePort service\n\n* external-stable: Use a LoadBalancer service\n\nThis is a temporary solution with the goal to keep yaml manifests forward compatible. In the future, this setting will control which ListenerClass <https://docs.stackable.tech/home/stable/listener-operator/listenerclass.html> will be used to expose the service, and ListenerClass names will stay the same, allowing for a non-breaking change.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private ListenerClass listenerClass = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"cluster-internal\"", ListenerClass.class);

    public ListenerClass getListenerClass() {
        return listenerClass;
    }

    public void setListenerClass(ListenerClass listenerClass) {
        this.listenerClass = listenerClass;
    }

    /**
     * Name of the Vector aggregator discovery ConfigMap. It must contain the key `ADDRESS` with the address of the Vector aggregator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vectorAggregatorConfigMapName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the Vector aggregator discovery ConfigMap. It must contain the key `ADDRESS` with the address of the Vector aggregator.")
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

