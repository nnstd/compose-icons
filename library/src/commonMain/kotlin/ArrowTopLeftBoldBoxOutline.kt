package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftBoldBoxOutline: ImageVector
    get() {
        if (_ArrowTopLeftBoldBoxOutline != null) {
            return _ArrowTopLeftBoldBoxOutline!!
        }
        _ArrowTopLeftBoldBoxOutline = ImageVector.Builder(
            name = "ArrowTopLeftBoldBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 8f)
                horizontalLineTo(15.1f)
                lineTo(13f, 10.1f)
                lineTo(17f, 14f)
                lineTo(14.2f, 16.8f)
                lineTo(10.1f, 12.9f)
                lineTo(8f, 15.1f)
                verticalLineTo(8f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ArrowTopLeftBoldBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftBoldBoxOutline: ImageVector? = null
