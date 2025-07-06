package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarTank: ImageVector
    get() {
        if (_TrainCarTank != null) {
            return _TrainCarTank!!
        }
        _TrainCarTank = ImageVector.Builder(
            name = "TrainCarTank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 15f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                curveTo(22f, 18.11f, 21.11f, 19f, 20f, 19f)
                reflectiveCurveTo(18f, 18.11f, 18f, 17f)
                horizontalLineTo(6f)
                curveTo(6f, 18.11f, 5.11f, 19f, 4f, 19f)
                reflectiveCurveTo(2f, 18.11f, 2f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(15f)
                horizontalLineTo(23f)
                moveTo(21f, 8f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(8f)
                horizontalLineTo(3f)
                curveTo(1.9f, 8f, 1f, 8.9f, 1f, 10f)
                verticalLineTo(12f)
                curveTo(1f, 13.11f, 1.9f, 14f, 3f, 14f)
                horizontalLineTo(21f)
                curveTo(22.11f, 14f, 23f, 13.11f, 23f, 12f)
                verticalLineTo(10f)
                curveTo(23f, 8.9f, 22.11f, 8f, 21f, 8f)
                close()
            }
        }.build()

        return _TrainCarTank!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarTank: ImageVector? = null
