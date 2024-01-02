package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"preferredDuringSchedulingIgnoredDuringExecution","requiredDuringSchedulingIgnoredDuringExecution"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PodAffinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution> getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podaffinity.RequiredDuringSchedulingIgnoredDuringExecution> requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }
}

