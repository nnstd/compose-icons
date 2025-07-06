package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WindowClose: ImageVector
    get() {
        if (_WindowClose != null) {
            return _WindowClose!!
        }
        _WindowClose = ImageVector.Builder(
            name = "WindowClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.46f, 12f)
                lineTo(19f, 17.54f)
                verticalLineTo(19f)
                horizontalLineTo(17.54f)
                lineTo(12f, 13.46f)
                lineTo(6.46f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(17.54f)
                lineTo(10.54f, 12f)
                lineTo(5f, 6.46f)
                verticalLineTo(5f)
                horizontalLineTo(6.46f)
                lineTo(12f, 10.54f)
                lineTo(17.54f, 5f)
                horizontalLineTo(19f)
                verticalLineTo(6.46f)
                lineTo(13.46f, 12f)
                close()
            }
        }.build()

        return _WindowClose!!
    }

@Suppress("ObjectPropertyName")
private var _WindowClose: ImageVector? = null
