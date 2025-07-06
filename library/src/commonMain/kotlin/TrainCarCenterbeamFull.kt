package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarCenterbeamFull: ImageVector
    get() {
        if (_TrainCarCenterbeamFull != null) {
            return _TrainCarCenterbeamFull!!
        }
        _TrainCarCenterbeamFull = ImageVector.Builder(
            name = "TrainCarCenterbeamFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                curveTo(22f, 18.11f, 21.11f, 19f, 20f, 19f)
                reflectiveCurveTo(18f, 18.11f, 18f, 17f)
                horizontalLineTo(6f)
                curveTo(6f, 18.11f, 5.11f, 19f, 4f, 19f)
                reflectiveCurveTo(2f, 18.11f, 2f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(23f)
                moveTo(8f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(14f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                moveTo(15f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(14f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                moveTo(20f, 12f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                moveTo(8f, 9f)
                horizontalLineTo(4f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                moveTo(15f, 9f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(20f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                moveTo(8f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                moveTo(15f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                moveTo(20f, 6f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _TrainCarCenterbeamFull!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarCenterbeamFull: ImageVector? = null
