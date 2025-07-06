package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Widgets: ImageVector
    get() {
        if (_Widgets != null) {
            return _Widgets!!
        }
        _Widgets = ImageVector.Builder(
            name = "Widgets",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(7.34f)
                lineTo(16.66f, 1.69f)
                lineTo(22.31f, 7.34f)
                lineTo(16.66f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(16.66f)
                lineTo(11f, 7.34f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(3f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Widgets!!
    }

@Suppress("ObjectPropertyName")
private var _Widgets: ImageVector? = null
