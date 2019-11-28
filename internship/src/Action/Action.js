import * as types from './ActionTypes';

//Action Function
export const progress = () => ({
    type: types.PROGRESS
});

export const increment = () => ({
    type : types.INCREMENT
});

export const restart = () => ({
    type: types.RESTART
});

export const progressAsync = () => dispatch => {
    let time = 2000;
    for (let i = 1; i <= 4; i++) {
        setTimeout(() => { dispatch(progress()) }, time);
        time += 2000;
    }
}

export const incrementAsync = () => dispatch => {
    let time = 400;
    for (let i = 1; i <= 20; i++) {
        setTimeout(() => { dispatch(increment()) }, time);
        time += 400;
    }
}
