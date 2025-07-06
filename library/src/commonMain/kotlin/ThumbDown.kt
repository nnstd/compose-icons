package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ThumbDown: ImageVector
    get() {
        if (_ThumbDown != null) {
            return _ThumbDown!!
        }
        _ThumbDown = ImageVector.Builder(
            name = "ThumbDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 15f)
                horizontalLineTo(23f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                moveTo(15f, 3f)
                horizontalLineTo(6f)
                curveTo(5.17f, 3f, 4.46f, 3.5f, 4.16f, 4.22f)
                lineTo(1.14f, 11.27f)
                curveTo(1.05f, 11.5f, 1f, 11.74f, 1f, 12f)
                verticalLineTo(14f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 16f)
                horizontalLineTo(9.31f)
                lineTo(8.36f, 20.57f)
                curveTo(8.34f, 20.67f, 8.33f, 20.77f, 8.33f, 20.88f)
                curveTo(8.33f, 21.3f, 8.5f, 21.67f, 8.77f, 21.94f)
                lineTo(9.83f, 23f)
                lineTo(16.41f, 16.41f)
                curveTo(16.78f, 16.05f, 17f, 15.55f, 17f, 15f)
                verticalLineTo(5f)
                curveTo(17f, 3.89f, 16.1f, 3f, 15f, 3f)
                close()
            }
        }.build()

        return _ThumbDown!!
    }

@Suppress("ObjectPropertyName")
private var _ThumbDown: ImageVector? = null
