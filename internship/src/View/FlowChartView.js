import React, { Component } from 'react';
import { Segment, Progress } from 'semantic-ui-react'
import { SteelMakingView, CastingCutView, Cutting1stView, Cutting2ndView, CorrectionView, ChargingView, ScrapView } from './FlowChart';
import PortalView from './Utils/PortalView';
import './FlowChartView.css';
import FlowChartModel from '../Model/FlowChartModel';

class FlowChartView extends Component {

    componentDidMount() {
        new FlowChartModel().drawLine(this.refs.canvas);
        
    }

    componentDidUpdate(prevProps, prevState, snapshot) {
        clearInterval(this.timerID);
        let isSuccess = true;
        new FlowChartModel().drawPathLine(this.refs.canvas, this.props.searchParam.steelGrd);
        if(prevProps.result.node[6]===true && this.props.result.node[6]===false) new FlowChartModel().drawIsSuccessLine(this.refs.canvas,isSuccess);
        else if(prevProps.result.node[7]===true && this.props.result.node[7]===false) {
            isSuccess = false;
            new FlowChartModel().drawIsSuccessLine(this.refs.canvas,isSuccess);
        }
        this.timerID = new FlowChartModel().animatedLine(this.refs.canvas, this.props.result);
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
                                    {this.props.result.percent === 100 ? "복제세포 상태 불량으로 폐기처분 되었습니다." : ""}
                                </Progress>
                        }
                    </Segment.Inline>
                    <PortalView open = {this.props.result.node[1]}/>
                </Segment>
            </div>
        );
    }
}

export default FlowChartView;