package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftBoldBox: ImageVector
    get() {
        if (_ArrowTopLeftBoldBox != null) {
            return _ArrowTopLeftBoldBox!!
        }
        _ArrowTopLeftBoldBox = ImageVector.Builder(
            name = "ArrowTopLeftBoldBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                moveTo(8.2f, 8f)
                verticalLineTo(15.1f)
                lineTo(10.3f, 13f)
                lineTo(14.1f, 16.9f)
                lineTo(17f, 14f)
                lineTo(13.2f, 10.1f)
                lineTo(15.3f, 8f)
                horizontalLineTo(8.2f)
                close()
            }
        }.build()

        return _ArrowTopLeftBoldBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftBoldBox: ImageVector? = null
