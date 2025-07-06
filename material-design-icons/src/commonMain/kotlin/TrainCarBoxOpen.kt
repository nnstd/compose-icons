package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarBoxOpen: ImageVector
    get() {
        if (_TrainCarBoxOpen != null) {
            return _TrainCarBoxOpen!!
        }
        _TrainCarBoxOpen = ImageVector.Builder(
            name = "TrainCarBoxOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                curveTo(2f, 18.11f, 2.9f, 19f, 4f, 19f)
                reflectiveCurveTo(6f, 18.11f, 6f, 17f)
                horizontalLineTo(18f)
                curveTo(18f, 18.11f, 18.9f, 19f, 20f, 19f)
                reflectiveCurveTo(22f, 18.11f, 22f, 17f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                moveTo(16f, 16f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _TrainCarBoxOpen!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarBoxOpen: ImageVector? = null
