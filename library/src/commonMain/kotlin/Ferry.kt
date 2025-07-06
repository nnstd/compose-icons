package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ferry: ImageVector
    get() {
        if (_Ferry != null) {
            return _Ferry!!
        }
        _Ferry = ImageVector.Builder(
            name = "Ferry",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 6f)
                horizontalLineTo(18f)
                verticalLineTo(9.96f)
                lineTo(12f, 8f)
                lineTo(6f, 9.96f)
                moveTo(3.94f, 19f)
                horizontalLineTo(4f)
                curveTo(5.6f, 19f, 7f, 18.12f, 8f, 17f)
                curveTo(9f, 18.12f, 10.4f, 19f, 12f, 19f)
                curveTo(13.6f, 19f, 15f, 18.12f, 16f, 17f)
                curveTo(17f, 18.12f, 18.4f, 19f, 20f, 19f)
                horizontalLineTo(20.05f)
                lineTo(21.95f, 12.31f)
                curveTo(22.03f, 12.06f, 22f, 11.78f, 21.89f, 11.54f)
                curveTo(21.76f, 11.3f, 21.55f, 11.12f, 21.29f, 11.04f)
                lineTo(20f, 10.62f)
                verticalLineTo(6f)
                curveTo(20f, 4.89f, 19.1f, 4f, 18f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(1f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 6f)
                verticalLineTo(10.62f)
                lineTo(2.71f, 11.04f)
                curveTo(2.45f, 11.12f, 2.24f, 11.3f, 2.11f, 11.54f)
                curveTo(2f, 11.78f, 1.97f, 12.06f, 2.05f, 12.31f)
                moveTo(20f, 21f)
                curveTo(18.61f, 21f, 17.22f, 20.53f, 16f, 19.67f)
                curveTo(13.56f, 21.38f, 10.44f, 21.38f, 8f, 19.67f)
                curveTo(6.78f, 20.53f, 5.39f, 21f, 4f, 21f)
                horizontalLineTo(2f)
                verticalLineTo(23f)
                horizontalLineTo(4f)
                curveTo(5.37f, 23f, 6.74f, 22.65f, 8f, 22f)
                curveTo(10.5f, 23.3f, 13.5f, 23.3f, 16f, 22f)
                curveTo(17.26f, 22.65f, 18.62f, 23f, 20f, 23f)
                horizontalLineTo(22f)
                verticalLineTo(21f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _Ferry!!
    }

@Suppress("ObjectPropertyName")
private var _Ferry: ImageVector? = null
