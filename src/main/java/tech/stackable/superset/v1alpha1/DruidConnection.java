package tech.stackable.superset.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("superset.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("druidconnection")
@io.fabric8.kubernetes.model.annotation.Plural("druidconnections")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class DruidConnection extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.superset.v1alpha1.DruidConnectionSpec, tech.stackable.superset.v1alpha1.DruidConnectionStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

