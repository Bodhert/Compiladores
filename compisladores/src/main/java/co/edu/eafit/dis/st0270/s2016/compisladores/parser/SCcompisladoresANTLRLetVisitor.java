// Generated from SCcompisladoresANTLRParser.g4 by ANTLR 4.5.3
package co.edu.eafit.dis.st0270.s2016.compisladores.parser;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
// import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.HashSet;
import java.util.Set;
import org.antlr.v4.runtime.misc.NotNull;
import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

/**
/**
 * This class provides an empty implementation of {@link SCcompisladoresANTLRParserVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class SCcompisladoresANTLRLetVisitor extends SCcompisladoresANTLRParserBaseVisitor<Set<String>> {

  Set<String> declared;
  Set<String> used;
  public SCcompisladoresANTLRLetVisitor(Set<String> variables){
    declared = variables;
    used = new HashSet<String>();
  }

  public Set<String> getDeclared(){
    return declared;
  }

  public Set<String> getUsed(){
    return used;
  }

  @Override
  public Set<String> visitCtrl(SCcompisladoresANTLRParserParser.CtrlContext ctx){
    Set<String> delcs =  visit(ctx.decls());
    Set<String> disp = visit(ctx.disp());
    used.addAll(delcs);
    used.addAll(disp);
    return declared;
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
    return new HashSet<String>(); // no se si este esta bueno
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitLetL(SCcompisladoresANTLRParserParser.LetLContext ctx) {

    String id =  ctx.ID().getText();
    Set<String> var = visit(ctx.disp());
    Set<String> defined =  new HashSet<String>();

    if(declared.containsAll(var)) declared.add(id);
    else baddefined.add(id);

    return var;
  }

  Set<String> baddefined = new HashSet<String>();
  public Set<String> getBadvariables(){
    return baddefined;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDispVi(SCcompisladoresANTLRParserParser.DispViContext ctx) {
    Set<String> disp1 = visit(ctx.disp1());
    Set<String> disp0pp = visit(ctx.disp0pp());
    disp1.addAll(disp0pp);
    return disp1;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt0p(SCcompisladoresANTLRParserParser.Delt0pContext ctx) {
    Set<String> disp1 = visit(ctx.disp1());
    Set<String> disp0pp = visit(ctx.disp0pp());
    disp1.addAll(disp0pp);
    return disp1;
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
  @Override
  public Set<String> visitDelt0pp(SCcompisladoresANTLRParserParser.Delt0ppContext ctx) {
    Set<String> disp0p = visit(ctx.disp0p());
    return disp0p;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt1(SCcompisladoresANTLRParserParser.Delt1Context ctx) {
    Set<String> disp2 = visit(ctx.disp2());
    Set<String> disp1pp = visit(ctx.disp1pp());
    disp2.addAll(disp1pp);
    return disp2;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public Set<String> visitDelt1p(SCcompisladoresANTLRParserParser.Delt1pContext ctx) {
    Set<String> disp2 = visit(ctx.disp2());
    Set<String> disp1pp = visit(ctx.disp1pp());
    disp2.addAll(disp1pp);
    return disp2;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt1ppEmpty(SCcompisladoresANTLRParserParser.Delt1ppEmptyContext ctx) {
    return new HashSet<String>();
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt1pp(SCcompisladoresANTLRParserParser.Delt1ppContext ctx) {
    Set<String> disp1p = visit(ctx.disp1p());
    return disp1p;
    }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override public Set<String> visitDelt2(SCcompisladoresANTLRParserParser.Delt2Context ctx){
    Set<String> disp3 = visit(ctx.disp3()) ;
    Set<String> disp2pp = visit(ctx.disp2pp());
    disp3.addAll(disp2pp);
    return disp3;
   }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt2p(SCcompisladoresANTLRParserParser.Delt2pContext ctx) {
    Set<String> disp3 = visit(ctx.disp3()) ;
    Set<String> disp2pp = visit(ctx.disp2pp());
    disp3.addAll(disp2pp);
    return disp3;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt2ppEmpty(SCcompisladoresANTLRParserParser.Delt2ppEmptyContext ctx) {
    return new HashSet<String>();
   }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt2pp(SCcompisladoresANTLRParserParser.Delt2ppContext ctx) {
    Set<String> disp2p = visit(ctx.disp2p());
    return disp2p;
   }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt3ID(SCcompisladoresANTLRParserParser.Delt3IDContext ctx) {
    Set<String> setId = new HashSet<String>();
    String id = ctx.ID().getText();
    setId.add(id);
    if(!(declared.contains(id))) baddefined.add(id);

    return setId;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
   public Set<String> visitDelt3Curl(SCcompisladoresANTLRParserParser.Delt3CurlContext ctx){
     Set<String> id =  visit(ctx.disp());
     return id;
    }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt3Brack(SCcompisladoresANTLRParserParser.Delt3BrackContext ctx) {
    Set<String> expr = visit(ctx.exp());
    return expr;
   }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitDelt3Paren(SCcompisladoresANTLRParserParser.Delt3ParenContext ctx) {
    Set<String> disp = new HashSet<String>();
    List<SCcompisladoresANTLRParserParser.DispContext> list = ctx.disp();

    for(SCcompisladoresANTLRParserParser.DispContext t: list){
      Set<String> aux = visit(t);
      disp.addAll(aux);
    }

    return disp;
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitAdd(SCcompisladoresANTLRParserParser.AddContext ctx) {
    return new HashSet<String>();
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling
   * {@link #visitChildren} on {@code ctx}.</p>
   */
  @Override
  public Set<String> visitSub(SCcompisladoresANTLRParserParser.SubContext ctx) {
    return new HashSet<String>();
  }
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
