package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WatchVariant: ImageVector
    get() {
        if (_WatchVariant != null) {
            return _WatchVariant!!
        }
        _WatchVariant = ImageVector.Builder(
            name = "WatchVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 0f)
                lineTo(7.17f, 5f)
                horizontalLineTo(7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 7f)
                verticalLineTo(17f)
                curveTo(5f, 18.11f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(7.17f)
                lineTo(8f, 24f)
                horizontalLineTo(16f)
                lineTo(16.83f, 19f)
                horizontalLineTo(17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17f)
                verticalLineTo(7f)
                curveTo(19f, 5.89f, 18.1f, 5f, 17f, 5f)
                horizontalLineTo(16.83f)
                lineTo(16f, 0f)
                horizontalLineTo(8f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _WatchVariant!!
    }

@Suppress("ObjectPropertyName")
private var _WatchVariant: ImageVector? = null
