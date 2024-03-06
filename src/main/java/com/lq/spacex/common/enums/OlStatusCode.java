package com.lq.spacex.common.enums;

public enum OlStatusCode {


    /**
     * 是
     */
    YES("000000000001"),
    /**
     * 否
     */
    NO("000000000002"),


    /**
     * 项目类型:自主选择租借物
     */
    INDEPENDENT_CHOICE("700100000001"),
    /**
     * 项目类型:客户选择租借物
     */
    CUSTOMERS_CHOICE("700100000002"),


    /**
     * 租借类型：光租
     */
    BARE_CHARTER("700200000001"),
    /**
     * 租借类型：期租
     */
    TIME_CHARTER("700200000002"),
    /**
     * 租借类型：直租
     */
    DIRECT_FINANCIAL_LEASING("700200000003"),
    /**
     * 租借类型：资产包
     */
    ASSET_PACKAGING("700200000004"),
    /**
     * 租借类型：干租
     */
    DRY_LEASE("700200000005"),
    /**
     * 租借类型：湿租
     */
    WET_LEASE("700200000006"),
    /**
     * 租借类型：购改租
     */
    PURCHASE_TO_RENT("700200000007"),
    /**
     * 租借类型：售后回租
     */
    SALES_AND_LEASEBACK("700200000008"),
    /**
     * 租借类型：再租
     */
    RENT_AGAIN("700200000009"),
    /**
     * 租借类型：资产包采购
     */
    ASSET_PACKAGE_PURCHASE("700200000010"),
    /**
     * 租借类型：资产包卖出
     */
    SELL_ASSETS_PACKAGE("700200000011"),
    /**
     * 租借类型：资产包互换
     */
    ASSET_PACKAGE_SWAP("700200000012"),


    /**
     * 租金增值税率(7003):0%无增值税
     */
    VAT_PERCENT_0("700300000001"),
    /**
     * 租金增值税率(7003):3%
     */
    VAT_PERCENT_3("700300000006"),
    /**
     * 租金增值税率(7003):5%
     */
    VAT_PERCENT_5("700300000002"),
    /**
     * 租金增值税率(7003):6%
     */
    VAT_PERCENT_6("700300000003"),
    /**
     * 租金增值税率(7003):9%
     */
    VAT_PERCENT_9("700300000004"),
    /**
     * 租金增值税率(7003):13%
     */
    VAT_PERCENT_13("700300000005"),


    /**
     * 租期类别(单位):日
     */
    DAY("700400000001"),
    /**
     * 租期类别(单位):月
     */
    MONTH("700400000002"),
    /**
     * 租期类别(单位):年
     */
    YEAR("700400000003"),


    /**
     * 租金摊销方式：直线法
     */
    ACCRUED_TYPE_DIRECT_METHOD("700500000001"),
    /**
     * 租金摊销方式：平均年限法
     */
    ACCRUED_TYPE_COMPOSITE_LIFE_METHOD("700500000002"),
    /**
     * 租金摊销方式：即时确认收入
     */
    ACCRUED_TYPE_CONFIRM_IMMEDIATELY("700500000003"),
    /**
     * 租金摊销方式：按实收当期天数
     */
    ACCRUED_TYPE_RECEIVED_TERM_DAYS("700500000004"),
    /**
     * 每期固定金额差额记预收
     */
    ACCRUED_TYPE_FIX_AMT("700500000005"),


    /**
     * 税金支付方:我方支付
     */
    PAYMENT_BY_US("700600000001"),
    /**
     * 税金支付方:承租人支付
     */
    PAYMENT_BY_LESSEE("700600000002"),
    /**
     * 税金支付方:我方收取并代付
     */
    CHARGED_AND_PAMENT("700600000003"),


    /**
     * 合同状态：草稿
     */
    CONTRACT_STATUS_DRAFT("700700000001"),
    /**
     * 合同状态：已生效
     */
    CONTRACT_STATUS_EXECUTED("700700000002"),
    /**
     * 合同状态：已完结
     */
    CONTRACT_STATUS_FINISHED("700700000003"),
    /**
     * 合同状态:执行中 :700700000004
     */
    CONTRACT_STATUS_EXECUTING("700700000004"),
    /**
     * 合同状态:已完成 :700700000005
     */
    CONTRACT_STATUS_COMPLETE("700700000005"),


    /**
     * 收款类型：租金
     */
    RECEIVE_TYPE_RENT("700800000001"),
    /**
     * 收款类型：保证金
     */
    RECEIVE_TYPE_DEPOSIT("700800000002"),
    /**
     * 收款类型：佣金
     */
    RECEIVE_TYPE_COMMISSION("700800000003"),
    /**
     * 收款类型：费用
     */
    RECEIVE_TYPE_FEE("700800000004"),
    /**
     * 收款类型：罚息
     */
    RECEIVE_TYPE_PENALTY("700800000005"),
    /**
     * 收款类型：维修储备金
     */
    RECEIVE_TYPE_MAINTENANCE_RESERVE("700800000006"),
    /**
     * 收款类型：增值税
     */
    RECEIVE_TYPE_VAT("700800000007"),
    /**
     * 收款类型：内部转移租金 700800000008
     */
    RECEIVE_TYPE_INNER_RENT("700800000008"),


    /**
     * 罚息类型:租金罚息
     */
    RENT_PENALTY("700900000001"),
    /**
     * 罚息类型:租前息罚息
     */
    PENALTY_BEFORE_LEASE("700900000002"),
    /**
     * 罚息类型:费用罚息
     */
    COST_PENALTY("700900000003"),


    /**
     * 收款状态：未收款
     */
    REPAY_STATUS_UNPAID("701000000001"),
    /**
     * 收款状态：部分收款
     */
    REPAY_STATUS_PARTICAL("701000000002"),
    /**
     * 收款状态：完全收款
     */
    REPAY_STATUS_COMPLETE("701000000003"),


    /**
     * 保证金类型:现金
     */
    CASH("701100000001"),
    /**
     * 保证金类型:信用证状态
     */
    NONCASH("701100000002"),


    /**
     * 保证金覆盖内容:主合同保证金
     */
    MASTER_CONTRACT_DEPOSIT("701200000001"),
    /**
     * 保证金覆盖内容:维修储备金保证金(飞机)
     */
    MAINTENANCE_DEPOSIT("701200000002"),
    /**
     * 保证金覆盖内容:其他
     */
    OTHER("701200000003"),


    /**
     * 保证金退还方式：直接退还
     */
    DIRECT_REFUND("701300000001"),
    /**
     * 保证金退还方式：抵扣费用
     */
    DEDUCTION_FEE("701300000002"),
    /**
     * 保证金退还方式：不退还
     */
    REFUSING_RETURNING("701300000003"),


    /**
     * 保证金退还状态：未退还
     */
    DEPOSIT_RETURN_STATUS_NOT_RETURNED("701400000001"),
    /**
     * 保证金退还状态：已退还
     */
    DEPOSIT_RETURN_STATUS_RETURNED("701400000002"),
    /**
     * 保证金退还状态：部分退还
     */
    DEPOSIT_RETURN_STATUS_PARTIAL_RETURNED("701400000003"),


