import React, { Component } from 'react';
import { Segment, Progress } from 'semantic-ui-react'
import SteelMakingView from './FlowChart/SteelMakingView';
import CastingCutView from './FlowChart/CastingCutView';
import Cutting1stView from './FlowChart/Cutting1stView';
import Cutting2ndView from './FlowChart/Cutting2ndView';
import CorrectionView from './FlowChart/CorrectionView';
import ChargingView from './FlowChart/ChargingView';
import ScrapView from './FlowChart/ScrapView';
import './View.css';

class FlowChartView extends Component {

    render() {
        return (
            <div className="FlowChartSegment">
                <Segment>
                    <Segment.Inline className="SegmentInline">
                        <div className="SteelMaking">
                            <SteelMakingView steelMaking={this.props.steelMaking} />
                        </div>
                        <CastingCutView castingCut={this.props.castingCut} />
                        <Cutting1stView cutting1st={this.props.cutting1st} />
                        <Cutting2ndView cutting2nd={this.props.cutting2nd} />
                        <CorrectionView correction={this.props.correction} />
                        <ChargingView charging={this.props.charging} />
                        <ScrapView scrap={this.props.scrap} />
                        {
                            this.props.result.isSuccess === true ?
                                <Progress className="Progress" percent={this.props.result.percent} indicating progress='percent'>
                                    {this.props.result.percent === 100 ? "정상처리 되었습니다." : ""}
                                </Progress>
                                :
                                <Progress className="Progress" percent={this.props.result.percent} indicating error progress='percent'>
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
