package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisXRotateClockwise: ImageVector
    get() {
        if (_AxisXRotateClockwise != null) {
            return _AxisXRotateClockwise!!
        }
        _AxisXRotateClockwise = ImageVector.Builder(
            name = "AxisXRotateClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                horizontalLineTo(14.91f)
                curveTo(14.57f, 6.55f, 13.4f, 4f, 12f, 4f)
                curveTo(10.42f, 4f, 9.12f, 7.27f, 9f, 11.42f)
                lineTo(7f, 12.57f)
                verticalLineTo(12f)
                curveTo(7f, 6.5f, 9.24f, 2f, 12f, 2f)
                curveTo(14.42f, 2f, 16.44f, 5.44f, 16.9f, 10f)
                horizontalLineTo(20f)
                lineTo(16f, 14f)
                lineTo(12f, 10f)
                moveTo(12f, 22f)
                curveTo(10.12f, 22f, 8.47f, 19.92f, 7.62f, 16.84f)
                lineTo(9.37f, 15.83f)
                curveTo(9.87f, 18.31f, 10.86f, 20f, 12f, 20f)
                curveTo(13.27f, 20f, 14.36f, 17.89f, 14.79f, 14.92f)
                lineTo(16f, 16.12f)
                lineTo(16.7f, 15.42f)
                curveTo(16f, 19.26f, 14.16f, 22f, 12f, 22f)
                moveTo(2.11f, 18.87f)
                lineTo(1.11f, 17.13f)
                lineTo(1.06f, 17.06f)
                lineTo(11.12f, 11.25f)
                lineTo(12.72f, 12.84f)
                lineTo(2.15f, 18.94f)
                lineTo(2.11f, 18.87f)
                moveTo(21.89f, 5.13f)
                lineTo(22.89f, 6.87f)
                lineTo(19.2f, 9f)
                horizontalLineTo(17.77f)
                lineTo(17.5f, 7.66f)
                lineTo(21.89f, 5.13f)
                close()
            }
        }.build()

        return _AxisXRotateClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _AxisXRotateClockwise: ImageVector? = null
