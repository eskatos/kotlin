/*
 * Copyright 2010-2017 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/boxInline/callableReference")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class CallableReferenceInlineTestsGenerated extends AbstractCallableReferenceInlineTests {
    public void testAllFilesPresentInCallableReference() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/callableReference"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
    }

    @TestMetadata("classLevel.kt")
    public void testClassLevel() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/classLevel.kt");
        doTest(fileName);
    }

    @TestMetadata("classLevel2.kt")
    public void testClassLevel2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/classLevel2.kt");
        doTest(fileName);
    }

    @TestMetadata("constructor.kt")
    public void testConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/constructor.kt");
        doTest(fileName);
    }

    @TestMetadata("intrinsic.kt")
    public void testIntrinsic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/intrinsic.kt");
        doTest(fileName);
    }

    @TestMetadata("kt15449.kt")
    public void testKt15449() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/kt15449.kt");
        doTest(fileName);
    }

    @TestMetadata("kt16411.kt")
    public void testKt16411() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/kt16411.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyIntrinsic.kt")
    public void testPropertyIntrinsic() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/propertyIntrinsic.kt");
        doTest(fileName);
    }

    @TestMetadata("propertyReference.kt")
    public void testPropertyReference() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/propertyReference.kt");
        doTest(fileName);
    }

    @TestMetadata("topLevel.kt")
    public void testTopLevel() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/topLevel.kt");
        doTest(fileName);
    }

    @TestMetadata("topLevelExtension.kt")
    public void testTopLevelExtension() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/topLevelExtension.kt");
        doTest(fileName);
    }

    @TestMetadata("topLevelProperty.kt")
    public void testTopLevelProperty() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/topLevelProperty.kt");
        doTest(fileName);
    }

    @TestMetadata("compiler/testData/codegen/boxInline/callableReference/bound")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class Bound extends AbstractCallableReferenceInlineTests {
        public void testAllFilesPresentInBound() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/boxInline/callableReference/bound"), Pattern.compile("^(.+)\\.kt$"), TargetBackend.JS, true);
        }

        @TestMetadata("classProperty.kt")
        public void testClassProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/classProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("expression.kt")
        public void testExpression() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/expression.kt");
            doTest(fileName);
        }

        @TestMetadata("extensionReceiver.kt")
        public void testExtensionReceiver() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/extensionReceiver.kt");
            doTest(fileName);
        }

        @TestMetadata("filter.kt")
        public void testFilter() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/filter.kt");
            doTest(fileName);
        }

        @TestMetadata("intrinsic.kt")
        public void testIntrinsic() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/intrinsic.kt");
            doTest(fileName);
        }

        @TestMetadata("map.kt")
        public void testMap() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/map.kt");
            doTest(fileName);
        }

        @TestMetadata("mixed.kt")
        public void testMixed() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/mixed.kt");
            doTest(fileName);
        }

        @TestMetadata("objectProperty.kt")
        public void testObjectProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/objectProperty.kt");
            doTest(fileName);
        }

        @TestMetadata("propertyImportedFromObject.kt")
        public void testPropertyImportedFromObject() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/propertyImportedFromObject.kt");
            doTest(fileName);
        }

        @TestMetadata("simple.kt")
        public void testSimple() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/simple.kt");
            doTest(fileName);
        }

        @TestMetadata("topLevelExtensionProperty.kt")
        public void testTopLevelExtensionProperty() throws Exception {
            String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/boxInline/callableReference/bound/topLevelExtensionProperty.kt");
            doTest(fileName);
        }
    }
}
