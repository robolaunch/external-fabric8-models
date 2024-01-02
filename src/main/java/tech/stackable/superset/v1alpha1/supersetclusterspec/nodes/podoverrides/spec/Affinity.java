package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeAffinity","podAffinity","podAntiAffinity"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Affinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("nodeAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.NodeAffinity nodeAffinity;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.NodeAffinity getNodeAffinity() {
        return nodeAffinity;
    }

    public void setNodeAffinity(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.NodeAffinity nodeAffinity) {
        this.nodeAffinity = nodeAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.PodAffinity podAffinity;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.PodAffinity getPodAffinity() {
        return podAffinity;
    }

    public void setPodAffinity(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.PodAffinity podAffinity) {
        this.podAffinity = podAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("podAntiAffinity")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.PodAntiAffinity podAntiAffinity;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.PodAntiAffinity getPodAntiAffinity() {
        return podAntiAffinity;
    }

    public void setPodAntiAffinity(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.PodAntiAffinity podAntiAffinity) {
        this.podAntiAffinity = podAntiAffinity;
    }
}

