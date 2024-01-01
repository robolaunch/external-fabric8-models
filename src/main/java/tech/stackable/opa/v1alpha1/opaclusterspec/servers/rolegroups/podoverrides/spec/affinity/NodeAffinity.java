package tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"preferredDuringSchedulingIgnoredDuringExecution","requiredDuringSchedulingIgnoredDuringExecution"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NodeAffinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;

    public java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(java.util.List<tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(tech.stackable.opa.v1alpha1.opaclusterspec.servers.rolegroups.podoverrides.spec.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }
}
