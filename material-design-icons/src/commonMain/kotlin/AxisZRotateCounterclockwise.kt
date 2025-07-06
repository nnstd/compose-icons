package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AxisZRotateCounterclockwise: ImageVector
    get() {
        if (_AxisZRotateCounterclockwise != null) {
            return _AxisZRotateCounterclockwise!!
        }
        _AxisZRotateCounterclockwise = ImageVector.Builder(
            name = "AxisZRotateCounterclockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 12f)
                lineTo(14f, 16f)
                lineTo(10f, 20f)
                verticalLineTo(16.9f)
                curveTo(5.44f, 16.44f, 2f, 14.42f, 2f, 12f)
                curveTo(2f, 9.58f, 5.44f, 7.56f, 10f, 7.1f)
                verticalLineTo(9.09f)
                curveTo(6.55f, 9.43f, 4f, 10.6f, 4f, 12f)
                curveTo(4f, 13.4f, 6.55f, 14.57f, 10f, 14.91f)
                verticalLineTo(12f)
                moveTo(20f, 12f)
                curveTo(20f, 10.6f, 17.45f, 9.43f, 14f, 9.09f)
                verticalLineTo(7.1f)
                curveTo(18.56f, 7.56f, 22f, 9.58f, 22f, 12f)
                curveTo(22f, 14.16f, 19.26f, 16f, 15.42f, 16.7f)
                lineTo(16.12f, 16f)
                lineTo(14.92f, 14.79f)
                curveTo(17.89f, 14.36f, 20f, 13.27f, 20f, 12f)
                moveTo(11f, 2f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                lineTo(11f, 11f)
                verticalLineTo(2f)
                moveTo(11f, 22f)
                verticalLineTo(21f)
                lineTo(13f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _AxisZRotateCounterclockwise!!
    }

@Suppress("ObjectPropertyName")
private var _AxisZRotateCounterclockwise: ImageVector? = null
