package tech.stackable.s3.v1alpha1.s3bucketspec.connection.inline.credentials;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"node","pod","services"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Scope implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The node scope is resolved to the name of the Kubernetes Node object that the Pod is running on. This will typically be the DNS name of the node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("node")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The node scope is resolved to the name of the Kubernetes Node object that the Pod is running on. This will typically be the DNS name of the node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean node = false;

    public Boolean getNode() {
        return node;
    }

    public void setNode(Boolean node) {
        this.node = node;
    }

    /**
     * The pod scope is resolved to the name of the Kubernetes Pod. This allows the secret to differentiate between StatefulSet replicas.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The pod scope is resolved to the name of the Kubernetes Pod. This allows the secret to differentiate between StatefulSet replicas.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean pod = false;

    public Boolean getPod() {
        return pod;
    }

    public void setPod(Boolean pod) {
        this.pod = pod;
    }

    /**
     * The service scope allows Pod objects to specify custom scopes. This should typically correspond to Service objects that the Pod participates in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("services")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The service scope allows Pod objects to specify custom scopes. This should typically correspond to Service objects that the Pod participates in.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> services = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("[]", java.util.List.class);

    public java.util.List<String> getServices() {
        return services;
    }

    public void setServices(java.util.List<String> services) {
        this.services = services;
    }
}

