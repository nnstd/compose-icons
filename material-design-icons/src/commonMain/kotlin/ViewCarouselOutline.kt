package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewCarouselOutline: ImageVector
    get() {
        if (_ViewCarouselOutline != null) {
            return _ViewCarouselOutline!!
        }
        _ViewCarouselOutline = ImageVector.Builder(
            name = "ViewCarouselOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 6f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                moveTo(7f, 19f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(19f)
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(18f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _ViewCarouselOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewCarouselOutline: ImageVector? = null
