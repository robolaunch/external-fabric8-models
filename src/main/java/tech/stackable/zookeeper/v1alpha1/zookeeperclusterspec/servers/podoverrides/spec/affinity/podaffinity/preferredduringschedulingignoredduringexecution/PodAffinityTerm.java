package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"labelSelector","namespaceSelector","namespaces","topologyKey"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class PodAffinityTerm implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("labelSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.LabelSelector labelSelector;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.LabelSelector getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.LabelSelector labelSelector) {
        this.labelSelector = labelSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaceSelector")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.NamespaceSelector namespaceSelector;

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.NamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.podoverrides.spec.affinity.podaffinity.preferredduringschedulingignoredduringexecution.podaffinityterm.NamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespaces")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> namespaces;

    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(java.util.List<String> namespaces) {
        this.namespaces = namespaces;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("topologyKey")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String topologyKey;

    public String getTopologyKey() {
        return topologyKey;
    }

    public void setTopologyKey(String topologyKey) {
        this.topologyKey = topologyKey;
    }
}

