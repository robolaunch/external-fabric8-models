package tech.stackable.nifi.v1alpha1.nificlusterstatus;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"lastTransitionTime","lastUpdateTime","message","reason","status","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Conditions implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Last time the condition transitioned from one status to another.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastTransitionTime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Last time the condition transitioned from one status to another.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String lastTransitionTime;

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    /**
     * The last time this condition was updated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdateTime")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The last time this condition was updated.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String lastUpdateTime;

    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * A human readable message indicating details about the transition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A human readable message indicating details about the transition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * The reason for the condition's last transition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The reason for the condition's last transition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public enum Status {

        @com.fasterxml.jackson.annotation.JsonProperty("True")
        TRUE("True"), @com.fasterxml.jackson.annotation.JsonProperty("False")
        FALSE("False"), @com.fasterxml.jackson.annotation.JsonProperty("Unknown")
        UNKNOWN("Unknown");

        java.lang.String value;

        Status(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Status of the condition, one of True, False, Unknown.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Status of the condition, one of True, False, Unknown.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("Available")
        AVAILABLE("Available"), @com.fasterxml.jackson.annotation.JsonProperty("Degraded")
        DEGRADED("Degraded"), @com.fasterxml.jackson.annotation.JsonProperty("Progressing")
        PROGRESSING("Progressing"), @com.fasterxml.jackson.annotation.JsonProperty("ReconciliationPaused")
        RECONCILIATIONPAUSED("ReconciliationPaused"), @com.fasterxml.jackson.annotation.JsonProperty("Stopped")
        STOPPED("Stopped");

        java.lang.String value;

        Type(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * Type of deployment condition.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Type of deployment condition.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

