package tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"awsElasticBlockStore","azureDisk","azureFile","cephfs","cinder","configMap","csi","downwardAPI","emptyDir","ephemeral","fc","flexVolume","flocker","gcePersistentDisk","gitRepo","glusterfs","hostPath","iscsi","name","nfs","persistentVolumeClaim","photonPersistentDisk","portworxVolume","projected","quobyte","rbd","scaleIO","secret","storageos","vsphereVolume"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class ExtraVolumes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore
     */
    @com.fasterxml.jackson.annotation.JsonProperty("awsElasticBlockStore")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("awsElasticBlockStore represents an AWS Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#awselasticblockstore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AwsElasticBlockStore awsElasticBlockStore;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    /**
     * azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureDisk represents an Azure Data Disk mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AzureDisk azureDisk;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    /**
     * azureFile represents an Azure File Service mount on the host and bind mount to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("azureFile")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("azureFile represents an Azure File Service mount on the host and bind mount to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AzureFile azureFile;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    /**
     * cephFS represents a Ceph FS mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cephfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cephFS represents a Ceph FS mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Cephfs cephfs;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Cephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    /**
     * cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cinder")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("cinder represents a cinder volume attached and mounted on kubelets host machine. More info: https://examples.k8s.io/mysql-cinder-pd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Cinder cinder;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Cinder getCinder() {
        return cinder;
    }

    public void setCinder(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Cinder cinder) {
        this.cinder = cinder;
    }

    /**
     * configMap represents a configMap that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("configMap represents a configMap that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.ConfigMap configMap;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    /**
     * csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("csi (Container Storage Interface) represents ephemeral storage that is handled by certain external CSI drivers (Beta feature).")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Csi csi;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Csi getCsi() {
        return csi;
    }

    public void setCsi(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Csi csi) {
        this.csi = csi;
    }

    /**
     * downwardAPI represents downward API about the pod that should populate this volume
     */
    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("downwardAPI represents downward API about the pod that should populate this volume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.DownwardAPI downwardAPI;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    /**
     * emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir
     */
    @com.fasterxml.jackson.annotation.JsonProperty("emptyDir")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("emptyDir represents a temporary directory that shares a pod's lifetime. More info: https://kubernetes.io/docs/concepts/storage/volumes#emptydir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.EmptyDir emptyDir;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.EmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    /**
     * ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.
     *
     * Use this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity
     *    tracking are needed,
     * c) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through
     *    a PersistentVolumeClaim (see EphemeralVolumeSource for more
     *    information on the connection between this volume type
     *    and PersistentVolumeClaim).
     *
     * Use PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.
     *
     * Use CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.
     *
     * A pod can use both types of ephemeral volumes and persistent volumes at the same time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ephemeral represents a volume that is handled by a cluster storage driver. The volume's lifecycle is tied to the pod that defines it - it will be created before the pod starts, and deleted when the pod is removed.\n\nUse this if: a) the volume is only needed while the pod runs, b) features of normal volumes like restoring from snapshot or capacity\n   tracking are needed,\nc) the storage driver is specified through a storage class, and d) the storage driver supports dynamic volume provisioning through\n   a PersistentVolumeClaim (see EphemeralVolumeSource for more\n   information on the connection between this volume type\n   and PersistentVolumeClaim).\n\nUse PersistentVolumeClaim or one of the vendor-specific APIs for volumes that persist for longer than the lifecycle of an individual pod.\n\nUse CSI for light-weight local ephemeral volumes if the CSI driver is meant to be used that way - see the documentation of the driver for more information.\n\nA pod can use both types of ephemeral volumes and persistent volumes at the same time.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Ephemeral ephemeral;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    /**
     * fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("fc represents a Fibre Channel resource that is attached to a kubelet's host machine and then exposed to the pod.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Fc fc;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Fc getFc() {
        return fc;
    }

    public void setFc(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Fc fc) {
        this.fc = fc;
    }

    /**
     * flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flexVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flexVolume represents a generic volume resource that is provisioned/attached using an exec based plugin.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.FlexVolume flexVolume;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.FlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    /**
     * flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running
     */
    @com.fasterxml.jackson.annotation.JsonProperty("flocker")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("flocker represents a Flocker volume attached to a kubelet's host machine. This depends on the Flocker control service being running")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Flocker flocker;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Flocker getFlocker() {
        return flocker;
    }

    public void setFlocker(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Flocker flocker) {
        this.flocker = flocker;
    }

    /**
     * gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gcePersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gcePersistentDisk represents a GCE Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://kubernetes.io/docs/concepts/storage/volumes#gcepersistentdisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.GcePersistentDisk gcePersistentDisk;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    /**
     * gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gitRepo")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("gitRepo represents a git repository at a particular revision. DEPRECATED: GitRepo is deprecated. To provision a container with a git repo, mount an EmptyDir into an InitContainer that clones the repo using git, then mount the EmptyDir into the Pod's container.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.GitRepo gitRepo;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.GitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    /**
     * glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("glusterfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("glusterfs represents a Glusterfs mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/glusterfs/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Glusterfs glusterfs;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Glusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    /**
     * hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("hostPath represents a pre-existing file or directory on the host machine that is directly exposed to the container. This is generally used for system agents or other privileged things that are allowed to see the host machine. Most containers will NOT need this. More info: https://kubernetes.io/docs/concepts/storage/volumes#hostpath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.HostPath hostPath;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.HostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.HostPath hostPath) {
        this.hostPath = hostPath;
    }

    /**
     * iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("iscsi represents an ISCSI Disk resource that is attached to a kubelet's host machine and then exposed to the pod. More info: https://examples.k8s.io/volumes/iscsi/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Iscsi iscsi;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Iscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Iscsi iscsi) {
        this.iscsi = iscsi;
    }

    /**
     * name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("name of the volume. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nfs")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("nfs represents an NFS mount on the host that shares a pod's lifetime More info: https://kubernetes.io/docs/concepts/storage/volumes#nfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Nfs nfs;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Nfs getNfs() {
        return nfs;
    }

    public void setNfs(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Nfs nfs) {
        this.nfs = nfs;
    }

    /**
     * persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
     */
    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("persistentVolumeClaimVolumeSource represents a reference to a PersistentVolumeClaim in the same namespace. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PersistentVolumeClaim persistentVolumeClaim;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    /**
     * photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("photonPersistentDisk")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("photonPersistentDisk represents a PhotonController persistent disk attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PhotonPersistentDisk photonPersistentDisk;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    /**
     * portworxVolume represents a portworx volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("portworxVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("portworxVolume represents a portworx volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PortworxVolume portworxVolume;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    /**
     * projected items for all in one resources secrets, configmaps, and downward API
     */
    @com.fasterxml.jackson.annotation.JsonProperty("projected")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("projected items for all in one resources secrets, configmaps, and downward API")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Projected projected;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Projected getProjected() {
        return projected;
    }

    public void setProjected(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Projected projected) {
        this.projected = projected;
    }

    /**
     * quobyte represents a Quobyte mount on the host that shares a pod's lifetime
     */
    @com.fasterxml.jackson.annotation.JsonProperty("quobyte")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("quobyte represents a Quobyte mount on the host that shares a pod's lifetime")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Quobyte quobyte;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Quobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    /**
     * rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rbd")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("rbd represents a Rados Block Device mount on the host that shares a pod's lifetime. More info: https://examples.k8s.io/volumes/rbd/README.md")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Rbd rbd;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Rbd getRbd() {
        return rbd;
    }

    public void setRbd(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Rbd rbd) {
        this.rbd = rbd;
    }

    /**
     * scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scaleIO")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("scaleIO represents a ScaleIO persistent volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.ScaleIO scaleIO;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.ScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    /**
     * secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("secret represents a secret that should populate this volume. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Secret secret;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Secret secret) {
        this.secret = secret;
    }

    /**
     * storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageos")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("storageOS represents a StorageOS volume attached and mounted on Kubernetes nodes.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Storageos storageos;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Storageos getStorageos() {
        return storageos;
    }

    public void setStorageos(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.Storageos storageos) {
        this.storageos = storageos;
    }

    /**
     * vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("vsphereVolume represents a vSphere volume attached and mounted on kubelets host machine")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.VsphereVolume vsphereVolume;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(tech.stackable.nifi.v1alpha1.nificlusterspec.clusterconfig.extravolumes.VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }
}

