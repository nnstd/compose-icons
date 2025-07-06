package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftBoldOutline: ImageVector
    get() {
        if (_ArrowTopLeftBoldOutline != null) {
            return _ArrowTopLeftBoldOutline!!
        }
        _ArrowTopLeftBoldOutline = ImageVector.Builder(
            name = "ArrowTopLeftBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.12f, 8.46f)
                lineTo(19.78f, 14.12f)
                lineTo(14.12f, 19.78f)
                lineTo(8.46f, 14.12f)
                lineTo(4.22f, 18.36f)
                verticalLineTo(4.22f)
                horizontalLineTo(18.36f)
                lineTo(14.12f, 8.46f)
                moveTo(6.34f, 13.41f)
                lineTo(8.46f, 11.29f)
                lineTo(14.12f, 16.95f)
                lineTo(16.95f, 14.12f)
                lineTo(11.29f, 8.47f)
                lineTo(13.41f, 6.34f)
                horizontalLineTo(6.34f)
                verticalLineTo(13.41f)
                close()
            }
        }.build()

        return _ArrowTopLeftBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftBoldOutline: ImageVector? = null
