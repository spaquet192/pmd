/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.apex.ast;

import apex.jorje.semantic.ast.condition.StandardCondition;

public class ASTStandardCondition extends AbstractApexNode<StandardCondition> {

	public ASTStandardCondition(StandardCondition standardCondition) {
		super(standardCondition);
	}

	public Object jjtAccept(ApexParserVisitor visitor, Object data) {
		return visitor.visit(this, data);
	}
}