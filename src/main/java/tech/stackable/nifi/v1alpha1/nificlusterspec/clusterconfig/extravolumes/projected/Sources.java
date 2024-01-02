package tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMap","downwardAPI","secret","serviceAccountToken"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Sources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * configMap information about the configMap data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configMap information about the configMap data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.ConfigMap configMap;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * downwardAPI information about the downwardAPI data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("downwardAPI information about the downwardAPI data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.DownwardAPI downwardAPI;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * secret information about the secret data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secret information about the secret data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.Secret secret;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.Secret getSecret() {
        return secret;
    }

    public void setSecret(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.Secret secret) {
        this.secret = secret;
    }

    /**
     * serviceAccountToken is information about the serviceAccountToken data to project
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountToken")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("serviceAccountToken is information about the serviceAccountToken data to project")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.ServiceAccountToken serviceAccountToken;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.ServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.projected.sources.ServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }
}

