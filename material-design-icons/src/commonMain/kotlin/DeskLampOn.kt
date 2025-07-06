package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeskLampOn: ImageVector
    get() {
        if (_DeskLampOn != null) {
            return _DeskLampOn!!
        }
        _DeskLampOn = ImageVector.Builder(
            name = "DeskLampOn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.85f, 2f)
                lineTo(9.18f, 4.5f)
                lineTo(10.32f, 5.25f)
                lineTo(7.14f, 10f)
                horizontalLineTo(7f)
                curveTo(5.9f, 10f, 5f, 10.9f, 5f, 12f)
                curveTo(5f, 12.94f, 5.66f, 13.75f, 6.58f, 13.95f)
                lineTo(10.62f, 20f)
                horizontalLineTo(7f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                lineTo(8.53f, 13.28f)
                curveTo(8.83f, 12.92f, 9f, 12.47f, 9f, 12f)
                curveTo(9f, 11.7f, 8.93f, 11.4f, 8.8f, 11.13f)
                lineTo(12f, 6.37f)
                curveTo(11.78f, 8.05f, 12.75f, 9.89f, 14.45f, 11f)
                lineTo(18.89f, 4.37f)
                curveTo(17.2f, 3.24f, 15.12f, 3.04f, 13.65f, 3.87f)
                lineTo(10.85f, 2f)
                moveTo(18.33f, 7f)
                lineTo(16.67f, 9.5f)
                curveTo(17.35f, 9.95f, 18.29f, 9.77f, 18.75f, 9.08f)
                curveTo(19.21f, 8.39f, 19f, 7.46f, 18.33f, 7f)
                moveTo(21.7f, 12.58f)
                lineTo(19.58f, 10.45f)
                lineTo(20.28f, 9.75f)
                lineTo(22.4f, 11.87f)
                lineTo(21.7f, 12.58f)
                moveTo(23f, 7f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(23f)
                verticalLineTo(7f)
                moveTo(16f, 14f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _DeskLampOn!!
    }

@Suppress("ObjectPropertyName")
private var _DeskLampOn: ImageVector? = null
