package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarPassenger: ImageVector
    get() {
        if (_TrainCarPassenger != null) {
            return _TrainCarPassenger!!
        }
        _TrainCarPassenger = ImageVector.Builder(
            name = "TrainCarPassenger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                horizontalLineTo(3f)
                curveTo(1.9f, 7f, 1f, 7.9f, 1f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                curveTo(23f, 7.9f, 22.11f, 7f, 21f, 7f)
                moveTo(7f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                moveTo(15f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                moveTo(21f, 12f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TrainCarPassenger!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarPassenger: ImageVector? = null
