/*
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.ui.contentassist

import org.eclipse.xtext.Keyword
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class MASLProposalProvider extends AbstractMASLProposalProvider {
	
	override completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		// 'builtin' should never be used by users, so we don't propose it
		if(keyword.value != 'builtin')
			super.completeKeyword(keyword, contentAssistContext, acceptor)
	}
	
}