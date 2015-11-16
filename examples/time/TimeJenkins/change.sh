#!/bin/bash
find . -type f -exec sed -i 's/\"extern\.gumtree\.io\.TreeDifferencerEnum\"/\"de\.fau\.cs\.inf2\.tree\.evaluation\.TreeMatcherTypeEnum\"/g' {} +;
find . -type f -exec sed -i 's/\"extern\.gumtree\.io\.DiffSummary\"/\"de\.fau\.cs\.inf2\.tree\.evaluation\.DiffSummary\"/g' {} +;
find . -type f -exec sed -i 's/\"extern\.gumtree\.io\.TimeSummary\"/\"de\.fau\.cs\.inf2\.tree\.evaluation\.TimeSummary\"/g' {} +;




find . -type f -exec sed -i 's/\"CD1\"/\"CD_A\"/g' {} +;
find . -type f -exec sed -i 's/\"CD2\"/\"CD_B\"/g' {} +;
find . -type f -exec sed -i 's/\"CD3\"/\"CD_CDE\"/g' {} +;
find . -type f -exec sed -i 's/\"CD12\"/\"CD_AB\"/g' {} +;
find . -type f -exec sed -i 's/\"CD13\"/\"CD_ACDE\"/g' {} +;
find . -type f -exec sed -i 's/\"CD23\"/\"CD_BCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"CD123\"/\"CD_ABCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE\"/\"GT\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE1\"/\"GT_A\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE2\"/\"GT_B\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE3\"/\"GT_CDE\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE12\"/\"GT_AB\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE13\"/\"GT_ACDE\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE23\"/\"GT_BCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"GUMTREE123\"/\"GT_ABCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED1\"/\"RTED_A\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED2\"/\"RTED_B\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED3\"/\"RTED_CDE\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED12\"/\"RTED_AB\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED13\"/\"RTED_ACDE\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED23\"/\"RTED_BCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"RTED123\"/\"RTED_ABCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC1\"/\"JSYNC_A\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC2\"/\"JSYNC_B\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC3\"/\"JSYNC_CDE\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC12\"/\"JSYNC_AB\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC13\"/\"JSYNC_ACDE\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC23\"/\"JSYNC_BCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"JSYNC123\"/\"JSYNC_ABCDE\"/g' {} +;
find . -type f -exec sed -i 's/\"SIFE\"/\"CD_OPT\"/g' {} +;
find . -type f -exec sed -i 's/\"SIFEJSYNC\"/\"CD_OPT_JSYNCAST\"/g' {} +;
find . -type f -exec sed -i 's/\"SIFECD\"/\"CD_OPT_CDAST\"/g' {} +;

