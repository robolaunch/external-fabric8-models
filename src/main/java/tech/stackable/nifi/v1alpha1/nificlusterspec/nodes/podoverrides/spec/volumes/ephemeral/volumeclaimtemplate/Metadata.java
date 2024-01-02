package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"annotations","creationTimestamp","deletionGracePeriodSeconds","deletionTimestamp","finalizers","generateName","generation","labels","managedFields","name","namespace","ownerReferences","resourceVersion","selfLink","uid"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Metadata implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("annotations")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> annotations;

    public java.util.Map<java.lang.String, String> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(java.util.Map<java.lang.String, String> annotations) {
        this.annotations = annotations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTimestamp")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String creationTimestamp;

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deletionGracePeriodSeconds")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long deletionGracePeriodSeconds;

    public Long getDeletionGracePeriodSeconds() {
        return deletionGracePeriodSeconds;
    }

    public void setDeletionGracePeriodSeconds(Long deletionGracePeriodSeconds) {
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deletionTimestamp")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String deletionTimestamp;

    public String getDeletionTimestamp() {
        return deletionTimestamp;
    }

    public void setDeletionTimestamp(String deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("finalizers")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> finalizers;

    public java.util.List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(java.util.List<String> finalizers) {
        this.finalizers = finalizers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("generateName")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String generateName;

    public String getGenerateName() {
        return generateName;
    }

    public void setGenerateName(String generateName) {
        this.generateName = generateName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("generation")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long generation;

    public Long getGeneration() {
        return generation;
    }

    public void setGeneration(Long generation) {
        this.generation = generation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.Map<java.lang.String, String> labels;

    public java.util.Map<java.lang.String, String> getLabels() {
        return labels;
    }

    public void setLabels(java.util.Map<java.lang.String, String> labels) {
        this.labels = labels;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("managedFields")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.metadata.ManagedFields> managedFields;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.metadata.ManagedFields> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.metadata.ManagedFields> managedFields) {
        this.managedFields = managedFields;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ownerReferences")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.metadata.OwnerReferences> ownerReferences;

    public java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.metadata.OwnerReferences> getOwnerReferences() {
        return ownerReferences;
    }

    public void setOwnerReferences(java.util.List<tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.volumes.ephemeral.volumeclaimtemplate.metadata.OwnerReferences> ownerReferences) {
        this.ownerReferences = ownerReferences;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceVersion")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String resourceVersion;

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("selfLink")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String selfLink;

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("uid")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}

