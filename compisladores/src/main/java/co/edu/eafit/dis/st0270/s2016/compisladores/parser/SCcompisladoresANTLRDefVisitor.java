// Generated from SCcompisladoresANTLRParser.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.misc.NotNull;
/**
/**
 * This class provides an empty implementation of {@link SCcompisladoresANTLRParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class SCcompisladoresANTLRDefVisitor extends SCcompisladoresANTLRParserBaseVisitor<Set<String>> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitCtrl(SCcompisladoresANTLRParserParser.CtrlContext ctx){
		Set<String> decls =  visit(ctx.decls());
    return decls;
		}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitVoidDecls(SCcompisladoresANTLRParserParser.VoidDeclsContext ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	 public Set<String> visitLetList(SCcompisladoresANTLRParserParser.LetListContext ctx) {
		 Set<String> delclet = visit(ctx.decllet());
		 Set<String> decls = visit(ctx.decls());
		 delclet.addAll(decls);
		 return delclet;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	 public Set<String> visitDispList(SCcompisladoresANTLRParserParser.DispListContext ctx) {
		 Set<String>  decldisp = visit(ctx.decldisp());
     Set<String>  decls = visit(ctx.decls());
     decldisp.addAll(decls);
     return decldisp;
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitDispL(SCcompisladoresANTLRParserParser.DispLContext ctx) {
		Set<String> disp = new HashSet<String>();
		disp.add(ctx.ID().getText());
		return disp;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitLetL(SCcompisladoresANTLRParserParser.LetLContext ctx) {
		Set<String> decllet = new HashSet<String>();
		decllet.add(ctx.ID().getText());
		return decllet;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitDispVi(SCcompisladoresANTLRParserParser.DispViContext ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	public Set<String> visitDelt0p(SCcompisladoresANTLRParserParser.Delt0pContext ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override
	 public Set<String> visitDelt0ppEmpty(SCcompisladoresANTLRParserParser.Delt0ppEmptyContext ctx) {
		 return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt0pp(SCcompisladoresANTLRParserParser.Delt0ppContext ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1(SCcompisladoresANTLRParserParser.Delt1Context ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1p(SCcompisladoresANTLRParserParser.Delt1pContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1ppEmpty(SCcompisladoresANTLRParserParser.Delt1ppEmptyContext ctx) {
		return new HashSet<String>();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt1pp(SCcompisladoresANTLRParserParser.Delt1ppContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2(SCcompisladoresANTLRParserParser.Delt2Context ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2p(SCcompisladoresANTLRParserParser.Delt2pContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2ppEmpty(SCcompisladoresANTLRParserParser.Delt2ppEmptyContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt2pp(SCcompisladoresANTLRParserParser.Delt2ppContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3ID(SCcompisladoresANTLRParserParser.Delt3IDContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3Curl(SCcompisladoresANTLRParserParser.Delt3CurlContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3Brack(SCcompisladoresANTLRParserParser.Delt3BrackContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDelt3Paren(SCcompisladoresANTLRParserParser.Delt3ParenContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitAdd(SCcompisladoresANTLRParserParser.AddContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitSub(SCcompisladoresANTLRParserParser.SubContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr1(SCcompisladoresANTLRParserParser.Expr1Context ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTimes(SCcompisladoresANTLRParserParser.TimesContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDivide(SCcompisladoresANTLRParserParser.DivideContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr2(SCcompisladoresANTLRParserParser.Expr2Context ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitNum(SCcompisladoresANTLRParserParser.NumContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr3(SCcompisladoresANTLRParserParser.Expr3Context ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitAt(SCcompisladoresANTLRParserParser.AtContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitUnderLine(SCcompisladoresANTLRParserParser.UnderLineContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitInput(SCcompisladoresANTLRParserParser.InputContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitListParen(SCcompisladoresANTLRParserParser.ListParenContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitListAng(SCcompisladoresANTLRParserParser.ListAngContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExp0pEmpty(SCcompisladoresANTLRParserParser.Exp0pEmptyContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitExpr(SCcompisladoresANTLRParserParser.ExprContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitPositive(SCcompisladoresANTLRParserParser.PositiveContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitNegative(SCcompisladoresANTLRParserParser.NegativeContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTao1L(SCcompisladoresANTLRParserParser.Tao1LContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTao0pEmpty(SCcompisladoresANTLRParserParser.Tao0pEmptyContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitDots(SCcompisladoresANTLRParserParser.DotsContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTao1Int(SCcompisladoresANTLRParserParser.Tao1IntContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTao1Void(SCcompisladoresANTLRParserParser.Tao1VoidContext ctx) { return new HashSet<String>();  }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Set<String> visitTao1Paren(SCcompisladoresANTLRParserParser.Tao1ParenContext ctx) { return new HashSet<String>();  }
}
