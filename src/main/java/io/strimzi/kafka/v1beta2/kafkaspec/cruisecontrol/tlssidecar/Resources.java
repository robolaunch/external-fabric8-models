package io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"claims","limits","requests"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("claims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Claims> claims;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Claims> getClaims() {
        return claims;
    }

    public void setClaims(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Claims> claims) {
        this.claims = claims;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Limits limits;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Limits getLimits() {
        return limits;
    }

    public void setLimits(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Limits limits) {
        this.limits = limits;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Requests requests;

    public io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Requests getRequests() {
        return requests;
    }

    public void setRequests(io.strimzi.kafka.v1beta2.kafkaspec.cruisecontrol.tlssidecar.resources.Requests requests) {
        this.requests = requests;
    }
}

