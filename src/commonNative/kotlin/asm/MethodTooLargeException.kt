// ASM: a very small and fast Java bytecode manipulation framework
// Copyright (c) 2000-2011 INRIA, France Telecom
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions
// are met:
// 1. Redistributions of source code must retain the above copyright
//    notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above copyright
//    notice, this list of conditions and the following disclaimer in the
//    documentation and/or other materials provided with the distribution.
// 3. Neither the name of the copyright holders nor the names of its
//    contributors may be used to endorse or promote products derived from
//    this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
// AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
// IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
// ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
// LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
// CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
// SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
// INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
// THE POSSIBILITY OF SUCH DAMAGE.
package org.objectweb.asm

/**
 * Exception thrown when the Code attribute of a method produced by a [ClassWriter] is too
 * large.
 *
 * @author Jason Zaugg
 */
class MethodTooLargeException
/**
 * Constructs a new [MethodTooLargeException].
 *
 * @param className the internal name of the owner class.
 * @param methodName the name of the method.
 * @param descriptor the descriptor of the method.
 * @param codeSize the size of the method's Code attribute, in bytes.
 */(
        val className: String?,
        val methodName: String?,
        val descriptor: String?,
        val codeSize: Int) : IndexOutOfBoundsException("Method too large: $className.$methodName $descriptor") {
    /**
     * Returns the internal name of the owner class.
     *
     * @return the internal name of the owner class.
     */
    /**
     * Returns the name of the method.
     *
     * @return the name of the method.
     */
    /**
     * Returns the descriptor of the method.
     *
     * @return the descriptor of the method.
     */
    /**
     * Returns the size of the method's Code attribute, in bytes.
     *
     * @return the size of the method's Code attribute, in bytes.
     */

    companion object {
        private const val serialVersionUID = 6807380416709738314L
    }

}