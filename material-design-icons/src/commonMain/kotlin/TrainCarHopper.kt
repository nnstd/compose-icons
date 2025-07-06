package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarHopper: ImageVector
    get() {
        if (_TrainCarHopper != null) {
            return _TrainCarHopper!!
        }
        _TrainCarHopper = ImageVector.Builder(
            name = "TrainCarHopper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 8f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                moveTo(13f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(8f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _TrainCarHopper!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarHopper: ImageVector? = null
