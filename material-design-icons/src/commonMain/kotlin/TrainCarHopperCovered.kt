package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarHopperCovered: ImageVector
    get() {
        if (_TrainCarHopperCovered != null) {
            return _TrainCarHopperCovered!!
        }
        _TrainCarHopperCovered = ImageVector.Builder(
            name = "TrainCarHopperCovered",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                lineTo(2f, 10.33f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(10f)
                lineTo(11f, 18f)
                horizontalLineTo(13f)
                lineTo(14f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(10.33f)
                lineTo(23f, 9f)
                moveTo(4f, 15f)
                verticalLineTo(13f)
                lineTo(5.5f, 15f)
                horizontalLineTo(4f)
                moveTo(5f, 10f)
                verticalLineTo(9f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(5f)
                moveTo(20f, 15f)
                horizontalLineTo(18.5f)
                lineTo(20f, 13f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TrainCarHopperCovered!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarHopperCovered: ImageVector? = null
