package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReflectHorizontal: ImageVector
    get() {
        if (_ReflectHorizontal != null) {
            return _ReflectHorizontal!!
        }
        _ReflectHorizontal = ImageVector.Builder(
            name = "ReflectHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 20f)
                horizontalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13f, 19f)
                verticalLineTo(4.97f)
                curveTo(13f, 4.5f, 13.31f, 4.12f, 13.74f, 4f)
                curveTo(14.19f, 3.88f, 14.65f, 4.08f, 14.87f, 4.47f)
                lineTo(22.89f, 18.5f)
                curveTo(23.07f, 18.81f, 23.07f, 19.19f, 22.89f, 19.5f)
                curveTo(22.71f, 19.81f, 22.38f, 20f, 22f, 20f)
                moveTo(2f, 20f)
                curveTo(1.62f, 20f, 1.29f, 19.81f, 1.11f, 19.5f)
                curveTo(0.93f, 19.19f, 0.93f, 18.81f, 1.11f, 18.5f)
                lineTo(9.13f, 4.47f)
                curveTo(9.35f, 4.08f, 9.81f, 3.88f, 10.26f, 4f)
                curveTo(10.69f, 4.12f, 11f, 4.5f, 11f, 4.97f)
                verticalLineTo(19f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20f)
                horizontalLineTo(2f)
                moveTo(9f, 18f)
                verticalLineTo(8.74f)
                lineTo(3.71f, 18f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ReflectHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ReflectHorizontal: ImageVector? = null
