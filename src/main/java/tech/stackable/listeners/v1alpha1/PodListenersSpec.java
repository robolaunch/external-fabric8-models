package tech.stackable.listeners.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"listeners"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PodListenersSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * All Listeners currently bound by the Pod.
     *
     * Indexed by Volume name (not PersistentVolume or PersistentVolumeClaim).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("All Listeners currently bound by the Pod.\n\nIndexed by Volume name (not PersistentVolume or PersistentVolumeClaim).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, tech.stackable.listeners.v1alpha1.podlistenersspec.Listeners> listeners;

    public java.util.Map<java.lang.String, tech.stackable.listeners.v1alpha1.podlistenersspec.Listeners> getListeners() {
        return listeners;
    }

    public void setListeners(java.util.Map<java.lang.String, tech.stackable.listeners.v1alpha1.podlistenersspec.Listeners> listeners) {
        this.listeners = listeners;
    }
}

