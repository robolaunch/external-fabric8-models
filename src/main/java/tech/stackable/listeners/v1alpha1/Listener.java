package tech.stackable.listeners.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("listeners.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("listener")
@io.fabric8.kubernetes.model.annotation.Plural("listeners")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Listener extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.listeners.v1alpha1.ListenerSpec, tech.stackable.listeners.v1alpha1.ListenerStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

