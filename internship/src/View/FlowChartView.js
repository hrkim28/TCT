import React, { Component } from 'react';
import { Segment } from 'semantic-ui-react';
import { Step, Progress } from 'semantic-ui-react'

class FlowChartView extends Component {

    render() {
        const process = this.props.process;
        return (
            <div className="FlowChartSegment">
                <Segment>
                    <Segment.Inline>
                    <Step.Group ordered>
                        {
                            process >= 1 ?
                                <Step completed>
                                    <Step.Content>
                                        <Step.Title>Shipping</Step.Title>
                                        <Step.Description>Choose your shipping options</Step.Description>
                                    </Step.Content>
                                </Step>
                                :
                                <Step active>
                                    <Step.Content>
                                        <Step.Title>Shipping</Step.Title>
                                        <Step.Description>Choose your shipping options</Step.Description>
                                    </Step.Content>
                                </Step>}
                        {
                            process >= 2 ?
                                <Step completed>
                                    <Step.Content>
                                        <Step.Title>Billing</Step.Title>
                                        <Step.Description>Enter billing information</Step.Description>
                                    </Step.Content>
                                </Step>
                                :
                                <Step active>
                                    <Step.Content>
                                        <Step.Title>Billing</Step.Title>
                                        <Step.Description>Enter billing information</Step.Description>
                                    </Step.Content>
                                </Step>
                        }
                        {
                            process >= 3 ?
                                <Step completed>
                                    <Step.Content>
                                        <Step.Title>Confirm Order</Step.Title>
                                    </Step.Content>
                                </Step>
                                :
                                <Step active>
                                    <Step.Content>
                                        <Step.Title>Confirm Order</Step.Title>
                                    </Step.Content>
                                </Step>
                        }
                        {
                            process >= 4 ?
                                <Step completed>
                                    <Step.Content>
                                        <Step.Title>Success</Step.Title>
                                    </Step.Content>
                                </Step>
                                :
                                <Step active>
                                    <Step.Content>
                                        <Step.Title>Success</Step.Title>
                                    </Step.Content>
                                </Step>
                        }
                    </Step.Group>
                    <Progress percent={this.props.percent} indicating/>
                    </Segment.Inline>
                </Segment>
            </div>
                );
            }
        }
        
        export default FlowChartView;
