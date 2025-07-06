package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampDualOutline: ImageVector
    get() {
        if (_FloorLampDualOutline != null) {
            return _FloorLampDualOutline!!
        }
        _FloorLampDualOutline = ImageVector.Builder(
            name = "FloorLampDualOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.73f, 10.06f)
                lineTo(10.17f, 11.24f)
                lineTo(11f, 12.2f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(22f)
                horizontalLineTo(16f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(12.3f)
                lineTo(13.85f, 11.26f)
                lineTo(12.27f, 10.07f)
                lineTo(11.73f, 10.06f)
                moveTo(8.32f, 5.31f)
                lineTo(9.23f, 8.19f)
                lineTo(9f, 8.37f)
                lineTo(6.47f, 6.7f)
                lineTo(8.32f, 5.31f)
                moveTo(9.39f, 2f)
                lineTo(3f, 6.81f)
                lineTo(9.08f, 10.82f)
                lineTo(11.55f, 8.93f)
                lineTo(9.39f, 2f)
                moveTo(15.67f, 5.3f)
                lineTo(17.53f, 6.7f)
                lineTo(15f, 8.37f)
                lineTo(14.77f, 8.2f)
                lineTo(15.67f, 5.3f)
                moveTo(14.61f, 2f)
                lineTo(12.44f, 8.95f)
                lineTo(14.92f, 10.82f)
                lineTo(21f, 6.81f)
                lineTo(14.61f, 2f)
                close()
            }
        }.build()

        return _FloorLampDualOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampDualOutline: ImageVector? = null
