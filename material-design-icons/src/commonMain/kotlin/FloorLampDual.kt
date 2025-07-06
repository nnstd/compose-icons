package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FloorLampDual: ImageVector
    get() {
        if (_FloorLampDual != null) {
            return _FloorLampDual!!
        }
        _FloorLampDual = ImageVector.Builder(
            name = "FloorLampDual",
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
                moveTo(9.08f, 10.82f)
                lineTo(3f, 6.81f)
                lineTo(9.39f, 2f)
                lineTo(11.55f, 8.93f)
                lineTo(9.08f, 10.82f)
                moveTo(14.61f, 2f)
                lineTo(21f, 6.81f)
                lineTo(14.92f, 10.82f)
                lineTo(12.44f, 8.95f)
                lineTo(14.61f, 2f)
                close()
            }
        }.build()

        return _FloorLampDual!!
    }

@Suppress("ObjectPropertyName")
private var _FloorLampDual: ImageVector? = null
