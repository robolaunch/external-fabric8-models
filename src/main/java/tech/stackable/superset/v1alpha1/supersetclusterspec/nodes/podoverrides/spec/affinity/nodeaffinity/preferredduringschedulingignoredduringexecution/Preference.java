package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"matchExpressions","matchFields"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Preference implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("matchExpressions")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions> matchExpressions;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchExpressions> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("matchFields")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields> matchFields;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields> getMatchFields() {
        return matchFields;
    }

    public void setMatchFields(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.podoverrides.spec.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.preference.MatchFields> matchFields) {
        this.matchFields = matchFields;
    }
}

