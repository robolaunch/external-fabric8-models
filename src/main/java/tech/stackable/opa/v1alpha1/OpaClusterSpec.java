package tech.stackable.opa.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clusterConfig","clusterOperation","image","servers"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class OpaClusterSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Global OPA cluster configuration that applies to all roles and role groups.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Global OPA cluster configuration that applies to all roles and role groups.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.ClusterConfig clusterConfig = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"listenerClass\":\"cluster-internal\"}", tech.stackable.opa.v1alpha1.opaclusterspec.ClusterConfig.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.ClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    public void setClusterConfig(tech.stackable.opa.v1alpha1.opaclusterspec.ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * Cluster operations like pause reconciliation or cluster stop.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterOperation")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Cluster operations like pause reconciliation or cluster stop.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.ClusterOperation clusterOperation = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"stopped\":false,\"reconciliationPaused\":false}", tech.stackable.opa.v1alpha1.opaclusterspec.ClusterOperation.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.ClusterOperation getClusterOperation() {
        return clusterOperation;
    }

    public void setClusterOperation(tech.stackable.opa.v1alpha1.opaclusterspec.ClusterOperation clusterOperation) {
        this.clusterOperation = clusterOperation;
    }

    /**
     * The OPA image to use
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The OPA image to use")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.Image image;

    public tech.stackable.opa.v1alpha1.opaclusterspec.Image getImage() {
        return image;
    }

    public void setImage(tech.stackable.opa.v1alpha1.opaclusterspec.Image image) {
        this.image = image;
    }

    /**
     * OPA server configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("OPA server configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.Servers servers;

    public tech.stackable.opa.v1alpha1.opaclusterspec.Servers getServers() {
        return servers;
    }

    public void setServers(tech.stackable.opa.v1alpha1.opaclusterspec.Servers servers) {
        this.servers = servers;
    }
}

