package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"affinity","gracefulShutdownTimeout","logging","resources","rowLimit","webserverTimeout"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Config implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * These configuration settings control [Pod placement](https://docs.stackable.tech/home/nightly/concepts/operations/pod_placement).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("These configuration settings control [Pod placement](https://docs.stackable.tech/home/nightly/concepts/operations/pod_placement).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Affinity affinity = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"podAffinity\":null,\"podAntiAffinity\":null,\"nodeAffinity\":null,\"nodeSelector\":null}", tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Affinity.class);

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Affinity affinity) {
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
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Logging logging = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"enableVectorAgent\":null,\"containers\":{}}", tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Logging.class);

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Logging getLogging() {
        return logging;
    }

    public void setLogging(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Logging logging) {
        this.logging = logging;
    }

    /**
     * CPU and memory limits for Superset pods
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory limits for Superset pods")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Resources resources = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"memory\":{\"limit\":null,\"runtimeLimits\":{}},\"cpu\":{\"min\":null,\"max\":null},\"storage\":{}}", tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Resources.class);

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Resources getResources() {
        return resources;
    }

    public void setResources(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.config.Resources resources) {
        this.resources = resources;
    }

    /**
     * Row limit when requesting chart data. Corresponds to ROW_LIMIT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Row limit when requesting chart data. Corresponds to ROW_LIMIT.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Integer rowLimit;

    public Integer getRowLimit() {
        return rowLimit;
    }

    public void setRowLimit(Integer rowLimit) {
        this.rowLimit = rowLimit;
    }

    /**
     * Maximum time period a Superset request can take before timing out. This setting affects the maximum duration a query to an underlying datasource can take. If you get timeout errors before your query returns the result you may need to increase this timeout. Corresponds to SUPERSET_WEBSERVER_TIMEOUT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("webserverTimeout")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Maximum time period a Superset request can take before timing out. This setting affects the maximum duration a query to an underlying datasource can take. If you get timeout errors before your query returns the result you may need to increase this timeout. Corresponds to SUPERSET_WEBSERVER_TIMEOUT.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long webserverTimeout;

    public Long getWebserverTimeout() {
        return webserverTimeout;
    }

    public void setWebserverTimeout(Long webserverTimeout) {
        this.webserverTimeout = webserverTimeout;
    }
}

