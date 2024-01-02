package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"contentRepo","databaseRepo","flowfileRepo","provenanceRepo","stateRepo"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Storage implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * [The Content Repository](https://nifi.apache.org/docs/nifi-docs/html/nifi-in-depth.html#content-repository) is simply a place in local storage where the content of all FlowFiles exists and it is typically the largest of the Repositories.
     *
     * Default size: 4GB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[The Content Repository](https://nifi.apache.org/docs/nifi-docs/html/nifi-in-depth.html#content-repository) is simply a place in local storage where the content of all FlowFiles exists and it is typically the largest of the Repositories.\n\nDefault size: 4GB")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ContentRepo contentRepo = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ContentRepo.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ContentRepo getContentRepo() {
        return contentRepo;
    }

    public void setContentRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ContentRepo contentRepo) {
        this.contentRepo = contentRepo;
    }

    /**
     * Default size: 1GB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default size: 1GB")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.DatabaseRepo databaseRepo = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.DatabaseRepo.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.DatabaseRepo getDatabaseRepo() {
        return databaseRepo;
    }

    public void setDatabaseRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.DatabaseRepo databaseRepo) {
        this.databaseRepo = databaseRepo;
    }

    /**
     * [The FlowFile Repository](https://nifi.apache.org/docs/nifi-docs/html/nifi-in-depth.html#flowfile-repository) is where NiFi keeps track of the state and metadata of FlowFiles as they traverse the data flow. The repository ensures durability, reliability, and recoverability of data in case of system failures or interruptions.
     *
     * Default size: 1GB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flowfileRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[The FlowFile Repository](https://nifi.apache.org/docs/nifi-docs/html/nifi-in-depth.html#flowfile-repository) is where NiFi keeps track of the state and metadata of FlowFiles as they traverse the data flow. The repository ensures durability, reliability, and recoverability of data in case of system failures or interruptions.\n\nDefault size: 1GB")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.FlowfileRepo flowfileRepo = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.FlowfileRepo.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.FlowfileRepo getFlowfileRepo() {
        return flowfileRepo;
    }

    public void setFlowfileRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.FlowfileRepo flowfileRepo) {
        this.flowfileRepo = flowfileRepo;
    }

    /**
     * [The Provenance Repository](https://nifi.apache.org/docs/nifi-docs/html/nifi-in-depth.html#provenance-repository) is where the history of each FlowFile is stored. This history is used to provide the Data Lineage (also known as the Chain of Custody) of each piece of data.
     *
     * Default size: 2GB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provenanceRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[The Provenance Repository](https://nifi.apache.org/docs/nifi-docs/html/nifi-in-depth.html#provenance-repository) is where the history of each FlowFile is stored. This history is used to provide the Data Lineage (also known as the Chain of Custody) of each piece of data.\n\nDefault size: 2GB")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ProvenanceRepo provenanceRepo = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ProvenanceRepo.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ProvenanceRepo getProvenanceRepo() {
        return provenanceRepo;
    }

    public void setProvenanceRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.ProvenanceRepo provenanceRepo) {
        this.provenanceRepo = provenanceRepo;
    }

    /**
     * Default size: 1GB
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Default size: 1GB")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.StateRepo stateRepo = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("{\"capacity\":null}", tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.StateRepo.class);

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.StateRepo getStateRepo() {
        return stateRepo;
    }

    public void setStateRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.config.resources.storage.StateRepo stateRepo) {
        this.stateRepo = stateRepo;
    }
}

