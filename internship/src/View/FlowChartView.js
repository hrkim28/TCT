import React, { Component } from 'react';
import { Segment, Progress } from 'semantic-ui-react'
import { SteelMakingView, CastingCutView, Cutting1stView, Cutting2ndView, CorrectionView, ChargingView, ScrapView } from './FlowChart';
import './FlowChartView.css';
import FlowChartModel from '../Model/FlowChartModel';

class FlowChartView extends Component {

    constructor(props) {
        super(props);
        this.state = {
            interval: null
        }
    }

    componentDidMount() {
        new FlowChartModel().drawLine(this.refs.canvas);
    }

    componentWillUpdate(nextProps, nextState) {
        new FlowChartModel().drawLine(this.refs.canvas);
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
            const ctx = this.refs.canvas.getContext("2d");
            ctx.clearRect(0, 0, this.refs.canvas.width, this.refs.canvas.height);
            new FlowChartModel().drawLine(this.refs.canvas);
            new FlowChartModel().animatedLine(this.refs.canvas, this.props.result)
    }

    render() {
        return (
            <div className="FlowChartSegment">
                <Segment compact raised>
                    <Segment.Inline className="SegmentInline">
                        <canvas ref="canvas" width={1800} height={500} />
                        <SteelMakingView steelMaking={this.props.steelMaking} />
                        <CastingCutView castingCut={this.props.castingCut} />
                        <Cutting1stView cutting1st={this.props.cutting1st} />
                        <Cutting2ndView cutting2nd={this.props.cutting2nd} />
                        <CorrectionView correction={this.props.correction} />
                        <ChargingView charging={this.props.charging} />
                        <ScrapView scrap={this.props.scrap} />
                        {
                            this.props.result.isSuccess === true ?
                                <Progress percent={this.props.result.percent} indicating progress='percent'>
                                    {this.props.result.percent === 100 ? "정상처리 되었습니다." : ""}
                                </Progress>
                                :
                                <Progress percent={this.props.result.percent} indicating error progress='percent'>
                                    {this.props.result.percent === 100 ? "품질불량으로 Scrap처리 되었습니다." : ""}
                                </Progress>
                        }
                    </Segment.Inline>
                </Segment>
            </div>
        );
    }
}

export default FlowChartView;