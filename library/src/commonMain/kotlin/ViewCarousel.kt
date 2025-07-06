package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewCarousel: ImageVector
    get() {
        if (_ViewCarousel != null) {
            return _ViewCarousel!!
        }
        _ViewCarousel = ImageVector.Builder(
            name = "ViewCarousel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                verticalLineTo(17f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                moveTo(2f, 17f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                moveTo(7f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ViewCarousel!!
    }

@Suppress("ObjectPropertyName")
private var _ViewCarousel: ImageVector? = null
