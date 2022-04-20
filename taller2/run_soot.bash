set -ex

./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest1 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest2 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest3 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest4 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest5 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest6 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
./soot \
    -cp .:./examples/:$JRE -f J ZeroAnalysisTest7 \
    -v -print-tags -p jtp.DivisionByZeroAnalysis on
