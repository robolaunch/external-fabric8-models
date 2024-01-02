package io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"class","deleteClaim","id","overrides","selector","size","sizeLimit","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Volumes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The storage class to use for dynamic volume allocation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("class")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The storage class to use for dynamic volume allocation.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String _class;

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    /**
     * Specifies if the persistent volume claim has to be deleted when the cluster is un-deployed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deleteClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies if the persistent volume claim has to be deleted when the cluster is un-deployed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Boolean deleteClaim;

    public Boolean getDeleteClaim() {
        return deleteClaim;
    }

    public void setDeleteClaim(Boolean deleteClaim) {
        this.deleteClaim = deleteClaim;
    }

    /**
     * Storage identification number. It is mandatory only for storage volumes defined in a storage of type 'jbod'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    @io.fabric8.generator.annotation.Min(0.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage identification number. It is mandatory only for storage volumes defined in a storage of type 'jbod'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Overrides for individual brokers. The `overrides` field allows to specify a different configuration for different brokers.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("overrides")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Overrides for individual brokers. The `overrides` field allows to specify a different configuration for different brokers.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes.Overrides> overrides;

    public java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes.Overrides> getOverrides() {
        return overrides;
    }

    public void setOverrides(java.util.List<io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes.Overrides> overrides) {
        this.overrides = overrides;
    }

    /**
     * Specifies a specific persistent volume to use. It contains key:value pairs representing labels for selecting such a volume.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies a specific persistent volume to use. It contains key:value pairs representing labels for selecting such a volume.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes.Selector selector;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes.Selector getSelector() {
        return selector;
    }

    public void setSelector(io.strimzi.kafka.v1beta2.kafkaspec.kafka.storage.volumes.Selector selector) {
        this.selector = selector;
    }

    /**
     * When type=persistent-claim, defines the size of the persistent volume claim (i.e 1Gi). Mandatory when type=persistent-claim.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When type=persistent-claim, defines the size of the persistent volume claim (i.e 1Gi). Mandatory when type=persistent-claim.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * When type=ephemeral, defines the total amount of local storage required for this EmptyDir volume (for example 1Gi).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeLimit")
    @io.fabric8.generator.annotation.Pattern("^([0-9.]+)([eEinumkKMGTP]*[-+]?[0-9]*)$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("When type=ephemeral, defines the total amount of local storage required for this EmptyDir volume (for example 1Gi).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String sizeLimit;

    public String getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(String sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    public enum Type {

        @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
        EPHEMERAL("ephemeral"), @com.fasterxml.jackson.annotation.JsonProperty("persistent-claim")
        PERSISTENTCLAIM("persistent-claim");

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
     * Storage type, must be either 'ephemeral' or 'persistent-claim'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Storage type, must be either 'ephemeral' or 'persistent-claim'.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

