package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Scale: ImageVector
    get() {
        if (_Scale != null) {
            return _Scale!!
        }
        _Scale = ImageVector.Builder(
            name = "Scale",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.46f, 15.06f)
                lineTo(7.05f, 16.47f)
                lineTo(5.68f, 15.1f)
                curveTo(4.82f, 16.21f, 4.24f, 17.54f, 4.06f, 19f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 15.16f, 5.44f, 11.13f, 10f, 10.2f)
                verticalLineTo(8.2f)
                lineTo(2f, 5f)
                verticalLineTo(3f)
                horizontalLineTo(22f)
                verticalLineTo(5f)
                lineTo(14f, 8.2f)
                verticalLineTo(10.2f)
                curveTo(18.56f, 11.13f, 22f, 15.16f, 22f, 20f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                horizontalLineTo(19.94f)
                curveTo(19.76f, 17.54f, 19.18f, 16.21f, 18.32f, 15.1f)
                lineTo(16.95f, 16.47f)
                lineTo(15.54f, 15.06f)
                lineTo(16.91f, 13.68f)
                curveTo(15.8f, 12.82f, 14.46f, 12.24f, 13f, 12.06f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(12.06f)
                curveTo(9.54f, 12.24f, 8.2f, 12.82f, 7.09f, 13.68f)
                lineTo(8.46f, 15.06f)
                moveTo(12f, 18f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(11.68f, 22f, 11.38f, 21.93f, 11.12f, 21.79f)
                lineTo(7.27f, 20f)
                lineTo(11.12f, 18.21f)
                curveTo(11.38f, 18.07f, 11.68f, 18f, 12f, 18f)
                close()
            }
        }.build()

        return _Scale!!
    }

@Suppress("ObjectPropertyName")
private var _Scale: ImageVector? = null
