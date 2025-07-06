package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Opera: ImageVector
    get() {
        if (_Opera != null) {
            return _Opera!!
        }
        _Opera = ImageVector.Builder(
            name = "Opera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.04f, 17.07f)
                curveTo(8.04f, 15.9f, 7.4f, 14.16f, 7.35f, 12.21f)
                verticalLineTo(11.79f)
                curveTo(7.4f, 9.84f, 8.04f, 8.1f, 9.04f, 6.93f)
                curveTo(9.86f, 5.95f, 10.93f, 5.37f, 12.1f, 5.37f)
                curveTo(14.72f, 5.37f, 16.84f, 8.34f, 16.84f, 12f)
                curveTo(16.84f, 15.66f, 14.72f, 18.63f, 12.1f, 18.63f)
                curveTo(10.93f, 18.63f, 10.33f, 18.5f, 9.04f, 17.07f)
                moveTo(12.03f, 3f)
                horizontalLineTo(12f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 12f)
                curveTo(3f, 16.83f, 6.8f, 20.77f, 11.57f, 21f)
                horizontalLineTo(12f)
                curveTo(14.3f, 21f, 16.4f, 20.13f, 18f, 18.71f)
                curveTo(19.84f, 17.06f, 21f, 14.67f, 21f, 12f)
                curveTo(21f, 9.33f, 19.84f, 6.94f, 18f, 5.29f)
                curveTo(16.41f, 3.87f, 14.32f, 3f, 12.03f, 3f)
                close()
            }
        }.build()

        return _Opera!!
    }

@Suppress("ObjectPropertyName")
private var _Opera: ImageVector? = null
