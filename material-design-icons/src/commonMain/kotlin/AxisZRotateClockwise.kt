package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisZRotateClockwise: ImageVector
    get() {
        if (_AxisZRotateClockwise != null) {
            return _AxisZRotateClockwise!!
        }
        _AxisZRotateClockwise = ImageVector.Builder(
            name = "AxisZRotateClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 12f)
                lineTo(10f, 16f)
                lineTo(14f, 20f)
                verticalLineTo(16.9f)
                curveTo(18.56f, 16.44f, 22f, 14.42f, 22f, 12f)
                curveTo(22f, 9.58f, 18.56f, 7.56f, 14f, 7.1f)
                verticalLineTo(9.09f)
                curveTo(17.45f, 9.43f, 20f, 10.6f, 20f, 12f)
                curveTo(20f, 13.4f, 17.45f, 14.57f, 14f, 14.91f)
                verticalLineTo(12f)
                moveTo(4f, 12f)
                curveTo(4f, 10.6f, 6.55f, 9.43f, 10f, 9.09f)
                verticalLineTo(7.1f)
                curveTo(5.44f, 7.56f, 2f, 9.58f, 2f, 12f)
                curveTo(2f, 14.16f, 4.74f, 16f, 8.58f, 16.7f)
                lineTo(7.88f, 16f)
                lineTo(9.08f, 14.79f)
                curveTo(6.11f, 14.36f, 4f, 13.27f, 4f, 12f)
                moveTo(13f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(13f, 11f)
                verticalLineTo(2f)
                moveTo(13f, 22f)
                verticalLineTo(21f)
                lineTo(11f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _AxisZRotateClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _AxisZRotateClockwise: ImageVector? = null
