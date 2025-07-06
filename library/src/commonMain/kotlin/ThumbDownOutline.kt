package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThumbDownOutline: ImageVector
    get() {
        if (_ThumbDownOutline != null) {
            return _ThumbDownOutline!!
        }
        _ThumbDownOutline = ImageVector.Builder(
            name = "ThumbDownOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                verticalLineTo(3f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(15f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 5f)
                verticalLineTo(15f)
                curveTo(17f, 15.55f, 16.78f, 16.05f, 16.41f, 16.41f)
                lineTo(9.83f, 23f)
                lineTo(8.77f, 21.94f)
                curveTo(8.5f, 21.67f, 8.33f, 21.3f, 8.33f, 20.88f)
                lineTo(8.36f, 20.57f)
                lineTo(9.31f, 16f)
                horizontalLineTo(3f)
                curveTo(1.89f, 16f, 1f, 15.1f, 1f, 14f)
                verticalLineTo(12f)
                curveTo(1f, 11.74f, 1.05f, 11.5f, 1.14f, 11.27f)
                lineTo(4.16f, 4.22f)
                curveTo(4.46f, 3.5f, 5.17f, 3f, 6f, 3f)
                horizontalLineTo(15f)
                moveTo(15f, 5f)
                horizontalLineTo(5.97f)
                lineTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(11.78f)
                lineTo(10.65f, 19.32f)
                lineTo(15f, 14.97f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ThumbDownOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbDownOutline: ImageVector? = null
