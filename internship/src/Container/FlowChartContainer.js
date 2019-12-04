import React, { Component, Fragment } from 'react';
import { connect } from 'react-redux';
import * as actions from '../Action/Action';
import { HeaderView, ControlView, FlowChartView } from '../View';


class FlowChartContainer extends Component {

    render() {
        return (
            <Fragment>
                <HeaderView />
                <ControlView
                    searchParam={this.props.searchParam}
                    onChangeSteelGrd={this.props.onChangeSteelGrd}
                    onChangeQualityTest={this.props.onChangeQualityTest}
                    onChangeRefine={this.props.onChangeRefine}
                    onProgress={this.props.onProgress}
                    onIncrement={this.props.onIncrement}
                    onRestart={this.props.onRestart} />
                <FlowChartView
                    steelMaking={this.props.steelMaking}
                    castingCut={this.props.castingCut}
                    cutting1st={this.props.cutting1st}
                    cutting2nd={this.props.cutting2nd}
                    scrap={this.props.scrap}
                    correction={this.props.correction}
                    charging={this.props.charging}
                    result={this.props.result}
                />
            </Fragment>
        );
    }
}

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

export default FlowChartContainer = connect(
    mapStateToProps,
    mapDispatchToProps
)(FlowChartContainer);