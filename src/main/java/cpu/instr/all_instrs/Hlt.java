package cpu.instr.all_instrs;

import cpu.CPU_State;
import cpu.instr.decode.Operand;
import cpu.instr.decode.OperandType;

import static kernel.MainEntry.alu;

public class Hlt implements Instruction {
    @Override
    public int exec(int opcode) {
        toBinaryStr("11110100");
        return -1;
    }

    @Override
    public String fetchInstr(String eip, int opcode) {
        return null;
    }

    @Override
    public boolean isIndirectAddressing() {
        return false;
    }

    @Override
    public void fetchOperand() {

    }
}
