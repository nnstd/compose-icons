package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisXRotateCounterclockwise: ImageVector
    get() {
        if (_AxisXRotateCounterclockwise != null) {
            return _AxisXRotateCounterclockwise!!
        }
        _AxisXRotateCounterclockwise = ImageVector.Builder(
            name = "AxisXRotateCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 14f)
                lineTo(16f, 10f)
                lineTo(20f, 14f)
                horizontalLineTo(16.9f)
                curveTo(16.44f, 18.56f, 14.42f, 22f, 12f, 22f)
                curveTo(10.12f, 22f, 8.47f, 19.92f, 7.62f, 16.84f)
                lineTo(9.37f, 15.83f)
                curveTo(9.87f, 18.31f, 10.86f, 20f, 12f, 20f)
                curveTo(13.4f, 20f, 14.57f, 17.45f, 14.91f, 14f)
                horizontalLineTo(12f)
                moveTo(1.11f, 17.13f)
                lineTo(13.89f, 9.75f)
                lineTo(13.96f, 10.54f)
                lineTo(10.5f, 14f)
                horizontalLineTo(10.54f)
                lineTo(2.11f, 18.87f)
                lineTo(1.11f, 17.13f)
                moveTo(21.89f, 5.13f)
                lineTo(22.89f, 6.87f)
                lineTo(17.88f, 9.76f)
                curveTo(17.79f, 9.03f, 17.67f, 8.33f, 17.5f, 7.66f)
                lineTo(21.89f, 5.13f)
                moveTo(12f, 2f)
                curveTo(14.3f, 2f, 16.23f, 5.1f, 16.82f, 9.32f)
                lineTo(16f, 8.5f)
                lineTo(14.87f, 9.63f)
                curveTo(14.5f, 6.37f, 13.35f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9.12f, 7.27f, 9f, 11.42f)
                lineTo(7f, 12.57f)
                verticalLineTo(12f)
                curveTo(7f, 6.5f, 9.24f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _AxisXRotateCounterclockwise!!
    }

@Suppress("ObjectPropertyName")
private var _AxisXRotateCounterclockwise: ImageVector? = null