    /**
     * 保证金交易类型：Lessor receives cash deposit from lessee(no invoice created)
     */
    LESSOR_RECEIVES_CASH_DEPOSIT_FROM_LESSEE("701500000001"),
    /**
     * 保证金交易类型：Lessor repays cash deposit on lessee(without credit note)
     */
    LESSOR_REPAYS_CASH_DEPOSIT_ON_LESSEE("701500000002"),
    /**
     * 保证金交易类型：Lessor offset deposit against open invoices
     */
    LESSOR_OFFSET_DEPOSIT_AGAINST_OPEN_INVOICES("701500000003"),
    /**
     * 保证金交易类型：Lessor accrues interest
     */
    LESSOR_ACCRUES_INTEREST("701500000004"),
    /**
     * 保证金交易类型：Lessor repays interest to lessee
     */
    LESSOR_REPAYS_INTEREST_TO_LESSEE("701500000005"),
    /**
     * 保证金交易类型：lessor offset interest against open invoices
     */
    LESSOR_OFFSET_INTEREST_AGAINST_OPEN_INVOICES("701500000006"),
    /**
     * 保证金交易类型：Bail
     */
    BAIL("701500000007"),
    /**
     * 保证金交易类型：Cash collateral account
     */
    CASH_COLLATERAL_ACCOUNT("701500000008"),
    /**
     * 保证金交易类型：Bank guarantee
     */
    BANK_GUARANTEE("701500000009"),
    /**
     * 保证金交易类型：Documentary gredit
     */
    DOCUMENTARY_GREDIT("701500000010"),
    /**
     * 保证金交易类型：Promissory note
     */
    PROMISSORY_NOTE("701500000011"),
    /**
     * 保证金交易类型：Govermmental bonds
     */
    GOVERMMENTAL_BONDS("701500000012"),
    /**
     * 保证金交易类型：Govermmental guarantee
     */
    GOVERMMENTAL_GUARANTEE("701500000013"),
    /**
     * 保证金交易类型：letter of credit
     */
    LETTER_OF_CREDIT("701500000014"),
    /**
     * 保证金交易类型：leter of guarantee
     */
    LETER_OF_GUARANTEE("701500000015"),
    /**
     * 保证金交易类型：standby letter ofcredit
     */
    STANDBY_LETTER_OF_CREDIT("701500000016"),
    /**
     * 保证金交易类型：offset against purchase price
     */
    OFFSET_AGAINST_PURCHASE_PRICE("701500000017"),
    /**
     * 保证金交易类型：payment bond
     */
    PAYMENT_BOND("701500000018"),
    /**
     * 保证金交易类型：shares
     */
    SHARES("701500000019"),
    /**
     * 保证金交易类型：other
     */
    OTHER_DEPOSIT("701500000020"),


    /**
     * 状态(非现金保证金):Active
     */
    ACTIVE("701600000001"),
    /**
     * 状态(非现金保证金):Inactive
     */
    INACTIVE("701600000002"),
    /**
     * 状态(非现金保证金):Pending
     */
    PENDING("701600000003"),


    /**
     * 费用类别:律师费
     */
    LEGAL_FEES("701700000001"),
    /**
     * 费用类别:财务费用
     */
    COST_OF_FINANCING("701700000002"),


    /**
     * 付费方式:一次性支付
     */
    PAY_WAY_ONE_TIME("701800000001"),
    /**
     * 付费方式:分期支付(按周期)
     */
    PAY_WAY_TERMS("701800000002"),


    /**
     * 费用摊销方式：一次性确认
     */
    FEE_ACCRUED_TYPE_ONE_TIME("701900000001"),
    /**
     * 费用摊销方式：直线法摊销
     */
    FEE_ACCRUED_TYPE_DIRECT_LINE("701900000002"),
    /**
     * 费用摊销方式：即时确认
     */
    FEE_ACCRUED_TYPE_IMME("701900000003"),


    /**
     * 产品大类(7020):飞机
     */
    PRODUCT_CATEGORY_AIRCRAFT("702000000001"),
    /**
     * 产品大类(7020):船舶
     */
    PRODUCT_CATEGORY_SHIP("702000000002"),
    /**
     * 产品大类(7020):设备
     */
    PRODUCT_CATEGORY_EUQIPT("702000000003"),
    /**
     * 产品大类(7020):商业物业不动产
     */
    PRODUCT_CATEGORY_REALESTATE("702000000004"),
    /**
     * 产品大类(7020):车辆
     */
    PRODUCT_CATEGORY_VEHICLE("702000000005"),
    /**
     * 产品大类(7020):其他
     */
    PRODUCT_CATEGORY_OTHER("702000000006"),
    /**
     * 产品大类(7020):土地使用权
     */
    PRODUCT_CATEGORY_LAND_RIGHT("702000000007"),

    //TODO 待补充
    /**
     * 产品子类(7021):公务机
     */
    PRODUCT_SUB_CATEGORY_CORPORATE_AIRCRAFT("702100000001"),
    /**
     * 产品子类(7021):商用飞机
     */
    PRODUCT_SUB_CATEGORY_COMMERCIAL_AIRCRAFT("702100000002"),
    /**
     * 产品子类(7021):散货船
     */
    PRODUCT_SUB_CATEGORY_CARGO_SHIP("702100000003"),
    /**
     * 产品子类(7021):集装箱船
     */
    PRODUCT_SUB_CATEGORY_CONTAINER_SHIP("702100000004"),
    /**
     * 产品子类(7021):油轮
     */
    PRODUCT_SUB_CATEGORY_TANKER("702100000005"),
    /**
     * 产品子类(7021):海工船
     */
    PRODUCT_SUB_CATEGORY_MARINE_SHIP("702100000006"),
    /**
     * 产品子类(7021):沥青船
     */
    PRODUCT_SUB_CATEGORY_ASPHALT_SHIP("702100000007"),
    /**
     * 产品子类(7021):壁挂式金融自动终端
     */
    PRODUCT_SUB_CATEGORY_WALL_MOUNTED_FINANCIAL_TERMINAL_AUTOMATICALLY("702100000008"),
    /**
     * 产品子类(7021):穿墙式自动存取款机
     */
    PRODUCT_SUB_CATEGORY_WEAR_A_DIFFERENT_MACHINE_FOR_THE_WALL("702100000009"),
    /**
     * 产品子类(7021):大堂式自动存取款机
     */
    PRODUCT_SUB_CATEGORY_THE_LOBBY_TYPE_AUTOMATIC_DIFFERENT_MACHINE("702100000010"),
    /**
     * 产品子类(7021):商业物业不动产
     */
    PRODUCT_SUB_CATEGORY_COMMERCIAL_REAL_ESTATE_PROPERTY("702100000011"),

    /**
     * 产品子类(7021):集装箱  702100000012
     */
    PRODUCT_SUB_CATEGORY_CONTAINER("702100000012"),
    /**
     * 产品子类(7021):特种船  702100000013
     */
    PRODUCT_SUB_CATEGORY_SPECIAL_SHIP("702100000013"),


    /**
     * 收款单核销状态:未核销（已挂账）
     */
    WRITE_OFF_STATUS_NOT_WRITE_OFF("702200000001"),
    /**
     * 收款单核销状态:部分核销（待摊销）
     */
    WRITE_OFF_STATUS_PARTIAL_WRITE_OFF("702200000002"),
    /**
     * 收款单核销状态:已核销（已销帐）
     */
    WRITE_OFF_STATUS_WRITE_OFF("702200000003"),


