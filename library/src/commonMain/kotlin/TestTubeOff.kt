package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TestTubeOff: ImageVector
    get() {
        if (_TestTubeOff != null) {
            return _TestTubeOff!!
        }
        _TestTubeOff = ImageVector.Builder(
            name = "TestTubeOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(15.84f, 19.11f)
                curveTo(15.36f, 20.77f, 13.82f, 22f, 12f, 22f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                verticalLineTo(11.27f)
                lineTo(2f, 5.27f)
                moveTo(7f, 2f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(14.18f)
                lineTo(13.63f, 11.81f)
                curveTo(13.86f, 11.63f, 14f, 11.35f, 14f, 11f)
                curveTo(14f, 10.4f, 13.6f, 10f, 13f, 10f)
                curveTo(12.65f, 10f, 12.37f, 10.14f, 12.19f, 10.37f)
                lineTo(8f, 6.18f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(2f)
                moveTo(11f, 16f)
                curveTo(11.5f, 16f, 11.88f, 15.71f, 12f, 15.24f)
                lineTo(10.76f, 14f)
                curveTo(10.29f, 14.12f, 10f, 14.5f, 10f, 15f)
                curveTo(10f, 15.6f, 10.4f, 16f, 11f, 16f)
                moveTo(14f, 7f)
                verticalLineTo(4f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                close()
            }
        }.build()

        return _TestTubeOff!!
    }

@Suppress("ObjectPropertyName")
private var _TestTubeOff: ImageVector? = null
