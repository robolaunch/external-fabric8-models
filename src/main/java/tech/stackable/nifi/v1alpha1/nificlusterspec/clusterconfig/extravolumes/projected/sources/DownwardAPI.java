package tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"items"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DownwardAPI implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Items is a list of DownwardAPIVolume file
     */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Items is a list of DownwardAPIVolume file")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.downwardapi.Items> items;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.downwardapi.Items> getItems() {
        return items;
    }

    public void setItems(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.downwardapi.Items> items) {
        this.items = items;
    }
}

