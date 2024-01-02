package tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.podoverrides.spec.ephemeralcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"claims","limits","requests"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Resources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("claims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.podoverrides.spec.ephemeralcontainers.resources.Claims> claims;

    public java.util.List<tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.podoverrides.spec.ephemeralcontainers.resources.Claims> getClaims() {
        return claims;
    }

    public void setClaims(java.util.List<tech.stackable.kafka.v1alpha1.kafkaclusterspec.brokers.rolegroups.podoverrides.spec.ephemeralcontainers.resources.Claims> claims) {
        this.claims = claims;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> limits;

    public java.util.Map<java.lang.String, String> getLimits() {
        return limits;
    }

    public void setLimits(java.util.Map<java.lang.String, String> limits) {
        this.limits = limits;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requests")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> requests;

    public java.util.Map<java.lang.String, String> getRequests() {
        return requests;
    }

    public void setRequests(java.util.Map<java.lang.String, String> requests) {
        this.requests = requests;
    }
}

