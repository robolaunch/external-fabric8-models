package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"matchExpressions","matchLabels"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NamespaceSelector implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.namespaceselector.MatchExpressions> matchExpressions;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.namespaceselector.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.namespaceselector.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchLabels")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> matchLabels;

    public java.util.Map<java.lang.String, String> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(java.util.Map<java.lang.String, String> matchLabels) {
        this.matchLabels = matchLabels;
    }
}

