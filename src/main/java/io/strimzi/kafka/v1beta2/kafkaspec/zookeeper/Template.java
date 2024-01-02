package io.strimzi.kafka.v1beta2.kafkaspec.zookeeper;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"clientService","jmxSecret","nodesService","persistentVolumeClaim","pod","podDisruptionBudget","podSet","serviceAccount","statefulset","zookeeperContainer"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for ZooKeeper client `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper client `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ClientService clientService;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ClientService getClientService() {
        return clientService;
    }

    public void setClientService(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * Template for Secret of the Zookeeper Cluster JMX authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Secret of the Zookeeper Cluster JMX authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.JmxSecret jmxSecret;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.JmxSecret getJmxSecret() {
        return jmxSecret;
    }

    public void setJmxSecret(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.JmxSecret jmxSecret) {
        this.jmxSecret = jmxSecret;
    }

    /**
     * Template for ZooKeeper nodes `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodesService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper nodes `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.NodesService nodesService;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.NodesService getNodesService() {
        return nodesService;
    }

    public void setNodesService(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.NodesService nodesService) {
        this.nodesService = nodesService;
    }

    /**
     * Template for all ZooKeeper `PersistentVolumeClaims`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for all ZooKeeper `PersistentVolumeClaims`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PersistentVolumeClaim persistentVolumeClaim;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * Template for ZooKeeper `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for ZooKeeper `PodDisruptionBudget`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podDisruptionBudget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper `PodDisruptionBudget`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PodDisruptionBudget podDisruptionBudget;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    public void setPodDisruptionBudget(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    /**
     * Template for ZooKeeper `StrimziPodSet` resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper `StrimziPodSet` resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PodSet podSet;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PodSet getPodSet() {
        return podSet;
    }

    public void setPodSet(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.PodSet podSet) {
        this.podSet = podSet;
    }

    /**
     * Template for the ZooKeeper service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the ZooKeeper service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * Template for ZooKeeper `StatefulSet`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statefulset")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for ZooKeeper `StatefulSet`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.Statefulset statefulset;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.Statefulset getStatefulset() {
        return statefulset;
    }

    public void setStatefulset(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.Statefulset statefulset) {
        this.statefulset = statefulset;
    }

    /**
     * Template for the ZooKeeper container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("zookeeperContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the ZooKeeper container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ZookeeperContainer zookeeperContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ZookeeperContainer getZookeeperContainer() {
        return zookeeperContainer;
    }

    public void setZookeeperContainer(io.strimzi.kafka.v1beta2.kafkaspec.zookeeper.template.ZookeeperContainer zookeeperContainer) {
        this.zookeeperContainer = zookeeperContainer;
    }
}

