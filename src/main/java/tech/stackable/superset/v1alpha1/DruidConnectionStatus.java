package tech.stackable.superset.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"condition","startedAt"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DruidConnectionStatus implements io.fabric8.kubernetes.api.model.KubernetesResource {

    public enum Condition {

        @com.fasterxml.jackson.annotation.JsonProperty("Pending")
        PENDING("Pending"), @com.fasterxml.jackson.annotation.JsonProperty("Importing")
        IMPORTING("Importing"), @com.fasterxml.jackson.annotation.JsonProperty("Ready")
        READY("Ready"), @com.fasterxml.jackson.annotation.JsonProperty("Failed")
        FAILED("Failed");

        java.lang.String value;

        Condition(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Condition condition;

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    /**
     * Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("startedAt")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Time is a wrapper around time.Time which supports correct marshaling to YAML and JSON.  Wrappers are provided for many of the factory methods that the time package offers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String startedAt;

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }
}

