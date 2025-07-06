package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleChrome: ImageVector
    get() {
        if (_GoogleChrome != null) {
            return _GoogleChrome!!
        }
        _GoogleChrome = ImageVector.Builder(
            name = "GoogleChrome",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                lineTo(15.46f, 14f)
                horizontalLineTo(15.45f)
                curveTo(15.79f, 13.4f, 16f, 12.73f, 16f, 12f)
                curveTo(16f, 10.8f, 15.46f, 9.73f, 14.62f, 9f)
                horizontalLineTo(19.41f)
                curveTo(19.79f, 9.93f, 20f, 10.94f, 20f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                moveTo(4f, 12f)
                curveTo(4f, 10.54f, 4.39f, 9.18f, 5.07f, 8f)
                lineTo(8.54f, 14f)
                horizontalLineTo(8.55f)
                curveTo(9.24f, 15.19f, 10.5f, 16f, 12f, 16f)
                curveTo(12.45f, 16f, 12.88f, 15.91f, 13.29f, 15.77f)
                lineTo(10.89f, 19.91f)
                curveTo(7f, 19.37f, 4f, 16.04f, 4f, 12f)
                moveTo(15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                moveTo(12f, 4f)
                curveTo(14.96f, 4f, 17.54f, 5.61f, 18.92f, 8f)
                horizontalLineTo(12f)
                curveTo(10.06f, 8f, 8.45f, 9.38f, 8.08f, 11.21f)
                lineTo(5.7f, 7.08f)
                curveTo(7.16f, 5.21f, 9.44f, 4f, 12f, 4f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _GoogleChrome!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleChrome: ImageVector? = null
