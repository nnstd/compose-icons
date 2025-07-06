package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarCaboose: ImageVector
    get() {
        if (_TrainCarCaboose != null) {
            return _TrainCarCaboose!!
        }
        _TrainCarCaboose = ImageVector.Builder(
            name = "TrainCarCaboose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineTo(9f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                horizontalLineTo(1f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                moveTo(4f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(15f)
                moveTo(11f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                moveTo(18f, 12f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                moveTo(21f, 15f)
                horizontalLineTo(20f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TrainCarCaboose!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarCaboose: ImageVector? = null