    /**
     * 交易明细交易类别(7023)：收到待清算款项
     */
    TRANS_TYPE_UNCONFIRMED_PAYMENT("702300000001"),
    /**
     * 交易明细交易类别(7023)：退不明款项（待清算款项）
     */
    TRANS_TYPE_REFUND_UNKNOWN_AMOUNT("702300000002"),
    /**
     * 交易明细交易类别(7023)：退多收款
     */
    TRANS_TYPE_REFUND_OVER_AMOUNT("702300000003"),
    /**
     * 交易明细交易类别(7023)：核销保证金
     */
    TRANS_TYPE_WRITE_OFF_DEPOSIT("702300000004"),
    /**
     * 交易明细交易类别(7023)：保证金退款
     */
    TRANS_TYPE_DEPOSIT_REFUND("702300000005"),
    /**
     * 交易明细交易类别(7023)：核销租金
     */
    TRANS_TYPE_WRITE_OFF_RENT("702300000006"),
    /**
     * 交易明细交易类别(7023)：核销罚息
     */
    TRANS_TYPE_WRITE_OFF_PENALTY("702300000007"),

    /**
     * 交易明细交易类别(7023)：核销维修储备金
     */
    TRANS_TYPE_WRITE_OFF_MAINTENANCE("702300000008"),

    /**
     * 交易明细交易类别(7023)：租金计提
     */
    TRANS_TYPE_RENT_CALC("702300000009"),

    /**
     * 交易明细交易类别(7023)：核销增值税
     */
    TRANS_TYPE_WRITE_OFF_VAT("702300000010"),

    /**
     * 交易明细交易类别(7023)：内部转移租金核销 702300000011
     */
    TRANS_TYPE_INNER_RENT_WRITE_OFF("702300000011"),

    /**
     * 交易明细交易类别(7023)：收到待清算款项冲账 702300000012
     */
    TRANS_TYPE_UNCONFIRMED_PAYMENT_REV("702300000012"),

    /**
     * 交易明细交易类别(7023)：核销保证金冲账 702300000013
     */
    TRANS_TYPE_WRITE_OFF_DEPOSIT_REV("702300000013"),

    /**
     * 交易明细交易类别(7023)：核销租金冲账 702300000014
     */
    TRANS_TYPE_WRITE_OFF_RENT_REV("702300000014"),

    /**
     * 交易明细交易类别(7023)：核销罚息冲账 702300000015
     */
    TRANS_TYPE_WRITE_OFF_PENALTY_REV("702300000015"),

    /**
     * 交易明细交易类别(7023)：核销维修储备金冲账 702300000016
     */
    TRANS_TYPE_WRITE_OFF_MAINTENANCE_REV("702300000016"),

    /**
     * 交易明细交易类别(7023)：核销增值税冲账 702300000017
     */
    TRANS_TYPE_WRITE_OFF_VAT_REV("702300000017"),

    /**
     * 交易明细交易类别(7023)：内部转移租金核销冲账 702300000023
     */
    TRANS_TYPE_INNER_RENT_WRITE_OFF_REV("702300000023"),

    /**
     * 交易明细交易类别(7023)：租金印花税计提 702300000024
     */
    TRANS_TYPE_STAMP_TAX_CALC("702300000024"),
    /**
     * 交易明细交易类别(7023)：核销费用
     */
    TRANS_TYPE_WRITE_OFF_FEE("702300000025"),
    /**
     * 交易明细交易类别(7023)：核销费用冲账 702300000026
     */
    TRANS_TYPE_WRITE_OFF_FEE_REV("702300000026"),

    /**
     * 交易明细交易类别(7023)：支付采购款 702300000027
     */
    TRANS_TYPE_PAY_AMT("702300000027"),
    /**
     * 交易明细交易类别(7023)：支付采购费用 702300000028
     */
    TRANS_TYPE_PAY_FEE("702300000028"),
    /**
     * 交易明细交易类别(7023)：意向金转投放款 702300000029
     */
    TRANS_TYPE_PAY_DEPOSIT_TO_LOAN("702300000029"),
    /**
     * 交易明细交易类别(7023)：收到意向金退款 702300000030
     */
    TRANS_TYPE_PAY_DEPOSIT_REFUND("702300000030"),
    /**
     * 交易明细交易类别(7023)：意向金注销 702300000031
     */
    TRANS_TYPE_PAY_DEPOSIT_CANCEL("702300000031"),
    /**
     * 交易明细交易类别(7023)：支付意向金 702300000032
     */
    TRANS_TYPE_PAY_DEPOSIT("702300000032"),
    /**
     * 交易明细交易类别(7023)：支付维修储备金 702300000033
     */
    TRANS_TYPE_PAY_MAINTEN_FUND("702300000033"),
    /**
     * 交易明细交易类别(7023)：退还采购款 702300000034
     */
    TRANS_TYPE_REFUND_PAYMENT("702300000034"),
    /**
     * 交易明细交易类别(7023)：收费用摊销 702300000035
     */
    TRANS_TYPE_FEE_CALC("702300000035"),
    /**
     * 交易明细交易类别(7023)：支付租金/转租借租金 702300000036
     */
    TRANS_TYPE_SUBLEASE_PAY_RENT("702300000036"),
    /**
     * 交易明细交易类别(7023)：支付转租借租金冲账 702300000037
     */
    TRANS_TYPE_SUBLEASE_PAY_RENT_REV("702300000037"),
    /**
     * 交易明细交易类别(7023)：支付售后回租保证金 702300000038
     */
    TRANS_TYPE_PAY_SUBLEASE_CASH_DEPOSIT("702300000038"),
    /**
     * 交易明细交易类别(7023)：收回售后回租保证金 702300000039
     */
    TRANS_TYPE_PAYBACK_SUBLEASE_CASH_DEPOSIT("702300000039"),
    /**
     * 交易明细交易类别(7023)：售后回租保证金抵扣租金 702300000040
     */
    TRANS_TYPE_PAYBACK_SUBLEASE_CASH_DEPOSIT_DEDUCT("702300000040"),
    /**
     * 交易明细交易类别(7023)：溢价采购应收款利息计提 702300000041
     */
    TRANS_TYPE_PREMIUM_INTER_CALC("702300000041"),
    /**
     * 交易明细交易类别(7023)：转固定资产 702300000042
     */
    TRANS_TYPE_ASSET_FIX("702300000042"),

    /**
     * 租金计算单位(7024) : 按期
     */
    RENT_CALC_UNIT_TERM("702400000001"),
    /**
     * 租金计算单位(7024) : 按每期实际天数
     */
    RENT_CALC_UNIT_DAYS("702400000002"),
    /**
     * 租金计算单位(7024) : 按指数逐日分段计算
     */
    RENT_CALC_UNIT_INDEX_DAYS("702400000003"),
    /**
     * 租金计算单位(7024) : 按平均指数分段计算
     */
    RENT_CALC_UNIT_INDEX_SUB("702400000004"),
    /**
     * 租金计算单位(7024) : 按指定日指数分段累进计算
     */
    RENT_CALC_UNIT_INDEX_ASSIGN_DAY("702400000005"),
    /**
     * 租金计算单位(7024) : 按指数逐日分段累进计算
     */
    RENT_CALC_UNIT_INDEX_DAYS_PROGRESSIVE("702400000006"),
    /**
     * 租金计算单位(7024) : 按周期按比例调整
     */
    RENT_CALC_UNIT_TERMS_PERCENT("702400000007"),
    /**
     * 租金计算单位(7024) : 按周期按定额调整
     */
    RENT_CALC_UNIT_TERMS_QUOTA("702400000008"),
    /**
     * 租金计算单位(7024) : 按实际天数按周期按比例调整
     */
    RENT_CALC_UNIT_DAYS_TERMS_PERCENT("702400000009"),
    /**
     * 租金计算单位(7024) : 按实际天数按周期按定额调整
     */
    RENT_CALC_UNIT_DAYS_TERMS_QUOTA("702400000010"),


