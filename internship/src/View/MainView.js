import React, { Component, Fragment } from 'react';
import HeaderView from './HeaderView';
import ControlView from './ControlView';
import FlowChartView from './FlowChartView';

class MainView extends Component {
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

export default MainView;