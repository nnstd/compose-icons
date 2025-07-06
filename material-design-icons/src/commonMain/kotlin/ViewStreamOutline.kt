package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewStreamOutline: ImageVector
    get() {
        if (_ViewStreamOutline != null) {
            return _ViewStreamOutline!!
        }
        _ViewStreamOutline = ImageVector.Builder(
            name = "ViewStreamOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                moveTo(19f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                moveTo(6f, 11f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _ViewStreamOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewStreamOutline: ImageVector? = null
