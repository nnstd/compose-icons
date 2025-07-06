package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrainCarIntermodal: ImageVector
    get() {
        if (_TrainCarIntermodal != null) {
            return _TrainCarIntermodal!!
        }
        _TrainCarIntermodal = ImageVector.Builder(
            name = "TrainCarIntermodal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
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
                horizontalLineTo(21f)
                moveTo(16f, 14f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                verticalLineTo(14f)
                moveTo(21f, 5f)
                horizontalLineTo(3f)
                verticalLineTo(10f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                moveTo(16f, 8f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _TrainCarIntermodal!!
    }

@Suppress("ObjectPropertyName")
private var _TrainCarIntermodal: ImageVector? = null
