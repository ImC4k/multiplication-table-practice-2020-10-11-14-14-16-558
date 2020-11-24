package com.tw;

public class MultiplicationTable {
    /**
     * Plan 1min
     * Do   1min
     * Check
     * Act
     * @param startNumber
     * @param endNumber
     * @return
     */
    public String create(int startNumber, int endNumber) {
        if (!isValid(startNumber, endNumber)) return null;
        else return generateMultiplicationTable(startNumber, endNumber);
    }


    /**
     * Plan 1min
     * Do   1min
     * Check
     * Act
     * @param startNumber
     * @param endNumber
     * @return
     */
    private boolean isValid(int startNumber, int endNumber) {
        boolean startIsInRange = isNumberInRange(startNumber);
        boolean endIsInRange = isNumberInRange(endNumber);
        boolean startIsLessOrEqualToEnd = isLessOrEqual(startNumber, endNumber);
        return startIsInRange && endIsInRange && startIsLessOrEqualToEnd;
    }

    /**
     * Plan 1min
     * Do   1min
     * Check
     * Act
     * @param startNumber
     * @param endNumber
     * @return
     */
    private boolean isLessOrEqual(int startNumber, int endNumber) {
        return startNumber <= endNumber;
    }


    /**
     * Plan 1min
     * Do   1min
     * Check
     * Act
     * @param number
     * @return
     */
    private boolean isNumberInRange(int number) {
        final int LOWER_BOUND = 1;
        final int UPPER_BOUND = 1000;

        return LOWER_BOUND <= number && number <= UPPER_BOUND;
    }

    /**
     * Plan 3min
     * Do   14min
     * Check complicated logic
     * Act  more logic practices
     * @param startNumber
     * @param endNumber
     * @return table in string
     */
    private String generateMultiplicationTable(int startNumber, int endNumber) {
        String table = "";
        for (int multiplicand = startNumber; multiplicand < endNumber; ++multiplicand) {
            table += generateMultiplicationLine(startNumber, multiplicand) + "\r\n";
        }
        table += generateMultiplicationLine(startNumber, endNumber);
        return table;
    }

    /**
     * Plan     3min
     * Do       3min
     * Check
     * Act
     * @param startNumber
     * @param multiplicand
     * @return
     */
    private String generateMultiplicationLine(int startNumber, int multiplicand) {
        String line = "";
        for (int multiplier = startNumber; multiplier <= multiplicand - 1; ++multiplier) {
            line += generateMultiplicationExpression(multiplier, multiplicand) + "  ";
        }
        line += generateMultiplicationExpression(multiplicand, multiplicand);
        return line;
    }

    /**
     * Plan 1min
     * Do   2min
     * Check    unfamiliar with String format
     * Act  practice more with String.format
     * @param multiplier
     * @param multiplicand
     * @return
     */
    private String generateMultiplicationExpression(int multiplier, int multiplicand) {
        return String.format("%d*%d=%d", multiplier, multiplicand, multiplier * multiplicand);
    }
}