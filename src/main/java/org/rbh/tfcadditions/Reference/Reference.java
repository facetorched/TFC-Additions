package org.rbh.tfcadditions.Reference;

/**
 * Created by raymondbh on 15.07.2015.
 */
public class Reference {
    public static final String ModID = "tfcadditions";
    public static final String ModName = "TFC-Additions";

    public static final int VersionMajor = 1;
    public static final int VersionMinor = 0;
    public static final int VersionRevision = 6;

    public static final String ModVersion = VersionMajor + "." + VersionMinor + "." + VersionRevision;
    //public static final String TFCVersion = "@TFCVERSION@";

    //public static final String ModDependencies = "required-after:terrafirmacraft;required-after:CarpentersBlocks;required-after:NotEnoughItems";
    public static final String SERVER_PROXY_CLASS = "org.rbh.tfcadditions.Proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "org.rbh.tfcadditions.Proxy.ClientProxy";

    public static final String AssetPath = "/assets/" + ModID + "/";
    public static final String AssetPathGui = "textures/gui/";

    public static final String GUI_FACTORY = "org.rbh.tfcadditions.Config.GUIFactory";

    public static final String ModDependencies = "required-after:terrafirmacraftplus" +
            ";required-after:ctmlib";
}