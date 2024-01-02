package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"postStart","preStop"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Lifecycle implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("postStart")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers.lifecycle.PostStart postStart;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers.lifecycle.PostStart getPostStart() {
        return postStart;
    }

    public void setPostStart(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers.lifecycle.PostStart postStart) {
        this.postStart = postStart;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("preStop")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers.lifecycle.PreStop preStop;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers.lifecycle.PreStop getPreStop() {
        return preStop;
    }

    public void setPreStop(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.podoverrides.spec.ephemeralcontainers.lifecycle.PreStop preStop) {
        this.preStop = preStop;
    }
}

