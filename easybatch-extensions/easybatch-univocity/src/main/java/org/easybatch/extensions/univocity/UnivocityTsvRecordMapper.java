/**
 * The MIT License
 *
 *   Copyright (c) 2017, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package org.easybatch.extensions.univocity;

import com.univocity.parsers.common.AbstractParser;
import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

/**
 * A record mapper that uses <a href="http://www.univocity.com/">uniVocity parsers</a> to map TSV records
 * to domain objects.
 *
 * @author Anthony Bruno (anthony.bruno196@gmail.com)
 */
public class UnivocityTsvRecordMapper<T> extends AbstractUnivocityRecordMapper<T, TsvParserSettings> {

    /**
     * Create a new {@link UnivocityTsvRecordMapper}.
     *
     * @param recordClass the target type
     * @param settings    the settings that is is used to configure the parser
     */
    public UnivocityTsvRecordMapper(Class<T> recordClass, TsvParserSettings settings) {
        super(recordClass, settings);
    }

    @Override
    protected AbstractParser<TsvParserSettings> getParser() {
        return new TsvParser(settings);
    }
}