    /**
     * 租金浮动方式(7025) : 固定:702500000001
     */
    RENT_FLOAT_TYPE_FIXED("702500000001"),
    /**
     * 租金浮动方式(7025) : 按指数浮动即时生效:702500000002
     */
    RENT_FLOAT_TYPE_INDEX("702500000002"),
    /**租金浮动方式(7025) : 按固定周期按比例:702500000003
     */
    //RENT_FLOAT_TYPE_TERM_PERCENT("702500000003"),
    /**租金浮动方式(7025) : 按指数按固定周期:702500000004
     */
    //RENT_FLOAT_TYPE_INDEX_TERM("702500000004"),


    /**
     * 租金等值币汇率类型(7026) : 日汇率
     */
    DAY_RATE("702600000001"),
    /**
     * 租金等值币汇率类型(7026) : 月汇率
     */
    MONTH_RATE("702600000002"),
    /**
     * 租金等值币汇率类型(7026) : 季汇率
     */
    SEASON_RATE("702600000003"),
    /**
     * 租金等值币汇率类型(7026) : 年汇率
     */
    YEAR_RATE("702600000004"),
    /**
     * 租金等值币汇率类型(7026) : 外管局/央行汇率中间价
     */
    POBC_RATE("702600000005"),
    /**
     * 租金等值币汇率类型(7026) : 财务汇率
     */
    EAS_RATE("702600000006"),


    /**
     * 分成租金计算方式(7027) : 无
     */
    SPLIT_RENT_CALC_TYPE_NONE("702700000001"),
    /**
     * 按指数逐日分段累进计算(7027)
     */
    SPLIT_RENT_CALC_TYPE_INDEX_DAYS("702700000002"),
    /**
     * 按平均指数分段计算(7027)
     */
    SPLIT_RENT_CALC_TYPE_INDEX_AVG("702700000003"),
    /**
     * 按指定日指数分段计算(7027)
     */
    SPLIT_RENT_CALC_TYPE_INDEX_ASSIGN_DAY("702700000004"),
    /**
     * 按指数逐日分段计算(7027)
     */
    SPLIT_RENT_CALC_TYPE_INDEX_DAYS_SUB("702700000005"),
    /**
     * 按平均指数逐日分段累进计算(7027)
     */
    SPLIT_RENT_CALC_TYPE_INDEX_DAYS_AVG("702700000006"),
    /**
     * 按经营状况不规则分成计算(7027)
     */
    SPLIT_RENT_CALC_TYPE_MANAGE_SPLIT("702700000007"),


    /**
     * 交易类型(7028) : cash
     */
    CASHTYPE("702800000001"),
    /**
     * 交易类型(7028) : EOL
     */
    EOL("702800000002"),
    /**
     * 交易类型(7028) : L/C
     */
    LC("702800000003"),
    /**
     * 交易类型(7028) : cash and L/C
     */
    CASHANDLC("702800000004"),

    /**
     * 业务币种(1170):人民币 117000000010
     */
    BUSI_CURRENCY_RMB("117000000010"),
    /**
     * 业务币种(1170):美元 117000000020
     */
    BUSI_CURRENCY_USD("117000000020"),
    /**
     * 业务币种(1170):欧元 117000000020
     */
    BUSI_CURRENCY_EUR("117000000030"),
    /**
     * 业务币种(1170):港币 117000000020
     */
    BUSI_CURRENCY_HKD("117000000040"),
    /**
     * 业务币种(1170):新加坡元 117000000020
     */
    BUSI_CURRENCY_SGD("117000000090"),
    /**
     * 业务币种(1170):英镑 117000000060
     */
    BUSI_CURRENCY_GBP("117000000060"),
    /**
     * 业务币种(1170):综合币种 117099999999
     */
    BUSI_CURRENCY_NOK("117000000070"),
    /**
     * 业务币种(1170):综合币种 117099999999
     */

    BUSI_CURRENCY_ALL("117099999999"),

    /**
     * 会计科目编号1002.01
     */
    SAP_ACCOUNT_NBR_1002_01("1002.01"),
    /**
     * 会计科目编号1002.02
     */
    SAP_ACCOUNT_NBR_1002_02("1002.02"),
    /**
     * 会计科目编号1002.03
     */
    SAP_ACCOUNT_NBR_1002_03("1002.03"),
    /**
     * 会计科目编号1002.04
     */
    SAP_ACCOUNT_NBR_1002_04("1002.04"),
    /**
     * 会计科目编号1002.05
     */
    SAP_ACCOUNT_NBR_1002_05("1002.05"),


    /**
     * 账户币种(7029) : 人民币
     */
    ACCOUNT_CURRENCY_RMB("702900000001"),
    /**
     * 账户币种(7029) : 美元
     */
    ACCOUNT_CURRENCY_DOLLAR("702900000002"),
    /**
     * 账户币种(7029) : 港元
     */
    ACCOUNT_CURRENCY_HONG_KONG_DOLLAR("702900000003"),
    /**
     * 账户币种(7029) : 欧元
     */
    ACCOUNT_CURRENCY_EURO("702900000004"),
    /**
     * 账户币种(7029) : 新加坡元
     */
    ACCOUNT_CURRENCY_SINGAPORE_DOLLAR("702900000005"),


    /**
     * 代收增值税计算方式(7030) : 根据租金与增值税比例
     */
    VAT_COLLECT_CALC_TYPE_PERCENT("703000000001"),
    /**
     * 代收增值税计算方式(7030) : 单独计算
     */
    VAT_COLLECT_CALC_TYPE__SEPARATELY("703000000002"),


    /**
     * 租金支付日类别 :先付(7031) 703100000001
     */
    RENT_PAY_STYLE_EARLIER("703100000001"),
    /**
     * 租金支付日类别 :后付(7031) 703100000002
     */
    RENT_PAY_STYLE_LATER("703100000002"),


    /**
     * 租金收入科目(7032) : 应收租金 703200000001
     */
    RENT_INCOME_SUBJECT_RECEIVABLE("703200000001"),
    /**
     * 租金收入科目(7032) : 预收收租金 703200000002
     */
    RENT_INCOME_SUBJECT_PREPAID("703200000002"),


    /**
     * 结构化租借类别(7033) : 无 703300000001
     */
    STRUCTURED_TYPE_NONE("703300000001"),
    /**
     * 结构化租借类别(7033) : 法税结构 703200000002
     */
    STRUCTURED_TYPE_FRANCE_TAX("703300000002"),


    /**
     * 租金内部转移计算方式(7034) : 按原始租金比例 703400000001
     */
    INNER_TRANS_RENT_TYPE_PERCENT("703400000001"),
    /**
     * 租金内部转移计算方式(7034) : 按固定金额 703400000002
     */
    INNER_TRANS_RENT_TYPE_FIX_AMT("703400000002"),


