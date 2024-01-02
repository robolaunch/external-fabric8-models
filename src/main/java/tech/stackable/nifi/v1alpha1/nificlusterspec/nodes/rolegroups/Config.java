package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"affinity","gracefulShutdownTimeout","logging","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Config implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * These configuration settings control [Pod placement](https://docs.stackable.tech/home/nightly/concepts/operations/pod_placement).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("These configuration settings control [Pod placement](https://docs.stackable.tech/home/nightly/concepts/operations/pod_placement).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Affinity affinity = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"podAffinity\":null,\"podAntiAffinity\":null,\"nodeAffinity\":null,\"nodeSelector\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Affinity.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Affinity affinity) {
        this.affinity = affinity;
    }

    /**
     * Time period Pods have to gracefully shut down, e.g. `30m`, `1h` or `2d`. Consult the operator documentation for details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gracefulShutdownTimeout")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time period Pods have to gracefully shut down, e.g. `30m`, `1h` or `2d`. Consult the operator documentation for details.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String gracefulShutdownTimeout;

    public String getGracefulShutdownTimeout() {
        return gracefulShutdownTimeout;
    }

    public void setGracefulShutdownTimeout(String gracefulShutdownTimeout) {
        this.gracefulShutdownTimeout = gracefulShutdownTimeout;
    }

    /**
     * Logging configuration, learn more in the [logging concept documentation](https://docs.stackable.tech/home/nightly/concepts/logging).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration, learn more in the [logging concept documentation](https://docs.stackable.tech/home/nightly/concepts/logging).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Logging logging = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"enableVectorAgent\":null,\"containers\":{}}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Logging.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Logging getLogging() {
        return logging;
    }

    public void setLogging(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Logging logging) {
        this.logging = logging;
    }

    /**
     * Resource usage is configured here, this includes CPU usage, memory usage and disk storage usage. The default CPU request and limit are 500m and 2000m respectively. The default memory limit is 4GB.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resource usage is configured here, this includes CPU usage, memory usage and disk storage usage. The default CPU request and limit are 500m and 2000m respectively. The default memory limit is 4GB.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Resources resources = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"memory\":{\"limit\":null,\"runtimeLimits\":{}},\"cpu\":{\"min\":null,\"max\":null},\"storage\":{\"flowfileRepo\":{\"capacity\":null},\"provenanceRepo\":{\"capacity\":null},\"databaseRepo\":{\"capacity\":null},\"contentRepo\":{\"capacity\":null},\"stateRepo\":{\"capacity\":null}}}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Resources.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Resources getResources() {
        return resources;
    }

    public void setResources(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.Resources resources) {
        this.resources = resources;
    }
}

