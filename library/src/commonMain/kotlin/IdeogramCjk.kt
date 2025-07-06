package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.IdeogramCjk: ImageVector
    get() {
        if (_IdeogramCjk != null) {
            return _IdeogramCjk!!
        }
        _IdeogramCjk = ImageVector.Builder(
            name = "IdeogramCjk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                moveTo(8f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(13.59f)
                lineTo(11.59f, 14f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(14.21f)
                lineTo(16f, 12.21f)
                verticalLineTo(10f)
                close()
            }
        }.build()

        return _IdeogramCjk!!
    }

@Suppress("ObjectPropertyName")
private var _IdeogramCjk: ImageVector? = null
