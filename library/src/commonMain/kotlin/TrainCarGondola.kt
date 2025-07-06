package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarGondola: ImageVector
    get() {
        if (_TrainCarGondola != null) {
            return _TrainCarGondola!!
        }
        _TrainCarGondola = ImageVector.Builder(
            name = "TrainCarGondola",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(10f)
                horizontalLineTo(1f)
                moveTo(21f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TrainCarGondola!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarGondola: ImageVector? = null
