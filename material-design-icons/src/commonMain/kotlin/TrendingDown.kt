package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TrendingDown: ImageVector
    get() {
        if (_TrendingDown != null) {
            return _TrendingDown!!
        }
        _TrendingDown = ImageVector.Builder(
            name = "TrendingDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 18f)
                lineTo(18.29f, 15.71f)
                lineTo(13.41f, 10.83f)
                lineTo(9.41f, 14.83f)
                lineTo(2f, 7.41f)
                lineTo(3.41f, 6f)
                lineTo(9.41f, 12f)
                lineTo(13.41f, 8f)
                lineTo(19.71f, 14.29f)
                lineTo(22f, 12f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _TrendingDown!!
    }

@Suppress("ObjectPropertyName")
private var _TrendingDown: ImageVector? = null
