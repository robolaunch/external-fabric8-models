package io.strimzi.kafka.v1beta2.kafkaspec.entityoperator.topicoperator;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"failureThreshold","initialDelaySeconds","periodSeconds","successThreshold","timeoutSeconds"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class LivenessProbe implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failureThreshold")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long failureThreshold;

    public Long getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Long failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    /**
     * The initial delay before first the health is first checked. Default to 15 seconds. Minimum value is 0.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initialDelaySeconds")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The initial delay before first the health is first checked. Default to 15 seconds. Minimum value is 0.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long initialDelaySeconds;

    public Long getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Long initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("periodSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long periodSeconds;

    public Long getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Long periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    /**
     * Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("successThreshold")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long successThreshold;

    public Long getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Long successThreshold) {
        this.successThreshold = successThreshold;
    }

    /**
     * The timeout for each attempted health check. Default to 5 seconds. Minimum value is 1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutSeconds")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The timeout for each attempted health check. Default to 5 seconds. Minimum value is 1.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long timeoutSeconds;

    public Long getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Long timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }
}

