package tech.stackable.superset.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("superset.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("supersetcluster")
@io.fabric8.kubernetes.model.annotation.Plural("supersetclusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class SupersetCluster extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.superset.v1alpha1.SupersetClusterSpec, tech.stackable.superset.v1alpha1.SupersetClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