    /**
     * 租金内部转移过渡科目(7035) : 待清算 703500000001
     */
    INNER_TRANS_TEMP_SUBJECT_2241("703500000001"),
    /**
     * 租金内部转移过渡科目(7035) : 租金收入 703500000002
     */
    INNER_TRANS_TEMP_SUBJECT_6041("703500000002"),

    /**
     * job启动方式(7036) : 自动启动 703600000001
     */
    JOB_DEFINE_START_MODE_AUTO("703600000001"),
    /**
     * job启动方式(7036) : 手工启动 703600000002
     */
    JOB_DEFINE_START_MODE_MANUAL("703600000002"),

    /**
     * 所属系统类别(7037) : 开发 703700000001
     */
    SYS_TYPE_DEV("703700000001"),
    /**
     * 所属系统类别(7037) : 测试 703700000002
     */
    SYS_TYPE_UAT("703700000002"),
    /**
     * 所属系统类别(7037) : 生产 703700000003
     */
    SYS_TYPE_OA("703700000003"),
    /**
     * 所属系统类别(7037) : 所有 703700000004
     */
    SYS_TYPE_ALL("703700000004"),

    /**
     * 财务处理状态(7038):未传送(703800000001)
     */
    ENTRY_PROCESS_STATUS_NOT_SEND("703800000001"),
    /**
     * 财务处理状态(7038):已传送(703800000002)
     */
    ENTRY_PROCESS_STATUS_SENDED("703800000002"),
    /**
     * 财务处理状态(7038):EAS处理成功(703800000003)
     */
    ENTRY_PROCESS_STATUS_EAS_SUCCESS("703800000003"),
    /**
     * 财务处理状态(7038):EAS处理失败(703800000004)
     */
    ENTRY_PROCESS_STATUS_EAS_FAIL("703800000004"),

    /**
     * 发票盖章状态(7039):未盖章(703900000001)
     */
    INVOICE_NOT_SEALED("703900000001"),
    /**
     * 发票盖章状态(7039):盖章中(703900000002)
     */
    INVOICE_IS_SEALING("703900000002"),
    /**
     * 发票盖章状态(7039):已盖章(703900000003)
     */
    INVOICE_IS_SEALED("703900000003"),

    /**
     * 支付周期类别(7040):一次性(704000000001)
     */
    TYPE_OF_LENDING_ONE_TIME("704000000001"),
    /**
     * 支付周期类别(7040):周期性(704000000002)
     */
    TYPE_OF_LENDING_TERM("704000000002"),

    /**
     * 付款类别(7041):进度款(704100000001)
     */
    PAY_TYPE_OF_PROGRESS_PAYMENT("704100000001"),
    /**
     * 付款类别(7041):费用(704100000002)
     */
    PAY_TYPE_OF_FEE_PAYMENT("704100000002"),
    /**
     * 付款类别(7041):意向金(704100000003)
     */
    PAY_TYPE_OF_DEPOSIT_PAYMENT("704100000003"),

    /**
     * 支付状态(7042):未支付(704200000001)
     */
    PAY_STATUS_NOT_PAY("704200000001"),
    /**
     * 支付状态(7042):部分支付(704200000002)
     */
    PAY_STATUS_PARTIAL_PAY("704200000002"),
    /**
     * 支付状态(7042):已支付(704200000003)
     */
    PAY_STATUS_ALREADY_PAY("704200000003"),


    /**
     * 费用类型(7043):SPV费用(704300000001)
     */
    FEE_TYPE_SPV("704300000001"),
    /**
     * 费用类型((7043):保险费(704300000002)
     */
    FEE_TYPE_INSURANCE("704300000002"),
    /**
     * 费用类型(7043):评估费(704300000003)
     */
    FEE_TYPE_ASSESSMENT("704300000003"),
    /**
     * 费用类型(7043):登记费(704300000004)
     */
    FEE_TYPE_REGISTRATION("704300000004"),
    /**
     * 费用类型(7043):第三方差旅费(704300000005)
     */
    FEE_TYPE_THIRD_PARTY_TRAVEL("704300000005"),
    /**
     * 费用类型(7043):第三方工资(704300000006)
     */
    FEE_TYPE_THIRD_PARTY_WAGES("704300000006"),
    /**
     * 费用类型(7043):律师费(704300000007)
     */
    FEE_TYPE_ATTORNEY("704300000007"),
    /**
     * 费用类型(7043):诉讼费(704300000008)
     */
    FEE_TYPE_LEGAL("704300000008"),
    /**
     * 费用类型(7043):代理费(704300000009)
     */
    FEE_TYPE_AGENCY("704300000009"),
    /**
     * 费用类型(7043):佣金(704300000010)
     */
    FEE_TYPE_COMMISSION("704300000010"),
    /**
     * 费用类型(7043):船舶管理费(704300000011)
     */
    FEE_TYPE_SHIP_MANAGEMENT("704300000011"),
    /**
     * 费用类型(7043):监理费(704300000012)
     */
    FEE_TYPE_SUPERVISION("704300000012"),
    /**
     * 费用类型(7043):备品备件费(704300000013)
     */
    FEE_TYPE_SPARE_PARTS("704300000013"),
    /**
     * 费用类型(7043):融资安排费(704300000014)
     */
    FEE_TYPE_FINANCING_FACILITY("704300000014"),
    /**
     * 费用类型(7043):咨询费(704300000015)
     */
    FEE_TYPE_CONSULTING("704300000015"),
    /**
     * 费用类型(7043):审计费(704300000016)
     */
    FEE_TYPE_AUDIT("704300000016"),
    /**
     * 费用类型(7043):飞机检查费(704300000017)
     */
    FEE_TYPE_AIRCRAFT_INSPECTION("704300000017"),
    /**
     * 费用类型(7043):飞机改装费(704300000018)
     */
    FEE_TYPE_AIRCRAFT_MODIFICATION("704300000018"),
    /**
     * 费用类型(7043):报关费用(704300000019)
     */
    FEE_TYPE_CUSTOMS_CLEARANCE("704300000019"),
    /**
     * 费用类型(7043):飞机转入或转出代理费(704300000020)
     */
    FEE_TYPE_AGENCY_FOR_INWARD_OR_OUTWARD_FLIGHT("704300000020"),
    /**
     * 费用类型(7043):调机费(704300000021)
     */
    FEE_TYPE_MACHINE("704300000021"),
    /**
     * 费用类型(7043):燃油费(704300000022)
     */
    FEE_TYPE_FUEL_SURCHARGE("704300000022"),
    /**
     * 费用类型(7043):托管费(704300000023)
     */
    FEE_TYPE_CUSTODY("704300000023"),
    /**
     * 费用类型(7043):航线费用(704300000024)
     */
    FEE_TYPE_COURSE("704300000024"),
    /**
     * 费用类型(7043):其他(704300000025)
     */
    FEE_TYPE_OTHER("704300000025"),
    /**
     * 费用类型(7043):财务费用(704300000026)
     */
    FEE_TYPE_FIN("704300000026"),

    /**
     * 摊销周期(7044):资产全生命周期(704400000001)
     */
    ACCRUED_TERM_TYPE_FULL_LIFE_CYCLE_OF_ASSET("704400000001"),
    /**
     * 摊销周期(7044):当前租借期(704400000002)
     */
    ACCRUED_TERM_TYPE_CURRENT_LEASE_TERM("704400000002"),
    /**
     * 摊销周期(7044):剩余租借期(704400000003)
     */
    ACCRUED_TERM_TYPE_REMAINING_LEASE("704400000003"),

