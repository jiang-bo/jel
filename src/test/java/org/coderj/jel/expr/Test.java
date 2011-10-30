package org.coderj.jel.expr;

import org.coderj.jel.context.ExprContext;

public class Test {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		ExprContext ctx = new ExprContext();
		ctx.put("A", 1);
		ctx.put("B", 2);
		// TODO Auto-generated method stub
		Expr expr = new Expr("A+B/2;", ctx);
		System.out.println(expr.eval());
	}

}
