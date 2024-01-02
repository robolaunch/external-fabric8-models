package tech.stackable.opa.v1alpha1.opaclusterspec.servers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"gracefulShutdownTimeout","logging","resources"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Config implements io.fabric8.kubernetes.api.model.KubernetesResource {

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
     * Logging configuration
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logging")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Logging configuration")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Logging logging = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"enableVectorAgent\":null,\"containers\":{}}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Logging.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Logging getLogging() {
        return logging;
    }

    public void setLogging(tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Logging logging) {
        this.logging = logging;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Resources resources = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"memory\":{\"limit\":null,\"runtimeLimits\":{}},\"cpu\":{\"min\":null,\"max\":null},\"storage\":{}}", tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Resources.class);

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Resources getResources() {
        return resources;
    }

    public void setResources(tech.stackable.opa.v1alpha1.opaclusterspec.servers.config.Resources resources) {
        this.resources = resources;
    }
}

