package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomLeftBoldOutline: ImageVector
    get() {
        if (_ArrowBottomLeftBoldOutline != null) {
            return _ArrowBottomLeftBoldOutline!!
        }
        _ArrowBottomLeftBoldOutline = ImageVector.Builder(
            name = "ArrowBottomLeftBoldOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.36f, 19.78f)
                horizontalLineTo(4.22f)
                verticalLineTo(5.64f)
                lineTo(8.47f, 9.88f)
                lineTo(14.12f, 4.22f)
                lineTo(19.78f, 9.88f)
                lineTo(14.12f, 15.54f)
                lineTo(18.36f, 19.78f)
                moveTo(6.34f, 17.66f)
                horizontalLineTo(13.41f)
                lineTo(11.29f, 15.54f)
                lineTo(16.95f, 9.88f)
                lineTo(14.12f, 7.05f)
                lineTo(8.46f, 12.71f)
                lineTo(6.34f, 10.59f)
                verticalLineTo(17.66f)
                close()
            }
        }.build()

        return _ArrowBottomLeftBoldOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomLeftBoldOutline: ImageVector? = null
