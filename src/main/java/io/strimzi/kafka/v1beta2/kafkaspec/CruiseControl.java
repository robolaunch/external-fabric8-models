package io.strimzi.kafka.v1beta2.kafkaspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"brokerCapacity","config","image","jvmOptions","livenessProbe","logging","metricsConfig","readinessProbe","resources","template","tlsSidecar"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class CruiseControl implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The Cruise Control `brokerCapacity` configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokerCapacity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Cruise Control `brokerCapacity` configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.BrokerCapacity brokerCapacity;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.BrokerCapacity getBrokerCapacity() {
        return brokerCapacity;
    }

    public void setBrokerCapacity(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.BrokerCapacity brokerCapacity) {
        this.brokerCapacity = brokerCapacity;
    }

    /**
     * The Cruise Control configuration. For a full list of configuration options refer to https://github.com/linkedin/cruise-control/wiki/Configurations. Note that properties with the following prefixes cannot be set: bootstrap.servers, client.id, zookeeper., network., security., failed.brokers.zk.path,webserver.http., webserver.api.urlprefix, webserver.session.path, webserver.accesslog., two.step., request.reason.required,metric.reporter.sampler.bootstrap.servers, capacity.config.file, self.healing., ssl., kafka.broker.failure.detection.enable, topic.config.provider.class (with the exception of: ssl.cipher.suites, ssl.protocol, ssl.enabled.protocols, webserver.http.cors.enabled, webserver.http.cors.origin, webserver.http.cors.exposeheaders, webserver.security.enable, webserver.ssl.enable).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("config")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The Cruise Control configuration. For a full list of configuration options refer to https://github.com/linkedin/cruise-control/wiki/Configurations. Note that properties with the following prefixes cannot be set: bootstrap.servers, client.id, zookeeper., network., security., failed.brokers.zk.path,webserver.http., webserver.api.urlprefix, webserver.session.path, webserver.accesslog., two.step., request.reason.required,metric.reporter.sampler.bootstrap.servers, capacity.config.file, self.healing., ssl., kafka.broker.failure.detection.enable, topic.config.provider.class (with the exception of: ssl.cipher.suites, ssl.protocol, ssl.enabled.protocols, webserver.http.cors.enabled, webserver.http.cors.origin, webserver.http.cors.exposeheaders, webserver.security.enable, webserver.ssl.enable).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Config config;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Config getConfig() {
        return config;
    }

    public void setConfig(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Config config) {
        this.config = config;
    }

    /**
     * The container image used for Cruise Control pods. If no image name is explicitly specified, the image name corresponds to the name specified in the Cluster Operator configuration. If an image name is not defined in the Cluster Operator configuration, a default value is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("image")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The container image used for Cruise Control pods. If no image name is explicitly specified, the image name corresponds to the name specified in the Cluster Operator configuration. If an image name is not defined in the Cluster Operator configuration, a default value is used.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     * JVM Options for the Cruise Control container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jvmOptions")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("JVM Options for the Cruise Control container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.JvmOptions jvmOptions;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.JvmOptions getJvmOptions() {
        return jvmOptions;
    }

    public void setJvmOptions(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.JvmOptions jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    /**
     * Pod liveness checking for the Cruise Control container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("livenessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod liveness checking for the Cruise Control container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.LivenessProbe livenessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.LivenessProbe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.LivenessProbe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    /**
     * Logging configuration (Log4j 2) for Cruise Control.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration (Log4j 2) for Cruise Control.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Logging logging;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Logging getLogging() {
        return logging;
    }

    public void setLogging(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Logging logging) {
        this.logging = logging;
    }

    /**
     * Metrics configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metricsConfig")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Metrics configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.MetricsConfig metricsConfig;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.MetricsConfig getMetricsConfig() {
        return metricsConfig;
    }

    public void setMetricsConfig(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.MetricsConfig metricsConfig) {
        this.metricsConfig = metricsConfig;
    }

    /**
     * Pod readiness checking for the Cruise Control container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readinessProbe")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Pod readiness checking for the Cruise Control container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.ReadinessProbe readinessProbe;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.ReadinessProbe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.ReadinessProbe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    /**
     * CPU and memory resources to reserve for the Cruise Control container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU and memory resources to reserve for the Cruise Control container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Resources resources;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Resources getResources() {
        return resources;
    }

    public void setResources(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Resources resources) {
        this.resources = resources;
    }

    /**
     * Template to specify how Cruise Control resources, `Deployments` and `Pods`, are generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template to specify how Cruise Control resources, `Deployments` and `Pods`, are generated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Template template;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Template getTemplate() {
        return template;
    }

    public void setTemplate(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.Template template) {
        this.template = template;
    }

    /**
     * TLS sidecar configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tlsSidecar")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("TLS sidecar configuration.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.TlsSidecar tlsSidecar;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.TlsSidecar getTlsSidecar() {
        return tlsSidecar;
    }

    public void setTlsSidecar(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.TlsSidecar tlsSidecar) {
        this.tlsSidecar = tlsSidecar;
    }
}

