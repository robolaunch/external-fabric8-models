package tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"awsElasticBlockStore","azureDisk","azureFile","cephfs","cinder","configMap","csi","downwardAPI","emptyDir","ephemeral","fc","flexVolume","flocker","gcePersistentDisk","gitRepo","glusterfs","hostPath","iscsi","name","nfs","persistentVolumeClaim","photonPersistentDisk","portworxVolume","projected","quobyte","rbd","scaleIO","secret","storageos","vsphereVolume"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Volumes implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("awsElasticBlockStore")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AwsElasticBlockStore awsElasticBlockStore;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AwsElasticBlockStore getAwsElasticBlockStore() {
        return awsElasticBlockStore;
    }

    public void setAwsElasticBlockStore(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AwsElasticBlockStore awsElasticBlockStore) {
        this.awsElasticBlockStore = awsElasticBlockStore;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("azureDisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AzureDisk azureDisk;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AzureDisk getAzureDisk() {
        return azureDisk;
    }

    public void setAzureDisk(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AzureDisk azureDisk) {
        this.azureDisk = azureDisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("azureFile")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AzureFile azureFile;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AzureFile getAzureFile() {
        return azureFile;
    }

    public void setAzureFile(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.AzureFile azureFile) {
        this.azureFile = azureFile;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cephfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Cephfs cephfs;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Cephfs getCephfs() {
        return cephfs;
    }

    public void setCephfs(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Cephfs cephfs) {
        this.cephfs = cephfs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cinder")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Cinder cinder;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Cinder getCinder() {
        return cinder;
    }

    public void setCinder(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Cinder cinder) {
        this.cinder = cinder;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configMap")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.ConfigMap configMap;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.ConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.ConfigMap configMap) {
        this.configMap = configMap;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Csi csi;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Csi getCsi() {
        return csi;
    }

    public void setCsi(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Csi csi) {
        this.csi = csi;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("downwardAPI")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.DownwardAPI downwardAPI;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.DownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.DownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("emptyDir")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.EmptyDir emptyDir;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.EmptyDir getEmptyDir() {
        return emptyDir;
    }

    public void setEmptyDir(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.EmptyDir emptyDir) {
        this.emptyDir = emptyDir;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ephemeral")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Ephemeral ephemeral;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Ephemeral getEphemeral() {
        return ephemeral;
    }

    public void setEphemeral(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Ephemeral ephemeral) {
        this.ephemeral = ephemeral;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fc")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Fc fc;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Fc getFc() {
        return fc;
    }

    public void setFc(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Fc fc) {
        this.fc = fc;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flexVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.FlexVolume flexVolume;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.FlexVolume getFlexVolume() {
        return flexVolume;
    }

    public void setFlexVolume(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.FlexVolume flexVolume) {
        this.flexVolume = flexVolume;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("flocker")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Flocker flocker;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Flocker getFlocker() {
        return flocker;
    }

    public void setFlocker(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Flocker flocker) {
        this.flocker = flocker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gcePersistentDisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.GcePersistentDisk gcePersistentDisk;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.GcePersistentDisk getGcePersistentDisk() {
        return gcePersistentDisk;
    }

    public void setGcePersistentDisk(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.GcePersistentDisk gcePersistentDisk) {
        this.gcePersistentDisk = gcePersistentDisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("gitRepo")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.GitRepo gitRepo;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.GitRepo getGitRepo() {
        return gitRepo;
    }

    public void setGitRepo(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.GitRepo gitRepo) {
        this.gitRepo = gitRepo;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("glusterfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Glusterfs glusterfs;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Glusterfs getGlusterfs() {
        return glusterfs;
    }

    public void setGlusterfs(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Glusterfs glusterfs) {
        this.glusterfs = glusterfs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("hostPath")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.HostPath hostPath;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.HostPath getHostPath() {
        return hostPath;
    }

    public void setHostPath(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.HostPath hostPath) {
        this.hostPath = hostPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iscsi")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Iscsi iscsi;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Iscsi getIscsi() {
        return iscsi;
    }

    public void setIscsi(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Iscsi iscsi) {
        this.iscsi = iscsi;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nfs")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Nfs nfs;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Nfs getNfs() {
        return nfs;
    }

    public void setNfs(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Nfs nfs) {
        this.nfs = nfs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("persistentVolumeClaim")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PersistentVolumeClaim persistentVolumeClaim;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("photonPersistentDisk")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PhotonPersistentDisk photonPersistentDisk;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PhotonPersistentDisk getPhotonPersistentDisk() {
        return photonPersistentDisk;
    }

    public void setPhotonPersistentDisk(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PhotonPersistentDisk photonPersistentDisk) {
        this.photonPersistentDisk = photonPersistentDisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("portworxVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PortworxVolume portworxVolume;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PortworxVolume getPortworxVolume() {
        return portworxVolume;
    }

    public void setPortworxVolume(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.PortworxVolume portworxVolume) {
        this.portworxVolume = portworxVolume;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("projected")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Projected projected;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Projected getProjected() {
        return projected;
    }

    public void setProjected(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Projected projected) {
        this.projected = projected;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("quobyte")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Quobyte quobyte;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Quobyte getQuobyte() {
        return quobyte;
    }

    public void setQuobyte(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Quobyte quobyte) {
        this.quobyte = quobyte;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rbd")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Rbd rbd;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Rbd getRbd() {
        return rbd;
    }

    public void setRbd(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Rbd rbd) {
        this.rbd = rbd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scaleIO")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.ScaleIO scaleIO;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.ScaleIO getScaleIO() {
        return scaleIO;
    }

    public void setScaleIO(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.ScaleIO scaleIO) {
        this.scaleIO = scaleIO;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Secret secret;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Secret getSecret() {
        return secret;
    }

    public void setSecret(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Secret secret) {
        this.secret = secret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageos")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Storageos storageos;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Storageos getStorageos() {
        return storageos;
    }

    public void setStorageos(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.Storageos storageos) {
        this.storageos = storageos;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vsphereVolume")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.VsphereVolume vsphereVolume;

    public tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.VsphereVolume getVsphereVolume() {
        return vsphereVolume;
    }

    public void setVsphereVolume(tech.stackable.nifi.v1alpha1.nificlusterspec.nodes.rolegroups.podoverrides.spec.volumes.VsphereVolume vsphereVolume) {
        this.vsphereVolume = vsphereVolume;
    }
}

