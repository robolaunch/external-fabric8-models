package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"authorization","brokerRackInitImage","config","image","jmxOptions","jvmOptions","listeners","livenessProbe","logging","metadataVersion","metricsConfig","rack","readinessProbe","replicas","resources","storage","template","version"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Kafka implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Authorization configuration for Kafka brokers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorization")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Authorization configuration for Kafka brokers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Authorization authorization;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Authorization authorization) {
        this.authorization = authorization;
    }

    /**
     * The image of the init container used for initializing the `broker.rack`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokerRackInitImage")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The image of the init container used for initializing the `broker.rack`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String brokerRackInitImage;

    public String getBrokerRackInitImage() {
        return brokerRackInitImage;
    }

    public void setBrokerRackInitImage(String brokerRackInitImage) {
        this.brokerRackInitImage = brokerRackInitImage;
    }

    /**
     * Kafka broker config properties with the following prefixes cannot be set: listeners, advertised., broker., listener., host.name, port, inter.broker.listener.name, sasl., ssl., security., password., log.dir, zookeeper.connect, zookeeper.set.acl, zookeeper.ssl, zookeeper.clientCnxnSocket, authorizer., super.user, cruise.control.metrics.topic, cruise.control.metrics.reporter.bootstrap.servers,node.id, process.roles, controller., metadata.log.dir (with the exception of: zookeeper.connection.timeout.ms, sasl.server.max.receive.size,ssl.cipher.suites, ssl.protocol, ssl.enabled.protocols, ssl.secure.random.implementation,cruise.control.metrics.topic.num.partitions, cruise.control.metrics.topic.replication.factor, cruise.control.metrics.topic.retention.ms,cruise.control.metrics.topic.auto.create.retries, cruise.control.metrics.topic.auto.create.timeout.ms,cruise.control.metrics.topic.min.insync.replicas,controller.quorum.election.backoff.max.ms, controller.quorum.election.timeout.ms, controller.quorum.fetch.timeout.ms).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kafka broker config properties with the following prefixes cannot be set: listeners, advertised., broker., listener., host.name, port, inter.broker.listener.name, sasl., ssl., security., password., log.dir, zookeeper.connect, zookeeper.set.acl, zookeeper.ssl, zookeeper.clientCnxnSocket, authorizer., super.user, cruise.control.metrics.topic, cruise.control.metrics.reporter.bootstrap.servers,node.id, process.roles, controller., metadata.log.dir (with the exception of: zookeeper.connection.timeout.ms, sasl.server.max.receive.size,ssl.cipher.suites, ssl.protocol, ssl.enabled.protocols, ssl.secure.random.implementation,cruise.control.metrics.topic.num.partitions, cruise.control.metrics.topic.replication.factor, cruise.control.metrics.topic.retention.ms,cruise.control.metrics.topic.auto.create.retries, cruise.control.metrics.topic.auto.create.timeout.ms,cruise.control.metrics.topic.min.insync.replicas,controller.quorum.election.backoff.max.ms, controller.quorum.election.timeout.ms, controller.quorum.fetch.timeout.ms).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Config config;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Config getConfig() {
        return config;
    }

    public void setConfig(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Config config) {
        this.config = config;
    }

    /**
     * The container image used for Kafka pods. If the property is not set, the default Kafka image version is determined based on the `version` configuration. The image names are specifically mapped to corresponding versions in the Cluster Operator configuration. Changing the Kafka image version does not automatically update the image versions for other components, such as Kafka Exporter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image used for Kafka pods. If the property is not set, the default Kafka image version is determined based on the `version` configuration. The image names are specifically mapped to corresponding versions in the Cluster Operator configuration. Changing the Kafka image version does not automatically update the image versions for other components, such as Kafka Exporter. ")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * JMX Options for Kafka brokers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JMX Options for Kafka brokers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.JmxOptions jmxOptions;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.JmxOptions getJmxOptions() {
        return jmxOptions;
    }

    public void setJmxOptions(io.strimzi.kafka.v1beta2.kafkaspec.kafka.JmxOptions jmxOptions) {
        this.jmxOptions = jmxOptions;
    }

    /**
     * JVM Options for pods.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JVM Options for pods.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.JvmOptions jvmOptions;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.JvmOptions getJvmOptions() {
        return jvmOptions;
    }

    public void setJvmOptions(io.strimzi.kafka.v1beta2.kafkaspec.kafka.JvmOptions jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    /**
     * Configures listeners of Kafka brokers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listeners")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configures listeners of Kafka brokers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.Listeners> listeners;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.Listeners> getListeners() {
        return listeners;
    }

    public void setListeners(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.Listeners> listeners) {
        this.listeners = listeners;
    }

    /**
     * Pod liveness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaspec.kafka.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Logging configuration for Kafka.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration for Kafka.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Logging logging;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Logging getLogging() {
        return logging;
    }

    public void setLogging(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Logging logging) {
        this.logging = logging;
    }

    /**
     * The KRaft metadata version used by the Kafka cluster. This property is ignored when running in ZooKeeper mode. If the property is not set, it defaults to the metadata version that corresponds to the `version` property.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadataVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The KRaft metadata version used by the Kafka cluster. This property is ignored when running in ZooKeeper mode. If the property is not set, it defaults to the metadata version that corresponds to the `version` property.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String metadataVersion;

    public String getMetadataVersion() {
        return metadataVersion;
    }

    public void setMetadataVersion(String metadataVersion) {
        this.metadataVersion = metadataVersion;
    }

    /**
     * Metrics configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.MetricsConfig metricsConfig;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.MetricsConfig getMetricsConfig() {
        return metricsConfig;
    }

    public void setMetricsConfig(io.strimzi.kafka.v1beta2.kafkaspec.kafka.MetricsConfig metricsConfig) {
        this.metricsConfig = metricsConfig;
    }

    /**
     * Configuration of the `broker.rack` broker config.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rack")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configuration of the `broker.rack` broker config.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Rack rack;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Rack getRack() {
        return rack;
    }

    public void setRack(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Rack rack) {
        this.rack = rack;
    }

    /**
     * Pod readiness checking.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness checking.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaspec.kafka.ReadinessProbe readinessProbe) {
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
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Resources resources) {
        this.resources = resources;
    }

    /**
     * Storage configuration (disk). Cannot be updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storage")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage configuration (disk). Cannot be updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Storage storage;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Storage getStorage() {
        return storage;
    }

    public void setStorage(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Storage storage) {
        this.storage = storage;
    }

    /**
     * Template for Kafka cluster resources. The template allows users to specify how the Kubernetes resources are generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka cluster resources. The template allows users to specify how the Kubernetes resources are generated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.Template template;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaspec.kafka.Template template) {
        this.template = template;
    }

    /**
     * The Kafka broker version. Defaults to the latest version. Consult the user documentation to understand the process required to upgrade or downgrade the version.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Kafka broker version. Defaults to the latest version. Consult the user documentation to understand the process required to upgrade or downgrade the version.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}

