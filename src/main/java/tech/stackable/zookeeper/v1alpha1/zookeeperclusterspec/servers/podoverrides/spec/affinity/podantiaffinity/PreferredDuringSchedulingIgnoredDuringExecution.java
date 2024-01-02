package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podantiaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"podAffinityTerm","weight"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PreferredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("podAffinityTerm")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm podAffinityTerm;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm getPodAffinityTerm() {
        return podAffinityTerm;
    }

    public void setPodAffinityTerm(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podantiaffinity.preferredduringschedulingignoredduringexecution.PodAffinityTerm podAffinityTerm) {
        this.podAffinityTerm = podAffinityTerm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}

