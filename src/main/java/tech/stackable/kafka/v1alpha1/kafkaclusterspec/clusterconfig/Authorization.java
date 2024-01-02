package tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"opa"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Authorization implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Configure the OPA stacklet [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) and the name of the Rego package containing your authorization rules. Consult the [OPA authorization documentation](https://docs.stackable.tech/home/nightly/concepts/opa) to learn how to deploy Rego authorization rules with OPA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opa")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Configure the OPA stacklet [discovery ConfigMap](https://docs.stackable.tech/home/nightly/concepts/service_discovery) and the name of the Rego package containing your authorization rules. Consult the [OPA authorization documentation](https://docs.stackable.tech/home/nightly/concepts/opa) to learn how to deploy Rego authorization rules with OPA.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SET)
    @io.fabric8.generator.annotation.Nullable()
    private tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.authorization.Opa opa;

    public tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.authorization.Opa getOpa() {
        return opa;
    }

    public void setOpa(tech.stackable.kafka.v1alpha1.kafkaclusterspec.clusterconfig.authorization.Opa opa) {
        this.opa = opa;
    }
}

