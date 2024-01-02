package tech.stackable.superset.v1alpha1.supersetclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"custom","productVersion","pullPolicy","pullSecrets","repo","stackableVersion"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Image implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Overwrite the docker image. Specify the full docker image name, e.g. `docker.stackable.tech/stackable/superset:1.4.1-stackable2.1.0`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("custom")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Overwrite the docker image. Specify the full docker image name, e.g. `docker.stackable.tech/stackable/superset:1.4.1-stackable2.1.0`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String custom;

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    /**
     * Version of the product, e.g. `1.4.1`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Version of the product, e.g. `1.4.1`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String productVersion;

    public String getProductVersion() {
        return productVersion;
    }

    public void setProductVersion(String productVersion) {
        this.productVersion = productVersion;
    }

    public enum PullPolicy {

        @com.fasterxml.jackson.annotation.JsonProperty("IfNotPresent")
        IFNOTPRESENT("IfNotPresent"), @com.fasterxml.jackson.annotation.JsonProperty("Always")
        ALWAYS("Always"), @com.fasterxml.jackson.annotation.JsonProperty("Never")
        NEVER("Never");

        java.lang.String value;

        PullPolicy(java.lang.String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue()
        public java.lang.String getValue() {
            return value;
        }
    }

    /**
     * [Pull policy](https://kubernetes.io/docs/concepts/containers/images/#image-pull-policy) used when pulling the image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pullPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[Pull policy](https://kubernetes.io/docs/concepts/containers/images/#image-pull-policy) used when pulling the image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private PullPolicy pullPolicy = io.fabric8.kubernetes.client.utils.Serialization.unmarshal("\"Always\"", PullPolicy.class);

    public PullPolicy getPullPolicy() {
        return pullPolicy;
    }

    public void setPullPolicy(PullPolicy pullPolicy) {
        this.pullPolicy = pullPolicy;
    }

    /**
     * [Image pull secrets](https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod) to pull images from a private registry.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pullSecrets")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("[Image pull secrets](https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod) to pull images from a private registry.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.image.PullSecrets> pullSecrets;

    public java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.image.PullSecrets> getPullSecrets() {
        return pullSecrets;
    }

    public void setPullSecrets(java.util.List<tech.stackable.superset.v1alpha1.supersetclusterspec.image.PullSecrets> pullSecrets) {
        this.pullSecrets = pullSecrets;
    }

    /**
     * Name of the docker repo, e.g. `docker.stackable.tech/stackable`
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the docker repo, e.g. `docker.stackable.tech/stackable`")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String repo;

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    /**
     * Stackable version of the product, e.g. `23.4`, `23.4.1` or `0.0.0-dev`. If not specified, the operator will use its own version, e.g. `23.4.1`. When using a nightly operator or a pr version, it will use the nightly `0.0.0-dev` image.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackableVersion")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Stackable version of the product, e.g. `23.4`, `23.4.1` or `0.0.0-dev`. If not specified, the operator will use its own version, e.g. `23.4.1`. When using a nightly operator or a pr version, it will use the nightly `0.0.0-dev` image.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String stackableVersion;

    public String getStackableVersion() {
        return stackableVersion;
    }

    public void setStackableVersion(String stackableVersion) {
        this.stackableVersion = stackableVersion;
    }
}

