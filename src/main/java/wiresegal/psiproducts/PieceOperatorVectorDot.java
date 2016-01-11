package wiresegal.psiproducts;

import vazkii.psi.api.internal.Vector3;
import vazkii.psi.api.spell.Spell;
import vazkii.psi.api.spell.SpellContext;
import vazkii.psi.api.spell.SpellParam;
import vazkii.psi.api.spell.SpellRuntimeException;
import vazkii.psi.api.spell.param.ParamVector;
import vazkii.psi.api.spell.piece.PieceOperator;

/**
 * @author WireSegal
 *         Created at 5:47 PM on 2/10/16.
 */
public class PieceOperatorVectorDot extends PieceOperator {

    SpellParam vec1;
    SpellParam vec2;

    public PieceOperatorVectorDot(Spell spell) {
        super(spell);
    }

    @Override
    public void initParams() {
        addParam(vec1 = new ParamVector(SpellParam.GENERIC_NAME_VECTOR1, SpellParam.RED, false, false));
        addParam(vec2 = new ParamVector(SpellParam.GENERIC_NAME_VECTOR2, SpellParam.GREEN, false, false));
    }

    @Override
    public Object execute(SpellContext context) throws SpellRuntimeException {
        Vector3 v1 = this.<Vector3>getParamValue(context, vec1);
        Vector3 v2 = this.<Vector3>getParamValue(context, vec2);

        return v1.dotProduct(v2);
    }

    @Override
    public Class<?> getEvaluationType() {
        return Double.class;
    }

}
