package tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMap","downwardAPI","secret","serviceAccountToken"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Sources implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.ConfigMap configMap;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.ConfigMap configMap) {
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.DownwardAPI downwardAPI;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.Secret secret;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.Secret getSecret() {
        return secret;
    }

    public void setSecret(tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.Secret secret) {
        this.secret = secret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountToken")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.ServiceAccountToken serviceAccountToken;

    public tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.ServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(tech.stackable.opa.v1alpha1.opaclusterspec.servers.podoverrides.spec.volumes.projected.sources.ServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }
}