    /**
     * 指数修正方式(7045):自然日(704500000001)
     */
    TCE_ADJUST_TYPE_NATURAL_DAY("704500000001"),
    /**
     * 指数修正方式(7045):工作日(704500000002)
     */
    TCE_ADJUST_TYPE_WORK_DAY("704500000002"),

    /**
     * 租金分类(7046):保底租金(704600000001)
     */
    RENT_STYLE_GUARANTEED("704600000001"),
    /**
     * 租金分类(7046):分成租金(704600000002)
     */
    RENT_STYLE_TCE("704600000002"),

    /**
     * 付款节点(7047):合同生效(704700000001)
     */
    PAY_NODE_CONTRACT_EFFECT("704700000001"),
    /**
     * 付款节点(7047):上线(704700000002)
     */
    PAY_NODE_ONLINE("704700000002"),
    /**
     * 付款节点(7047):下线(704700000003)
     */
    PAY_NODE_OFFLINE("704700000003"),
    /**
     * 付款节点(7047):交付(704700000004)
     */
    PAY_NODE_DELIVERS("704700000004"),
    /**
     * 付款节点(7047):开工(704700000005)
     */
    PAY_NODE_STARTS_CONSTRUCTION("704700000005"),
    /**
     * 付款节点(7047):上船台(704700000006)
     */
    PAY_NODE_SHIP_BERTH("704700000006"),
    /**
     * 付款节点(7047):下水(704700000007)
     */
    PAY_NODE_IN_THE_WATER("704700000007"),
    /**
     * 付款节点(7047):试航(704700000008)
     */
    PAY_NODE_THE_TRIAL("704700000008"),
    /**
     * 付款节点(7047):取得国土证(704700000009)
     */
    PAY_NODE_OBTAIN_LAND_CERTIFICATE("704700000009"),
    /**
     * 付款节点(7047):项目前期策划(704700000010)
     */
    PAY_NODE_PREPROJECT_PLANNING("704700000010"),
    /**
     * 付款节点(7047):项目报批(704700000011)
     */
    PAY_NODE_PROJECT_SUBMISSION_AND_APPROVAL("704700000011"),
    /**
     * 付款节点(7047):竣工验收(704700000012)
     */
    PAY_NODE_COMPLETION_ACCEPTANCE("704700000012"),
    /**
     * 付款节点(7047):开盘(704700000013)
     */
    PAY_NODE_EARLY_MORNING("704700000013"),
    /**
     * 付款节点(7047):其他(704700000014)
     */
    PAY_NODE_OTHER("704700000014"),

    /**
     * 模板文件类型(7048):飞机(704800000001)
     */
    TEMPLATE_FILE_TYPE_INVOICE_MODEL_PLANE("704800000001"),
    /**
     * 模板文件类型(7048):不动产(704800000002)
     */
    TEMPLATE_FILE_TYPE_INVOICE_MODE_ESTATE("704800000002"),
    /**
     * 模板文件类型(7048):放款审批书(704800000003)
     */
    TEMPLATE_FILE_TYPE_LOAN_APPROVAL("704800000003"),
    /**
     * 模板文件类型(7048):付款通知书(704800000004)
     */
    TEMPLATE_FILE_TYPE_NOTICE_FILE("704800000004"),
    /**
     * 模板文件类型(7048):付款计划模板(704800000005)
     */
    TEMPLATE_FILE_TYPE_PLANRENT_FILE("704800000005"),
    /**
     * 模板文件类型(7048):项目商用机审批书模板(704800000006)
     */
    TEMPLATE_FILE_TYPE_PROJECT_BUSINESS("704800000006"),
    /**
     * 模板文件类型(7048):项目船舶审批书模板(704800000007)
     */
    TEMPLATE_FILE_TYPE_PROJECT_SHIP("704800000007"),
    /**
     * 模板文件类型(7048):付款通知书投行业务部(704800000008)
     */
    TEMPLATE_FILE_TYPE_NOTICE_FILE_IBD("704800000008"),
    /**
     * 模板文件类型(7048):发票租金模板(704800000009)
     */
    TEMPLATE_FILE_TYPE_INVOICE("704800000009"),
    /**
     * 模板文件类型(7048):生成租金发票(704800000010)
     */
    TEMPLATE_FILE_TYPE_INVOICE_FILE("704800000010"),
    /**
     * 模板文件类型(7048):合同通知书(704800000011)
     */
    TEMPLATE_FILE_TYPE_CONTRACT_FILE("704800000011"),
    /**
     * 模板文件类型(7048):立项预审外币(704800000012)
     */
    TEMPLATE_FILE_TYPE_PRETRIAL_FORGEIN_FILE("704800000012"),
    /**
     * 模板文件类型(7048):立项预审人民币(704800000013)
     */
    TEMPLATE_FILE_TYPE_PRETRIAL_RMB_FILE("704800000013"),
    /**
     * 模板文件类型(7048):项目评审商用机(704800000014)
     */
    TEMPLATE_FILE_TYPE_PROJECT_BUSINESS_FILE("704800000014"),
    /**
     * 模板文件类型(7048):项目评审船舶(704800000015)
     */
    TEMPLATE_FILE_TYPE_PROJECT_SHIP_FILE("704800000015"),
    /**
     * 模板文件类型(7048):业务事项签报审批(704800000015)
     */
    TEMPLATE_FILE_TYPE_BUSINESS_APPROVE_FILE("704800000016"),
    /**
     * 模板文件类型(7048):业务事项签报审批(704800000017)
     */
    TEMPLATE_FILE_TYPE_BUSINESS_APPROVE_OTHER("704800000017"),

    /**
     * 支付方式(7049):转账(704900000001)
     */
    PAY_WAY_TRANSFER_ACCOUNTS("704900000001"),
    /**
     * 支付方式(7049):电汇(704900000002)
     */
    PAY_WAY_TELEGRAPHIC_TRANSFER("704900000002"),
    /**
     * 支付方式(7049):汇票(704900000003)
     */
    PAY_WAY_DRAFT("704900000003"),
    /**
     * 支付方式(7049):其他(704900000004)
     */
    PAY_WAY_OTHER("704900000004"),

    /**
     * 审批状态(7050):草稿(705000000001)
     */
    APPROVE_STATUS_DRAFT("705000000001"),
    /**
     * 审批状态(7050):流程中(705000000002)
     */
    APPROVE_STATUS_PROCESSING("705000000002"),
    /**
     * 审批状态(7050):待计财确认(705000000003)
     */
    FINANCIAL_AFFAIRS_CONFIRM("705000000003"),
    /**
     * 审批状态(7050):驳回(705000000004)
     */
    APPROVE_STATUS_REJECT("705000000004"),
    /**
     * 审批状态(7050):审批完成(705000000005)
     */
    APPROVE_COMPLETION("705000000005"),

    /**
     * 资产转固类型(7051):资本化利息(705100000001)
     */
    FIX_ASSET_TYPE_CAPLIZ_INTER("705100000001"),
    /**
     * 资产转固类型(7051):投放款(705100000002)
     */
    FIX_ASSET_TYPE_LOAN("705100000002"),
    /**
     * 资产转固类型(7051):费用(705100000003)
     */
    FIX_ASSET_TYPE_FEE("705100000003"),


