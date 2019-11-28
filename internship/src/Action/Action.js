import * as types from './ActionTypes';

//Action Function
export const progress = () => ({
    type: types.PROGRESS
});

export const restart = () => ({
    type: types.RESTART
});

export const ProgressAsync = () => dispatch => {
    let time = 2000;
    for (let i = 1; i <= 4; i++) {
        setTimeout(() => { dispatch(progress()) }, time);
        time += 2000;
    }
}