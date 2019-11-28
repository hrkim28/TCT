import * as types from '../Action/ActionTypes';

//상태값 초기화
const initialState = {
    process: 0, // 공정 단계
    percent: 0 // 공정 진행 Percent
}

//Reducer
export default function reducer(state = initialState, action) {
    switch (action.type) {
        case types.PROGRESS:
            return {
                ...state,
                process: state.process + 1
            };

        case types.INCREMENT:
            return {
                ...state,
                percent: state.percent + 5
            };

        case types.RESTART:
            return initialState;

        default:
            return state;
    }
}