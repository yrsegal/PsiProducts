package wiresegal.psiproducts;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import vazkii.psi.common.spell.base.ModSpellPieces;

@Mod(modid = "psiproducts", name = "Psi Dot Products", version = "1.0.0", dependencies = "required-after:Psi;")
public class PsiProducts {

    public ModSpellPieces.PieceContainer dot;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        dot = ModSpellPieces.register(PieceOperatorVectorDot.class, "operatorDot", "vectorsIntro");
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

}
