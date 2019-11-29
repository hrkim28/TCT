import * as types from './ActionTypes';
/*********************************** Event Handler Action ***********************************/
export const onChangeSteelGrd = (value) => ({
    type: types.STEEL_GRD,
    payload: value
})

export const onChangeQualityTest = () => ({
    type: types.QUALITY_TEST
})

export const onChangeRefine = (value) => ({
    type: types.REFINE_RES,
    payload: value
});

/********************************************************************************************/
/*********************************** Store 상태변화 Action ***********************************/
export const steelMaking = () => ({
    type: types.STEEL_MAKING
});

export const castingCut = () => ({
    type: types.CASTING_CUT
})

export const cutting1st = () => ({
    type: types.CUTTING_1ST
})

export const cutting2nd = () => ({
    type: types.CUTTING_2ND
})

export const correction = () => ({
    type: types.CORRECTION
})

export const scrap = () => ({
    type: types.SCRAP
})

export const charging = () => ({
    type: types.CHARGING
})

export const onChangePercent = (value) => ({
    type: types.PERCENT,
    payload: value
})

export const isSuccess = (value) => ({
    type: types.IS_SUCCESS,
    payload: value
})

export const restart = () => ({
    type: types.RESTART
});

/********************************************************************************************/

/************************************** 공정진행 Logic **************************************/

export const progressAsync = (searchParam) => dispatch => {

    let time = 2000;

    time = progressSteelMaking(dispatch,time);

    time =progressRefineResTest(searchParam,dispatch,time);
    
    time =progressCastingCut(dispatch,time);

    time =progress2ndCutting(searchParam,dispatch,time);

    time =progressCorrection(dispatch,time);
    
    progressIsSuccess(searchParam,dispatch,time);
}

/**
 * 제강공정과정을 진행하는 Method
 * @param {*} dispatch 
 * @param {*} time 
 */
function progressSteelMaking(dispatch,time) {
    setTimeout(() => { dispatch(steelMaking()) }, time);
    setTimeout(() => { dispatch(onChangePercent(10)) }, time);
    return time;
}

/**
 * 2차정련 결과값을 가지고 재가공 여부 판단하는 Method
 * @param {*} searchParam 
 * @param {*} dispatch 
 * @param {*} time 
 */
function progressRefineResTest(searchParam,dispatch,time) {
    if (searchParam.refinedRes < 3) {
        time += 1000;
        setTimeout(() => { alert("부적합판정") }, time);
        time += 5000;
        setTimeout(() => { dispatch(steelMaking()) }, time);
        setTimeout(() => { dispatch(onChangePercent(0)) }, time);
        time += 2000;
        setTimeout(() => { dispatch(steelMaking()) }, time);
        setTimeout(() => { dispatch(onChangePercent(10)) }, time);
    }
    return time;
}

/**
 * 주조전단 과정을 진행하는 Method
 * @param {*} dispatch 
 * @param {*} time 
 */
function progressCastingCut(dispatch,time) {
    time += 2000;
    setTimeout(() => { dispatch(castingCut()) }, time);
    setTimeout(() => { dispatch(onChangePercent(45)) }, time);
    time += 2000;
    setTimeout(() => { dispatch(cutting1st()) }, time);
    setTimeout(() => { dispatch(onChangePercent(55)) }, time);
    return time;
}

/**
 * 2차전단 여부를 결정하는 Method
 * @param {*} dispatch 
 * @param {*} time 
 */
function progress2ndCutting(searchParam,dispatch,time) {
    if (searchParam.steelGrd === 'T') {
        time += 2000;
        setTimeout(() => { dispatch(cutting2nd()) }, time);
        setTimeout(() => { dispatch(onChangePercent(65)) }, time);
    }
    return time;
}

/**
 * 정정공정을 진행하는 Method
 * @param {*} dispatch 
 * @param {*} time 
 */
function progressCorrection(dispatch,time) {
    time += 2000;
    setTimeout(() => { dispatch(correction()) }, time);
    setTimeout(() => { dispatch(onChangePercent(80)) }, time);
    return time;
}

/**
 * 공정의 성공여부를 결정하는 Method
 * @param {*} searchParam 
 * @param {*} dispatch 
 * @param {*} time 
 */
function progressIsSuccess(searchParam,dispatch,time) {
    if (searchParam.qualityRes === true) {
        time += 2000;
        setTimeout(() => { dispatch(charging()) }, time);
        setTimeout(() => { dispatch(isSuccess(true)) }, time);
    } else {
        time += 2000;
        setTimeout(() => { dispatch(scrap()) }, time);
        setTimeout(() => { dispatch(isSuccess(false)) }, time);
    }
    setTimeout(() => { dispatch(onChangePercent(100)) }, time);
}
/********************************************************************************************/