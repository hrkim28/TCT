import MainView from '../View/MainView';
import * as actions from '../Action/Action';
import { connect } from 'react-redux';

const mapStateToProps = (state) => ({
    searchParam: state.searchParam,
    steelMaking: state.steelMaking,
    castingCut: state.castingCut,
    cutting1st: state.cutting1st,
    cutting2nd: state.cutting2nd,
    scrap: state.scrap,
    correction: state.correction,
    charging: state.charging,
    result: state.result,
});

const mapDispatchToProps = (dispatch) => ({
    onChangeSteelGrd: (value) => dispatch(actions.onChangeSteelGrd(value)),
    onChangeQualityTest: () => dispatch(actions.onChangeQualityTest()),
    onChangeRefine: (value) => dispatch(actions.onChangeRefine(value)),
    onProgress: (searchParam) => dispatch(actions.progressAsync(searchParam)),
    onRestart: () => dispatch(actions.restart())
});

const FlowChartContainer = connect(
    mapStateToProps,
    mapDispatchToProps
)(MainView);

export default FlowChartContainer;