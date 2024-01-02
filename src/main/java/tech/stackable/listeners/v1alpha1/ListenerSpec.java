package tech.stackable.listeners.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"className","extraPodSelectorLabels","ports","publishNotReadyAddresses"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ListenerSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The name of the [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("className")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the [ListenerClass](https://docs.stackable.tech/home/nightly/listener-operator/listenerclass).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String className;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * Extra labels that the Pods must match in order to be exposed. They must _also_ still have a Volume referring to the Listener.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extraPodSelectorLabels")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Extra labels that the Pods must match in order to be exposed. They must _also_ still have a Volume referring to the Listener.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> extraPodSelectorLabels = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{}", java.util.Map.class);

    public java.util.Map<java.lang.String, String> getExtraPodSelectorLabels() {
        return extraPodSelectorLabels;
    }

    public void setExtraPodSelectorLabels(java.util.Map<java.lang.String, String> extraPodSelectorLabels) {
        this.extraPodSelectorLabels = extraPodSelectorLabels;
    }

    /**
     * Ports that should be exposed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Ports that should be exposed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.util.List<tech.stackable.listeners.v1alpha1.listenerspec.Ports> ports;

    public java.util.List<tech.stackable.listeners.v1alpha1.listenerspec.Ports> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<tech.stackable.listeners.v1alpha1.listenerspec.Ports> ports) {
        this.ports = ports;
    }

    /**
     * Whether incoming traffic should also be directed to Pods that are not `Ready`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publishNotReadyAddresses")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Whether incoming traffic should also be directed to Pods that are not `Ready`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Boolean publishNotReadyAddresses = true;

    public Boolean getPublishNotReadyAddresses() {
        return publishNotReadyAddresses;
    }

    public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
        this.publishNotReadyAddresses = publishNotReadyAddresses;
    }
}