    /**
     * 系统分类(7052):产品大类(705200000001)
     */
    SYS_CATEGORY_PRODUCT("705200000001"),
    /**
     * 系统分类(7052):产品子类(705200000002)
     */
    SYS_CATEGORY_SUB_PRODUCT("705200000002"),

    /**
     * 保底租金计算方式(7053):一次性计算(705300000001)
     */
    BASE_RENT_CALC_TYPE_ONE_CALC("705300000001"),
    /**
     * 保底租金计算方式(7053):按指数分段计算(705200000002)
     */
    BASE_RENT_CALC_TYPE_TERMS_OF_EXPONENTS("705300000002"),

    /**
     * 凭证状态(7054):未处理(705400000001)
     */
    FIN_RENTAL_VOUCHER_STATUS_UN_HANDLE("705400000001"),
    /**
     * 凭证状态(7054):处理中(705400000002)
     */
    FIN_RENTAL_VOUCHER_STATUS_NOW_HANDLE("705400000002"),
    /**
     * 凭证状态(7054):处理成功(705400000003)
     */
    FIN_RENTAL_VOUCHER_STATUS_SUCCESS_HANDLE("705400000003"),
    /**
     * 凭证状态(7054):处理失败(705400000004)
     */
    FIN_RENTAL_VOUCHER_STATUS_FAILED_HANDLE("705400000004"),

    /**
     * 通知类型(7055):指数租借发票付款通知及租金明细(705500000001)
     */
    NOTE_TYPE_INVOICE_RENTAL_DETAILS("705500000001"),
    /**
     * 通知类型(7055):租金明细(705500000002)
     */
    NOTE_TYPE_RENTAL_DETAILS("705500000002"),
    /**
     * 通知类型(7055):发票与付款通知(705500000003)
     */
    NOTE_TYPE_INVOICE_PAY_ADVICE("705500000003"),
    /**
     * 通知类型(7055)租金核销短信通知(705500000004)
     */
    NOTE_TYPE_INVOICE_WRITE_MESSAGE("705500000004"),
    /**
     * 通知类型(7055):租金核销邮件通知(705500000005)
     */
    NOTE_TYPE_WRITE_EMAIL("705500000005"),


    /**
     * 收付方向(7056):付(705600000001)
     */
    RECEIVE_PAY_DIRECTION_PAY("705600000001"),
    /**
     * 收付方向(7056):收(705600000002)
     */
    RECEIVE_PAY_DIRECTION_RECEIVE("705600000002"),


    /**
     * 投放款其他款项财务处理方式(7057):合并至投放款(705700000001)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_PAYMENT("705700000001"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至费用支出-其他手续费(705700000002)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_FEE_PAY("705700000002"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至租金收入(705700000003)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_INCOME("705700000003"),
    /**
     * 投放款其他款项财务处理方式(7057):应付款挂账(705700000004)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ON_CREDIT("705700000004"),
    /**
     * 投放款其他款项财务处理方式(7057):确认为手续费收入(705700000005)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_FEE_INCOME("705700000005"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至固定资产(705700000006)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET("705700000006"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本02(飞机使用费/船舶其他/设备其他)(705700000007)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST02("705700000007"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至其他业务成本-卖断-经营租借(705700000008)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_OTHER_COST("705700000008"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本03(商业物业土地摊销/飞机机供品)(705700000009)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST03("705700000009"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本04(商业物业物业管理费/飞机税费)(705700000010)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST04("705700000010"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本05(商业物业房产税/飞机管理费)(705700000011)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST05("705700000011"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本06(商业物业保险费)(705700000012)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST06("705700000012"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本07(商业物业土地使用税)(705700000013)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST07("705700000013"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本08(商业物业杂项)(705700000014)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST08("705700000014"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本09(商业物业副调基金)(705700000015)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST09("705700000015"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本12(飞机使用费(增值税17%)/船舶其他(增值税17%)/设备其他(增值税17%))(705700000016)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST12("705700000016"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本13(商业物业土地摊销(增值税5%)/飞机机供品(增值税17%))(705700000017)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST13("705700000017"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本14(商业物业物业管理费(增值税5%))(705700000018)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST14("705700000018"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本15(飞机管理费(增值税17%))(705700000019)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST15("705700000019"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本16(商业物业保险费(增值税5%))(705700000020)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST16("705700000020"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本18(商业物业杂项(增值税5%))(705700000021)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST18("705700000021"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本23(商业物业土地摊销(增值税11%))(705700000022)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST23("705700000022"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本24(商业物业物业管理费(增值税11%))(705700000023)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST24("705700000023"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本26(商业物业保险费(增值税11%))(705700000024)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST26("705700000024"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至经营租借固定资产成本28(商业物业杂项(增值税11%))(705700000025)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_ASSET_COST28("705700000025"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至费用支出-租借项下手续费(705700000026)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_FEE_PAY_LESSEE("705700000026"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至费用支出-金融机构手续费(705700000027)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_FEE_PAY_ORG("705700000027"),
    /**
     * 投放款其他款项财务处理方式(7057):合并至费用支出-律师费(705700000028)
     */
    OTHER_PAY_ITEM_VOUCHER_TO_FEE_PAY_LAW("705700000028"),


    /**
     * 节假日指数取数方式(7058):取上一工作日指数值(705800000001)
     */
    HOLIDAY_PROCESS_METHOD_PREVIOUS_WORKING_DAY("705800000001"),
    /**
     * 节假日指数取数方式(7058):跳过节假日(705800000002)
     */
    HOLIDAY_PROCESS_METHOD_SKIP_HOLIDAYS("705800000002"),

    /**
     * 保证金会计科目_2203(705900000001)
     */
    CASH_DEPOSIT_SUBJECT_CODE_2203("705900000001"),
    /**
     * 保证金会计科目_2241.03(705900000002)
     */
    CASH_DEPOSIT_SUBJECT_CODE_2241_03("705900000002"),
    /**
     * 保证金会计科目_2701.01(705900000003)
     */
    CASH_DEPOSIT_SUBJECT_CODE_2701_01("705900000003"),
    /**
     * 保证金会计科目_2241.04(705900000004)
     */
    CASH_DEPOSIT_SUBJECT_CODE_2241_04("705900000004"),
    /**
     * 保证金会计科目_1122.01(705900000005)
     */
    CASH_DEPOSIT_SUBJECT_CODE_1122_01("705900000005"),
    /**
     * 保证金会计科目_2203.12(705900000006)
     */
    CASH_DEPOSIT_SUBJECT_CODE_2203_12("705900000006"),
    /**
     * 保证金会计科目_2203.03(705900000007)
     */
    CASH_DEPOSIT_SUBJECT_CODE_2203_03("705900000007"),

    /**
     * 付款申请类别_投放款及费用(706000000001)
     */
    PAYMENT_APPROVAL_TYPE_LOAN("706000000001"),
    /**
     * 付款申请类别_支付转租借租金(706000000002)
     */
    PAYMENT_APPROVAL_TYPE_RENT_PAY("706000000002"),

    /**
     * 应付款挂账销帐类别_收款核销(706100000001)
     */
    PAYMENT_ON_CREDIT_REV_TYPE_RECEIVE("706100000001"),
    /**
     * 应付款挂账销帐类别_支付抵扣(706100000002)
     */
    PAYMENT_ON_CREDIT_REV_TYPE_PAY("706100000002"),
    /**
     * 应付款挂账销帐类别_摊销(706100000003)
     */
    PAYMENT_ON_CREDIT_REV_TYPE_ACCRUED("706100000003"),


