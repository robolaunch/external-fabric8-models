package tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.authorization;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"configMapName","package"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Opa implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) for the OPA stacklet that should be used for authorization requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMapName")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) for the OPA stacklet that should be used for authorization requests.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String configMapName;

    public String getConfigMapName() {
        return configMapName;
    }

    public void setConfigMapName(String configMapName) {
        this.configMapName = configMapName;
    }

    /**
     * The name of the Rego package containing the Rego rules for the product.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("package")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The name of the Rego package containing the Rego rules for the product.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private String _package;

    public String get_package() {
        return _package;
    }

    public void set_package(String _package) {
        this._package = _package;
    }
}

