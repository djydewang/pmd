/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.vf.ast;

public class ASTExpression extends AbstractVFNode {
    public ASTExpression(int id) {
        super(id);
    }

    public ASTExpression(VfParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(VfParserVisitor visitor, Object data) {

        return visitor.visit(this, data);
    }
}
