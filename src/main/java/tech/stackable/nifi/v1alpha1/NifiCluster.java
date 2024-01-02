package tech.stackable.nifi.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("nifi.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("nificluster")
@io.fabric8.kubernetes.model.annotation.Plural("nificlusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class NifiCluster extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.nifi.v1alpha1.NifiClusterSpec, tech.stackable.nifi.v1alpha1.NifiClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

