package tech.stackable.zookeeper.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("zookeeper.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("zookeepercluster")
@io.fabric8.kubernetes.model.annotation.Plural("zookeeperclusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ZookeeperCluster extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.zookeeper.v1alpha1.ZookeeperClusterSpec, tech.stackable.zookeeper.v1alpha1.ZookeeperClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

