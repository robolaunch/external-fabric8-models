package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.volumes;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"defaultMode","sources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Projected implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("defaultMode")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer defaultMode;

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.volumes.projected.Sources> sources;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.volumes.projected.Sources> getSources() {
        return sources;
    }

    public void setSources(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.volumes.projected.Sources> sources) {
        this.sources = sources;
    }
}

