package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TreeOutline: ImageVector
    get() {
        if (_TreeOutline != null) {
            return _TreeOutline!!
        }
        _TreeOutline = ImageVector.Builder(
            name = "TreeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 3f)
                curveTo(8f, 3f, 6f, 5f, 6f, 7.5f)
                curveTo(6f, 8.11f, 6.13f, 8.71f, 6.37f, 9.27f)
                curveTo(5.5f, 10.12f, 5f, 11.28f, 5f, 12.5f)
                curveTo(5f, 15f, 7f, 17f, 9.5f, 17f)
                curveTo(10f, 17f, 10.5f, 16.89f, 11f, 16.72f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(15.77f)
                curveTo(13.5f, 15.91f, 14f, 16f, 14.5f, 16f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 10.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.5f, 5f)
                curveTo(14.41f, 5f, 14.33f, 5f, 14.24f, 5f)
                curveTo(13.41f, 3.76f, 12f, 3f, 10.5f, 3f)
                moveTo(10.5f, 5f)
                curveTo(11.82f, 5f, 12.91f, 6.03f, 13f, 7.35f)
                curveTo(13.46f, 7.12f, 14f, 7f, 14.5f, 7f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 14f)
                curveTo(13.54f, 14f, 12.63f, 13.61f, 11.96f, 12.91f)
                curveTo(11.76f, 14.12f, 10.72f, 15f, 9.5f, 15f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12.5f)
                curveTo(7f, 11.12f, 7.8f, 10.54f, 9f, 9.79f)
                curveTo(8.2f, 8.76f, 8f, 8.16f, 8f, 7.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 5f)
                close()
            }
        }.build()

        return _TreeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TreeOutline: ImageVector? = null
