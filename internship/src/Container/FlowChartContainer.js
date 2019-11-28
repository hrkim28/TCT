import MainView from '../View/MainView';
import * as actions from '../Action/Action';
import { connect } from 'react-redux';

const mapStateToProps = (state) => ({
    process: state.process,
    percent: state.percent
});

const mapDispatchToProps = (dispatch) => ({
    onProgress: () => dispatch(actions.progressAsync()),
    onIncrement: () => dispatch(actions.incrementAsync()),
    onRestart: () => dispatch(actions.restart())
});

const FlowChartContainer = connect(
    mapStateToProps,
    mapDispatchToProps
)(MainView);

export default FlowChartContainer;