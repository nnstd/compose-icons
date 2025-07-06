package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DeskLamp: ImageVector
    get() {
        if (_DeskLamp != null) {
            return _DeskLamp!!
        }
        _DeskLamp = ImageVector.Builder(
            name = "DeskLamp",
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
                curveTo(7.1f, 10f, 7.05f, 10f, 7f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
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
                close()
            }
        }.build()

        return _DeskLamp!!
    }

@Suppress("ObjectPropertyName")
private var _DeskLamp: ImageVector? = null
