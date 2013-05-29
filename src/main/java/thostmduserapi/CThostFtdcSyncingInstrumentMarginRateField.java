package thostmduserapi;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Array;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * \ufffd\ufffd\ufffd\ufffd\u036c\ufffd\ufffd\ufffd\u0435\u013a\ufffd\u053c\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
 * <i>native declaration : ctpapi/linux/ThostFtdcUserApiStruct.h:1951</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("thostmduserapi") 
public class CThostFtdcSyncingInstrumentMarginRateField extends StructObject {
	/**
	 * \ufffd\ufffd\u053c\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInstrumentIDType
	 */
	@Array({31}) 
	@Field(0) 
	public Pointer<Byte > InstrumentID() {
		return this.io.getPointerField(this, 0);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public byte InvestorRange() {
		return this.io.getByteField(this, 1);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f7\ufffd\u03a7<br>
	 * C type : TThostFtdcInvestorRangeType
	 */
	@Field(1) 
	public CThostFtdcSyncingInstrumentMarginRateField InvestorRange(byte InvestorRange) {
		this.io.setByteField(this, 1, InvestorRange);
		return this;
	}
	/**
	 * \ufffd\ufffd\ufffd\u0379\ufffd\u02fe\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcBrokerIDType
	 */
	@Array({11}) 
	@Field(2) 
	public Pointer<Byte > BrokerID() {
		return this.io.getPointerField(this, 2);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u07f4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcInvestorIDType
	 */
	@Array({13}) 
	@Field(3) 
	public Pointer<Byte > InvestorID() {
		return this.io.getPointerField(this, 3);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4) 
	public byte HedgeFlag() {
		return this.io.getByteField(this, 4);
	}
	/**
	 * \u0376\ufffd\ufffd\ufffd\u05f1\ufffd\ufffd\ufffd\u05be<br>
	 * C type : TThostFtdcHedgeFlagType
	 */
	@Field(4) 
	public CThostFtdcSyncingInstrumentMarginRateField HedgeFlag(byte HedgeFlag) {
		this.io.setByteField(this, 4, HedgeFlag);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public double LongMarginRatioByMoney() {
		return this.io.getDoubleField(this, 5);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(5) 
	public CThostFtdcSyncingInstrumentMarginRateField LongMarginRatioByMoney(double LongMarginRatioByMoney) {
		this.io.setDoubleField(this, 5, LongMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public double LongMarginRatioByVolume() {
		return this.io.getDoubleField(this, 6);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(6) 
	public CThostFtdcSyncingInstrumentMarginRateField LongMarginRatioByVolume(double LongMarginRatioByVolume) {
		this.io.setDoubleField(this, 6, LongMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public double ShortMarginRatioByMoney() {
		return this.io.getDoubleField(this, 7);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcRatioType
	 */
	@Field(7) 
	public CThostFtdcSyncingInstrumentMarginRateField ShortMarginRatioByMoney(double ShortMarginRatioByMoney) {
		this.io.setDoubleField(this, 7, ShortMarginRatioByMoney);
		return this;
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public double ShortMarginRatioByVolume() {
		return this.io.getDoubleField(this, 8);
	}
	/**
	 * \ufffd\ufffd\u0377\ufffd\ufffd\u05a4\ufffd\ufffd\ufffd<br>
	 * C type : TThostFtdcMoneyType
	 */
	@Field(8) 
	public CThostFtdcSyncingInstrumentMarginRateField ShortMarginRatioByVolume(double ShortMarginRatioByVolume) {
		this.io.setDoubleField(this, 8, ShortMarginRatioByVolume);
		return this;
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\ufffd\u053d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0221<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(9) 
	public int IsRelative() {
		return this.io.getIntField(this, 9);
	}
	/**
	 * \ufffd\u01f7\ufffd\ufffd\ufffd\u053d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0221<br>
	 * C type : TThostFtdcBoolType
	 */
	@Field(9) 
	public CThostFtdcSyncingInstrumentMarginRateField IsRelative(int IsRelative) {
		this.io.setIntField(this, 9, IsRelative);
		return this;
	}
	public CThostFtdcSyncingInstrumentMarginRateField() {
		super();
	}
	public CThostFtdcSyncingInstrumentMarginRateField(Pointer pointer) {
		super(pointer);
	}
}
