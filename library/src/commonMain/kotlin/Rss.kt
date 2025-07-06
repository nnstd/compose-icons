package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rss: ImageVector
    get() {
        if (_Rss != null) {
            return _Rss!!
        }
        _Rss = ImageVector.Builder(
            name = "Rss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.18f, 15.64f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.36f, 17.82f)
                curveTo(8.36f, 19f, 7.38f, 20f, 6.18f, 20f)
                curveTo(5f, 20f, 4f, 19f, 4f, 17.82f)
                arcTo(2.18f, 2.18f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.18f, 15.64f)
                moveTo(4f, 4.44f)
                arcTo(15.56f, 15.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.56f, 20f)
                horizontalLineTo(16.73f)
                arcTo(12.73f, 12.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 7.27f)
                verticalLineTo(4.44f)
                moveTo(4f, 10.1f)
                arcTo(9.9f, 9.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.9f, 20f)
                horizontalLineTo(11.07f)
                arcTo(7.07f, 7.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12.93f)
                verticalLineTo(10.1f)
                close()
            }
        }.build()

        return _Rss!!
    }

@Suppress("ObjectPropertyName")
private var _Rss: ImageVector? = null