    /**
     * 核算项类别_融资租借承租人
     */
    VOUCHER_ITEM_TYPE_LESSEE_FL("KyoAAAAAA3MF0s0M"),
    /**
     * 核算项类别_租借合同号
     */
    VOUCHER_ITEM_TYPE_CONTRACT_NO("KyoAAAAAA3cF0s0M"),
    /**
     * 核算项类别_项目名称
     */
    VOUCHER_ITEM_TYPE_PROJECT_NAME("KyoAAAAAA4IF0s0M"),
    /**
     * 核算项类别_银行
     */
    VOUCHER_ITEM_TYPE_BANK("KyoAAAAAA4YF0s0M"),
    /**
     * 核算项类别_分支机构
     */
    VOUCHER_ITEM_TYPE_BRANCH("KyoAAAAAA4oF0s0M"),
    /**
     * 核算项类别_经营租借客户
     */
    VOUCHER_ITEM_TYPE_LESSEE_OL("KyoAAAAAA3UF0s0M"),
    /**
     * 核算项类别_供应商
     */
    VOUCHER_ITEM_TYPE_SUPPLYER("KyoAAAAAA3oF0s0M"),
    /**
     * 核算项类别_往来
     */
    VOUCHER_ITEM_TYPE_INNER("KyoAAAAAA34F0s0M"),
    /**
     * 核算项类别_城市
     */
    VOUCHER_ITEM_TYPE_CITY("KyoAAAAAA4gF0s0M"),
    /**
     * 核算项类别_账号
     */
    VOUCHER_ITEM_TYPE_ACCOUNT("KyoAAAAAA4wF0s0M"),
    /**
     * 核算项类别_代理商
     */
    VOUCHER_ITEM_TYPE_AGENT("KyoAAAAAA3wF0s0M"),
    /**
     * 核算项类别_渠道
     */
    VOUCHER_ITEM_TYPE_CHANNEL("KyoAAAAAA4AF0s0M"),
    /**
     * 核算项类别_费用性质
     */
    VOUCHER_ITEM_TYPE_FEE_NATURE("KyoAAAAAA4QF0s0M"),
    /**
     * 核算项类别_存款性质
     */
    VOUCHER_ITEM_TYPE_DEPOSIT_NATURE("KyoAAAAAA44F0s0M"),

    /**
     * 业务类别_融资租借(112000000010)
     */
    FINANCING_LEASE_CONTRACT("112000000010"),
    /**
     * 业务类别_经营租借(112000000020)
     */
    OPERATING_LEASE_CONTRACT("112000000020"),
    /**
     * 业务类别_厂商租借(112000000030)
     */
    VENDOR_LEASING_CONTRACT("112000000030"),

    /**
     * 支付类型_费用(706200000001)
     */
    PAY_STYLE_ONE_FEE("706200000001"),
    /**
     * 支付类型_投放款(706200000002)
     */
    PAY_STYLE_ONE_LOAN("706200000002"),
    /**
     * 支付类型_支付转租借租金(706200000005)
     */
    PAY_STYLE_RENTAL_PAYRENT_APPLE("706200000005"),

    /**
     * 授信终审人类型_事业部风险总监706200000001)
     */
    DIVISIONAL_RISK("706300000001"),
    /**
     * 授信终审人类型_首席风险官(706200000002)
     */
    CHIEF_RISK("706300000002"),
    /**
     * 授信终审人类型_事业部总裁(706200000003)
     */
    DIVISION_PRESIDENT("706300000003"),
    /**
     * 授信终审人类型_公司总裁(706200000004)
     */
    COMPANY_PRESIDENT("706300000004"),
    /**
     * 授信终审人类型_事业部分管领导(706200000005)
     */
    RESPONSIBLE_LEADERSHIP("706300000005"),

    /**
     * 租金支付方式_月度先付(706400000001)
     */
    MONTHLY_PREPAYMENT("706400000001"),
    /**
     * 租金支付方式_月度后付(706400000002)
     */
    MONTHLY_PAYMENT("706400000002"),
    /**
     * 租金支付方式_季度先付(706400000003)
     */
    QUARTERLY_ADVANCE("706400000003"),
    /**
     * 租金支付方式_季度后付(706400000004)
     */
    QUARTER_AFTER_PAYMENT("706400000004"),

    /**
     * 立项类型_人民币(706500000001)
     */
    CREDIT_TYPE_RMB("706500000001"),
    /**
     * 立项类型_外币(706500000002)
     */
    CREDIT_TYPE_FOREIGN("706500000002"),

    /**
     * 序列号的类型率(706600000001)
     */
    SERIAL_TYPE_RISKNAR("706600000001"),

    /**
     * 租入业务类型_租入办公场所(706700000001)
     */
    LEASE_BUSI_TYPE_OFFICE("706700000001"),
    /**
     * 租入业务类型_经营租借转租借资产(706700000001)
     */
    LEASE_BUSI_TYPE_OLTOLEASE("706700000002"),

    /**
     * 信用证状态_未开立(706800000001)
     */
    LC_STATUS_NOT_OPEN("706800000001"),
    /**
     * 信用证状态_已开立未提款(706800000002)
     */
    LC_STATUS_OPEN_AND_UNDRAWN("706800000002"),
    /**
     * 信用证状态_已提款(706800000003)
     */
    LC_STATUS_TYPE_BEEN_DRAWING("706800000003"),
    /**
     * 信用证状态_已失效或完结(706800000004 )
     */
    LC_STATUS_EXPIRED_OR_ENDED("706800000004"),

    /**
     * 密级_无(706900000001)
     */
    SECURITY_CLASS_NO("706900000001"),
    /**
     * 密级_秘密(706900000002)
     */
    SECURITY_CLASS_SECRET("706900000002"),
    /**
     * 密级_机密(706900000003)
     */
    SECURITY_CLASS_ESOTERIC("706900000003"),
    /**
     * 密级_绝密(706900000004)
     */
    SECURITY_CLASS_STRICTLY_PRIVATE("706900000004"),

    /**
     * 缓急_一般(707000000001)
     */
    PRIORITIES_GENERAL("707000000001"),
    /**
     * 缓急_急(707000000002)
     */
    PRIORITIES_EMERGENCY("707000000002"),


    /**
     * 结构化类别_东疆模式(商飞)(707200000001)
     */
    STRUCTURED_TYPE_EASTMODE_COMAC("707200000001"),
    /**
     * 结构化类别_东疆模式(船舶)(707000000002)
     */
    STRUCTURED_TYPE_EASTMODE_SHIP("707200000002"),
    /**
     * 结构化类别_东疆模式(船舶)(707000000003)
     */
    STRUCTURED_TYPE_TAXMODE("707200000003"),

    /**
     * 所属区域EMEA(707300000001)
     */
    OWNREGION_EMEA("707300000001"),
    OWNREGION_AMERICA("707300000002"),
    OWNREGION_NORTHEAST_ASIA("707300000003"),
    OWNREGION_SOUTHEAST_ASIA("707300000004"),


    END_FLAG("");

    private String code;

    private OlStatusCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static OlStatusCode getValue(String code) {
        OlStatusCode[] values = OlStatusCode.values();
        for (OlStatusCode value : values) {
            if (value.getCode().equals(code)) {
                return value;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return this.code;
    }
}