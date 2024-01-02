package tech.stackable.kafka.v1alpha1;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha1" , storage = true , served = true)
@io.fabric8.kubernetes.model.annotation.Group("kafka.stackable.tech")
@io.fabric8.kubernetes.model.annotation.Singular("kafkacluster")
@io.fabric8.kubernetes.model.annotation.Plural("kafkaclusters")
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class KafkaCluster extends io.fabric8.kubernetes.client.CustomResource<tech.stackable.kafka.v1alpha1.KafkaClusterSpec, tech.stackable.kafka.v1alpha1.KafkaClusterStatus> implements io.fabric8.kubernetes.api.model.Namespaced {
}

