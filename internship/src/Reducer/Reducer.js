import * as types from '../Action/ActionTypes';

/**
 * @param searchParam Input Parameter
 * @param steelMaking 제강
 * @param castingCut 주조전단
 * @param cutting1st 1차전단
 * @param cutting2nd 2차전단
 * @param scrap 스크랩
 * @param correction 정정
 * @param charging 장입
 * @param result 전체 공정 진행도 및 성공여부
 */
const initialState = {
    searchParam: {
        steelGrd: '',
        refinedRes: 0,
        qualityRes: true,
    },
    steelMaking: {
        result: false,
    },
    castingCut: {
        result: false,
    },
    cutting1st: {
        result: false,
    },
    cutting2nd: {
        result: false,
    },
    scrap: {
        result: false,
    },
    correction: {
        result: false,
    },
    charging: {
        result: false,
    },
    result: {
        percent: 0,
        isSuccess: true
    }
}

export default function reducer(state = initialState, action) {
    switch (action.type) {

        case types.STEEL_GRD:
            return {
                ...state,
                searchParam: {
                    ...state.searchParam,
                    steelGrd: action.payload
                }
            }

        case types.QUALITY_TEST:
            return {
                ...state,
                searchParam: {
                    ...state.searchParam,
                    qualityRes: !state.searchParam.qualityRes
                }
            }

        case types.REFINE_RES:
            return {
                ...state,
                searchParam: {
                    ...state.searchParam,
                    refinedRes: action.payload
                }
            };

        case types.STEEL_MAKING:
            return {
                ...state,
                steelMaking: {
                    result: !state.steelMaking.result
                }
            }

        case types.CASTING_CUT:
            return {
                ...state,
                castingCut: {
                    result: !state.castingCut.result
                }
            }

        case types.CUTTING_1ST:
            return {
                ...state,
                cutting1st: {
                    result: !state.cutting1st.result
                }
            }

        case types.CUTTING_2ND:
            return {
                ...state,
                cutting2nd: {
                    result: !state.cutting2nd.result
                }
            }

        case types.CORRECTION:
            return {
                ...state,
                correction: {
                    result: !state.correction.result
                }
            }

        case types.SCRAP:
            return {
                ...state,
                scrap: {
                    result: !state.scrap.result
                }
            }

        case types.CHARGING:
            return {
                ...state,
                charging: {
                    result: !state.charging.result
                }
            }
        case types.PERCENT:
            return {
                ...state,
                result: {
                    ...state.result,
                    percent: action.payload
                }
            }

        case types.IS_SUCCESS:
            return {
                ...state,
                result: {
                    ...state.result,
                    isSuccess: action.payload
                }
            }

        case types.RESTART:
            return initialState;

        default:
            return state;
    }
}
