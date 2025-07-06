package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomLeftBoldBox: ImageVector
    get() {
        if (_ArrowBottomLeftBoldBox != null) {
            return _ArrowBottomLeftBoldBox!!
        }
        _ArrowBottomLeftBoldBox = ImageVector.Builder(
            name = "ArrowBottomLeftBoldBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                moveTo(15.3f, 16f)
                lineTo(13.2f, 13.9f)
                lineTo(17f, 10f)
                lineTo(14.2f, 7.2f)
                lineTo(10.4f, 11.1f)
                lineTo(8.2f, 8.9f)
                verticalLineTo(16f)
                horizontalLineTo(15.3f)
                close()
            }
        }.build()

        return _ArrowBottomLeftBoldBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomLeftBoldBox: ImageVector? = null
