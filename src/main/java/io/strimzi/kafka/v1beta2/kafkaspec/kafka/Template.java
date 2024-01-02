package io.strimzi.kafka.v1beta2.kafkaspec.kafka;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"bootstrapService","brokersService","clusterCaCert","clusterRoleBinding","externalBootstrapIngress","externalBootstrapRoute","externalBootstrapService","initContainer","jmxSecret","kafkaContainer","perPodIngress","perPodRoute","perPodService","persistentVolumeClaim","pod","podDisruptionBudget","podSet","serviceAccount","statefulset"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Template implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Template for Kafka bootstrap `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bootstrapService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka bootstrap `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.BootstrapService bootstrapService;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.BootstrapService getBootstrapService() {
        return bootstrapService;
    }

    public void setBootstrapService(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.BootstrapService bootstrapService) {
        this.bootstrapService = bootstrapService;
    }

    /**
     * Template for Kafka broker `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("brokersService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka broker `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.BrokersService brokersService;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.BrokersService getBrokersService() {
        return brokersService;
    }

    public void setBrokersService(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.BrokersService brokersService) {
        this.brokersService = brokersService;
    }

    /**
     * Template for Secret with Kafka Cluster certificate public key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterCaCert")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Secret with Kafka Cluster certificate public key.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ClusterCaCert clusterCaCert;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ClusterCaCert getClusterCaCert() {
        return clusterCaCert;
    }

    public void setClusterCaCert(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ClusterCaCert clusterCaCert) {
        this.clusterCaCert = clusterCaCert;
    }

    /**
     * Template for the Kafka ClusterRoleBinding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterRoleBinding")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka ClusterRoleBinding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ClusterRoleBinding clusterRoleBinding;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ClusterRoleBinding getClusterRoleBinding() {
        return clusterRoleBinding;
    }

    public void setClusterRoleBinding(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ClusterRoleBinding clusterRoleBinding) {
        this.clusterRoleBinding = clusterRoleBinding;
    }

    /**
     * Template for Kafka external bootstrap `Ingress`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalBootstrapIngress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka external bootstrap `Ingress`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapIngress externalBootstrapIngress;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapIngress getExternalBootstrapIngress() {
        return externalBootstrapIngress;
    }

    public void setExternalBootstrapIngress(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapIngress externalBootstrapIngress) {
        this.externalBootstrapIngress = externalBootstrapIngress;
    }

    /**
     * Template for Kafka external bootstrap `Route`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalBootstrapRoute")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka external bootstrap `Route`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapRoute externalBootstrapRoute;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapRoute getExternalBootstrapRoute() {
        return externalBootstrapRoute;
    }

    public void setExternalBootstrapRoute(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapRoute externalBootstrapRoute) {
        this.externalBootstrapRoute = externalBootstrapRoute;
    }

    /**
     * Template for Kafka external bootstrap `Service`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalBootstrapService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka external bootstrap `Service`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapService externalBootstrapService;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapService getExternalBootstrapService() {
        return externalBootstrapService;
    }

    public void setExternalBootstrapService(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ExternalBootstrapService externalBootstrapService) {
        this.externalBootstrapService = externalBootstrapService;
    }

    /**
     * Template for the Kafka init container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka init container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.InitContainer initContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.InitContainer getInitContainer() {
        return initContainer;
    }

    public void setInitContainer(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.InitContainer initContainer) {
        this.initContainer = initContainer;
    }

    /**
     * Template for Secret of the Kafka Cluster JMX authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("jmxSecret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Secret of the Kafka Cluster JMX authentication.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.JmxSecret jmxSecret;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.JmxSecret getJmxSecret() {
        return jmxSecret;
    }

    public void setJmxSecret(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.JmxSecret jmxSecret) {
        this.jmxSecret = jmxSecret;
    }

    /**
     * Template for the Kafka broker container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaContainer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka broker container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.KafkaContainer kafkaContainer;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.KafkaContainer getKafkaContainer() {
        return kafkaContainer;
    }

    public void setKafkaContainer(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.KafkaContainer kafkaContainer) {
        this.kafkaContainer = kafkaContainer;
    }

    /**
     * Template for Kafka per-pod `Ingress` used for access from outside of Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perPodIngress")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka per-pod `Ingress` used for access from outside of Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodIngress perPodIngress;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodIngress getPerPodIngress() {
        return perPodIngress;
    }

    public void setPerPodIngress(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodIngress perPodIngress) {
        this.perPodIngress = perPodIngress;
    }

    /**
     * Template for Kafka per-pod `Routes` used for access from outside of OpenShift.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perPodRoute")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka per-pod `Routes` used for access from outside of OpenShift.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodRoute perPodRoute;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodRoute getPerPodRoute() {
        return perPodRoute;
    }

    public void setPerPodRoute(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodRoute perPodRoute) {
        this.perPodRoute = perPodRoute;
    }

    /**
     * Template for Kafka per-pod `Services` used for access from outside of Kubernetes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("perPodService")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka per-pod `Services` used for access from outside of Kubernetes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodService perPodService;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodService getPerPodService() {
        return perPodService;
    }

    public void setPerPodService(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PerPodService perPodService) {
        this.perPodService = perPodService;
    }

    /**
     * Template for all Kafka `PersistentVolumeClaims`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for all Kafka `PersistentVolumeClaims`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PersistentVolumeClaim persistentVolumeClaim;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * Template for Kafka `Pods`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pod")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka `Pods`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.Pod pod;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.Pod getPod() {
        return pod;
    }

    public void setPod(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.Pod pod) {
        this.pod = pod;
    }

    /**
     * Template for Kafka `PodDisruptionBudget`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podDisruptionBudget")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka `PodDisruptionBudget`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PodDisruptionBudget podDisruptionBudget;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PodDisruptionBudget getPodDisruptionBudget() {
        return podDisruptionBudget;
    }

    public void setPodDisruptionBudget(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PodDisruptionBudget podDisruptionBudget) {
        this.podDisruptionBudget = podDisruptionBudget;
    }

    /**
     * Template for Kafka `StrimziPodSet` resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("podSet")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka `StrimziPodSet` resource.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PodSet podSet;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PodSet getPodSet() {
        return podSet;
    }

    public void setPodSet(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.PodSet podSet) {
        this.podSet = podSet;
    }

    /**
     * Template for the Kafka service account.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccount")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for the Kafka service account.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ServiceAccount serviceAccount;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ServiceAccount getServiceAccount() {
        return serviceAccount;
    }

    public void setServiceAccount(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.ServiceAccount serviceAccount) {
        this.serviceAccount = serviceAccount;
    }

    /**
     * Template for Kafka `StatefulSet`.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statefulset")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Template for Kafka `StatefulSet`.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.Statefulset statefulset;

    public io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.Statefulset getStatefulset() {
        return statefulset;
    }

    public void setStatefulset(io.strimzi.kafka.v1beta2.kafkaspec.kafka.template.Statefulset statefulset) {
        this.statefulset = statefulset;
    }
}

