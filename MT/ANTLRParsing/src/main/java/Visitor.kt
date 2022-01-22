import org.antlr.v4.runtime.Token
import org.antlr.v4.runtime.tree.TerminalNode


class Visitor : GrammarBaseVisitor<Unit>() {
    private val stringBuilder = StringBuilder()

    private val tab = "    "

    private var indent = 0

    fun getCode(): String {
        return stringBuilder.toString()
    }

    private fun nextLine(offset: Int) {
        indent += offset
        stringBuilder.append("\n")
        stringBuilder.append(tab.repeat(0.coerceAtLeast(indent)))
    }

    override fun visitTerminal(node: TerminalNode) {
        if (node.symbol.type != Token.EOF) {
            stringBuilder.append(node.text)
        }
    }

    override fun visitExpressionListAss1(ctx: GrammarParser.ExpressionListAss1Context?) {
        visit(ctx?.args)
        stringBuilder.append(", ")
        visit(ctx?.expr)
    }

    override fun visitMulOperation(ctx: GrammarParser.MulOperationContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.exp2)
    }

    override fun visitAddOperation(ctx: GrammarParser.AddOperationContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.exp2)
    }

    override fun visitRelOperation(ctx: GrammarParser.RelOperationContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.exp2)
    }

    override fun visitEqualityOperation(ctx: GrammarParser.EqualityOperationContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.exp2)
    }

    override fun visitAndOperation(ctx: GrammarParser.AndOperationContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.ex2)
    }

    override fun visitOrOperation(ctx: GrammarParser.OrOperationContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.exp2)
    }

    override fun visitExpressionListAss(ctx: GrammarParser.ExpressionListAssContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(" ").append(ctx?.op?.text).append(" ")
        visit(ctx?.exp2)
    }


    override fun visitDeclaration(ctx: GrammarParser.DeclarationContext?) {
        visit(ctx?.t)
        stringBuilder.append(" ")
        visit(ctx?.decl)
        stringBuilder.append(";")
    }

    override fun visitInitDeclEq(ctx: GrammarParser.InitDeclEqContext?) {
        visit(ctx?.e1)
        stringBuilder.append(" = ")
        visit(ctx?.e2)
    }

    override fun visitArgsComma(ctx: GrammarParser.ArgsCommaContext?) {
        visit(ctx?.exp1)
        stringBuilder.append(", ")
        visit(ctx?.exp2)
    }

    override fun visitArgDeclaration(ctx: GrammarParser.ArgDeclarationContext?) {
        visit(ctx?.t)
        stringBuilder.append(" ").append(ctx?.argName?.text)
    }

    override fun visitCodeBlock(ctx: GrammarParser.CodeBlockContext?) {
        nextLine(0)
        stringBuilder.append("{")
        if (ctx?.scopedCode != null) {
            nextLine(1)
            visit(ctx.scopedCode)
            nextLine(-1)
        }
        stringBuilder.append("}")

    }

    override fun visitCaseBlock(ctx: GrammarParser.CaseBlockContext?) {
        stringBuilder.append(ctx?.name?.text + " ")
        if (ctx?.exp != null) {
            visit(ctx.exp)
        }
        stringBuilder.append(":")
        if (ctx?.scopedCode != null) {
            nextLine(1)
            visit(ctx.scopedCode)
            if (ctx.name?.text == "default") {
                indent -= 1
            }
            nextLine(-1)
        }
        if (ctx?.stat != null) {
            visit(ctx.stat)
        }
    }

    override fun visitSwitchBlock(ctx: GrammarParser.SwitchBlockContext?) {
        stringBuilder.append("switch (")
        visit(ctx?.condition)
        stringBuilder.append(") ")
        visit(ctx?.switchCode)
    }

    override fun visitBlockItemListN(ctx: GrammarParser.BlockItemListNContext?) {
        visit(ctx?.list)
        if (!ctx?.list?.ignore!!) {
            nextLine(0)
        }
        visit(ctx.item)
    }

    override fun visitCaseStatement(ctx: GrammarParser.CaseStatementContext?) {
        nextLine(0)
        stringBuilder.append("{")
        if (ctx?.code != null) {
            nextLine(1)
            ctx.code?.ignore = true
            visit(ctx.code)
            indent +=1
        }
        stringBuilder.append("}")
        indent -= 1
    }

    override fun visitIfBlock(statement: GrammarParser.IfBlockContext?) {
        stringBuilder.append("if (")
        visit(statement?.condition)
        stringBuilder.append(") ")
        statement?.ifCode?.ignore = true
        visit(statement?.ifCode)
        if (statement?.elseCode != null) {
            stringBuilder.append(" else ")
            statement.elseCode.ignore = true
            visit(statement.elseCode)
        }
    }

    override fun visitIterationBlock(ctx: GrammarParser.IterationBlockContext?) {
        stringBuilder.append(ctx?.name?.text)
        if (ctx?.name?.text != "do") {
            stringBuilder.append(" (")
            visit(if (ctx?.e1 != null) ctx.e1 else ctx?.forCond) // If null then for statement
            stringBuilder.append(") ")
            ctx?.code?.ignore = true
            visit(ctx?.code)
        } else {
            stringBuilder.append(" ")
            visit(ctx.code)
            stringBuilder.append(" while (")
            visit(ctx.e1)
            stringBuilder.append(")")
        }
    }

    override fun visitForCondition(ctx: GrammarParser.ForConditionContext) {
        if (ctx.d != null || ctx.assignExpr != null) {
            visit(if (ctx.d != null) ctx.d else ctx.assignExpr)
        }
        stringBuilder.append(";").append(if (ctx.e1 != null) " " else "")
        if (ctx.e1 != null) {
            visit(ctx.e1)
        }
        stringBuilder.append(";").append(if (ctx.e2 != null) " " else "")
        if (ctx.e2 != null) {
            visit(ctx.e2)
        }
    }

    override fun visitForDeclaration(ctx: GrammarParser.ForDeclarationContext) {
        visit(ctx.t)
        stringBuilder.append(" ")
        visit(ctx.initDecl)
    }


    override fun visitForExpr1(ctx: GrammarParser.ForExpr1Context) {
        visit(ctx.forExprList)
        stringBuilder.append(", ")
        visit(ctx.assignExpr)
    }

    override fun visitJumpReturn(ctx: GrammarParser.JumpReturnContext) {
        stringBuilder.append("return")
        if (ctx.returnValue != null) {
            stringBuilder.append(" ")
            visit(ctx.returnValue)
        }
        stringBuilder.append(";")
    }

    override fun visitFunction(function: GrammarParser.FunctionContext) {
        visit(function.returnType)
        stringBuilder.append(" ")
        visit(function.definition)
        stringBuilder.append(" ")
        visit(function.code)
        nextLine(0)
        nextLine(0)
    }

    override fun visitExprEmpty(ctx: GrammarParser.ExprEmptyContext?) {
    }
}