package tech.stackable.opa.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("opa.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("opacluster")
@io.fabric8.kubernetes.model.annotation.Plural("opaclusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class OpaCluster extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.opa.v1alpha1.OpaClusterSpec, tech.stackable.opa.v1alpha1.OpaClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

