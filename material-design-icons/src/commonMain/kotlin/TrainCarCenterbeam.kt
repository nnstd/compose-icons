package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarCenterbeam: ImageVector
    get() {
        if (_TrainCarCenterbeam != null) {
            return _TrainCarCenterbeam!!
        }
        _TrainCarCenterbeam = ImageVector.Builder(
            name = "TrainCarCenterbeam",
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
                close()
            }
        }.build()

        return _TrainCarCenterbeam!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarCenterbeam: ImageVector? = null
