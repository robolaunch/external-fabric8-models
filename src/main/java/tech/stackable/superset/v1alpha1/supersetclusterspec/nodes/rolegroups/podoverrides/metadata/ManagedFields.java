package tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.metadata;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"apiVersion","fieldsType","fieldsV1","manager","operation","subresource","time"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ManagedFields implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("apiVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String apiVersion;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldsType")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String fieldsType;

    public String getFieldsType() {
        return fieldsType;
    }

    public void setFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldsV1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.metadata.managedfields.FieldsV1 fieldsV1;

    public tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.metadata.managedfields.FieldsV1 getFieldsV1() {
        return fieldsV1;
    }

    public void setFieldsV1(tech.stackable.superset.v1alpha1.supersetclusterspec.nodes.rolegroups.podoverrides.metadata.managedfields.FieldsV1 fieldsV1) {
        this.fieldsV1 = fieldsV1;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("manager")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String manager;

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String operation;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subresource")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String subresource;

    public String getSubresource() {
        return subresource;
    }

    public void setSubresource(String subresource) {
        this.subresource = subresource;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("time")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

