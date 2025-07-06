package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomLeftBoldBoxOutline: ImageVector
    get() {
        if (_ArrowBottomLeftBoldBoxOutline != null) {
            return _ArrowBottomLeftBoldBoxOutline!!
        }
        _ArrowBottomLeftBoldBoxOutline = ImageVector.Builder(
            name = "ArrowBottomLeftBoldBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 16f)
                verticalLineTo(8.9f)
                lineTo(10.1f, 11f)
                lineTo(14.2f, 7.1f)
                lineTo(17f, 10f)
                lineTo(12.9f, 13.9f)
                lineTo(15f, 16f)
                horizontalLineTo(8f)
                moveTo(21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ArrowBottomLeftBoldBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomLeftBoldBoxOutline: ImageVector? = null
