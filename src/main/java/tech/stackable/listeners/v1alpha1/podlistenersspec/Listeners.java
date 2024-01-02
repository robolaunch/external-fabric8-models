package tech.stackable.listeners.v1alpha1.podlistenersspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ingressAddresses","scope"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Listeners implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Addresses allowing access to this Pod.
     *
     * Compared to `ingress_addresses` on the Listener status, this list is restricted to addresses that can access this Pod.
     *
     * This field is intended to be equivalent to the files mounted into the Listener volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ingressAddresses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Addresses allowing access to this Pod.\n\nCompared to `ingress_addresses` on the Listener status, this list is restricted to addresses that can access this Pod.\n\nThis field is intended to be equivalent to the files mounted into the Listener volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.util.List<tech.stackable.listeners.v1alpha1.podlistenersspec.listeners.IngressAddresses> ingressAddresses;

    public java.util.List<tech.stackable.listeners.v1alpha1.podlistenersspec.listeners.IngressAddresses> getIngressAddresses() {
        return ingressAddresses;
    }

    public void setIngressAddresses(java.util.List<tech.stackable.listeners.v1alpha1.podlistenersspec.listeners.IngressAddresses> ingressAddresses) {
        this.ingressAddresses = ingressAddresses;
    }

    public enum Scope {

        @com.fasterxml.jackson.annotation.JsonProperty("Node")
        NODE("Node"), @com.fasterxml.jackson.annotation.JsonProperty("Cluster")
        CLUSTER("Cluster");

        java.lang.String value;

        Scope(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * `Node` if this address only allows access to Pods hosted on a specific Kubernetes Node, otherwise `Cluster`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("`Node` if this address only allows access to Pods hosted on a specific Kubernetes Node, otherwise `Cluster`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Scope scope;

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}

