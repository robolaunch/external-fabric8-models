package tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"affinity","gracefulShutdownTimeout","initLimit","logging","myidOffset","resources","syncLimit","tickTime"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Config implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * These configuration settings control [Pod placement](https://docs.stackable.tech/home/nightly/concepts/operations/pod_placement).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("affinity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("These configuration settings control [Pod placement](https://docs.stackable.tech/home/nightly/concepts/operations/pod_placement).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Affinity affinity = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"podAffinity\":null,\"podAntiAffinity\":null,\"nodeAffinity\":null,\"nodeSelector\":null}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Affinity.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Affinity affinity) {
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

    @com.fasterxml.jackson.annotation.JsonProperty("initLimit")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long initLimit;

    public Long getInitLimit() {
        return initLimit;
    }

    public void setInitLimit(Long initLimit) {
        this.initLimit = initLimit;
    }

    /**
     * Logging configuration, learn more in the [logging concept documentation](https://docs.stackable.tech/home/nightly/concepts/logging).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration, learn more in the [logging concept documentation](https://docs.stackable.tech/home/nightly/concepts/logging).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Logging logging = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"enableVectorAgent\":null,\"containers\":{}}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Logging.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Logging getLogging() {
        return logging;
    }

    public void setLogging(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Logging logging) {
        this.logging = logging;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("myidOffset")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long myidOffset;

    public Long getMyidOffset() {
        return myidOffset;
    }

    public void setMyidOffset(Long myidOffset) {
        this.myidOffset = myidOffset;
    }

    /**
     * Resource usage is configured here, this includes CPU usage, memory usage and disk storage usage, if this role needs any.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resource usage is configured here, this includes CPU usage, memory usage and disk storage usage, if this role needs any.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Resources resources = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"memory\":{\"limit\":null,\"runtimeLimits\":{}},\"cpu\":{\"min\":null,\"max\":null},\"storage\":{\"data\":{\"capacity\":null}}}", tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Resources.class);

    public tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Resources getResources() {
        return resources;
    }

    public void setResources(tech.stackable.zookeeper.v1alpha1.zookeeperclusterspec.servers.rolegroups.config.Resources resources) {
        this.resources = resources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("syncLimit")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long syncLimit;

    public Long getSyncLimit() {
        return syncLimit;
    }

    public void setSyncLimit(Long syncLimit) {
        this.syncLimit = syncLimit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tickTime")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private Long tickTime;

    public Long getTickTime() {
        return tickTime;
    }

    public void setTickTime(Long tickTime) {
        this.tickTime = tickTime;
    }
}

