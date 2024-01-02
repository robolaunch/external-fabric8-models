package tech.stackable.listeners.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ingressAddresses","nodePorts","serviceName"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ListenerStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * All addresses that the Listener is currently reachable from.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressAddresses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("All addresses that the Listener is currently reachable from.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.util.List<tech.stackable.listeners.v1alpha1.listenerstatus.IngressAddresses> ingressAddresses;

    public java.util.List<tech.stackable.listeners.v1alpha1.listenerstatus.IngressAddresses> getIngressAddresses() {
        return ingressAddresses;
    }

    public void setIngressAddresses(java.util.List<tech.stackable.listeners.v1alpha1.listenerstatus.IngressAddresses> ingressAddresses) {
        this.ingressAddresses = ingressAddresses;
    }

    /**
     * Port mappings for accessing the Listener on each Node that the Pods are currently running on.
     *
     * This is only intended for internal use by listener-operator itself. This will be left unset if using a ListenerClass that does not require Node-local access.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodePorts")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Port mappings for accessing the Listener on each Node that the Pods are currently running on.\n\nThis is only intended for internal use by listener-operator itself. This will be left unset if using a ListenerClass that does not require Node-local access.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.util.Map<java.lang.String, Integer> nodePorts;

    public java.util.Map<java.lang.String, Integer> getNodePorts() {
        return nodePorts;
    }

    public void setNodePorts(java.util.Map<java.lang.String, Integer> nodePorts) {
        this.nodePorts = nodePorts;
    }

    /**
     * The backing Kubernetes Service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The backing Kubernetes Service.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String serviceName;

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}

