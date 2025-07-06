package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PageFirst: ImageVector
    get() {
        if (_PageFirst != null) {
            return _PageFirst!!
        }
        _PageFirst = ImageVector.Builder(
            name = "PageFirst",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.41f, 16.59f)
                lineTo(13.82f, 12f)
                lineTo(18.41f, 7.41f)
                lineTo(17f, 6f)
                lineTo(11f, 12f)
                lineTo(17f, 18f)
                lineTo(18.41f, 16.59f)
                moveTo(6f, 6f)
                horizontalLineTo(8f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _PageFirst!!
    }

@Suppress("ObjectPropertyName")
private var _PageFirst: ImageVector? = null
