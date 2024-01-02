package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"config","image","jmxOptions","jvmOptions","livenessProbe","logging","metricsConfig","readinessProbe","replicas","resources","storage","template"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Zookeeper implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The ZooKeeper broker config. Properties with the following prefixes cannot be set: server., dataDir, dataLogDir, clientPort, authProvider, quorum.auth, requireClientAuthScheme, snapshot.trust.empty, standaloneEnabled, reconfigEnabled, 4lw.commands.whitelist, secureClientPort, ssl., serverCnxnFactory, sslQuorum (with the exception of: ssl.protocol, ssl.quorum.protocol, ssl.enabledProtocols, ssl.quorum.enabledProtocols, ssl.ciphersuites, ssl.quorum.ciphersuites, ssl.hostnameVerification, ssl.quorum.hostnameVerification).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The ZooKeeper broker config. Properties with the following prefixes cannot be set: server., dataDir, dataLogDir, clientPort, authProvider, quorum.auth, requireClientAuthScheme, snapshot.trust.empty, standaloneEnabled, reconfigEnabled, 4lw.commands.whitelist, secureClientPort, ssl., serverCnxnFactory, sslQuorum (with the exception of: ssl.protocol, ssl.quorum.protocol, ssl.enabledProtocols, ssl.quorum.enabledProtocols, ssl.ciphersuites, ssl.quorum.ciphersuites, ssl.hostnameVerification, ssl.quorum.hostnameVerification).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Config config;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Config getConfig() {
        return config;
    }

    public void setConfig(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Config config) {
        this.config = config;
    }

    /**
     * The container image used for ZooKeeper pods. If no image name is explicitly specified, it is determined based on the Kafka version set in `spec.kafka.version`. The image names are specifically mapped to corresponding versions in the Cluster Operator configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image used for ZooKeeper pods. If no image name is explicitly specified, it is determined based on the Kafka version set in `spec.kafka.version`. The image names are specifically mapped to corresponding versions in the Cluster Operator configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * JMX Options for Zookeeper nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JMX Options for Zookeeper nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.JmxOptions jmxOptions;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.JmxOptions getJmxOptions() {
        return jmxOptions;
    }

    public void setJmxOptions(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.JmxOptions jmxOptions) {
        this.jmxOptions = jmxOptions;
    }

    /**
     * JVM Options for pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JVM Options for pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.JvmOptions jvmOptions;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.JvmOptions getJvmOptions() {
        return jvmOptions;
    }

    public void setJvmOptions(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.JvmOptions jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    /**
     * Pod liveness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Logging configuration for ZooKeeper.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration for ZooKeeper.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Logging logging;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Logging getLogging() {
        return logging;
    }

    public void setLogging(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Logging logging) {
        this.logging = logging;
    }

    /**
     * Metrics configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.MetricsConfig metricsConfig;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.MetricsConfig getMetricsConfig() {
        return metricsConfig;
    }

    public void setMetricsConfig(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.MetricsConfig metricsConfig) {
        this.metricsConfig = metricsConfig;
    }

    /**
     * Pod readiness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * The number of pods in the cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    @io.fabric8.generator.annotation.Required()
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The number of pods in the cluster.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long replicas;

    public Long getReplicas() {
        return replicas;
    }

    public void setReplicas(Long replicas) {
        this.replicas = replicas;
    }

    /**
     * CPU and memory resources to reserve.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Resources resources) {
        this.resources = resources;
    }

    /**
     * Storage configuration (disk). Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage configuration (disk). Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Storage storage;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Storage getStorage() {
        return storage;
    }

    public void setStorage(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Storage storage) {
        this.storage = storage;
    }

    /**
     * Template for ZooKeeper cluster resources. The template allows users to specify how the Kubernetes resources are generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper cluster resources. The template allows users to specify how the Kubernetes resources are generated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Template template;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.Template template) {
        this.template = template;
    }
}

