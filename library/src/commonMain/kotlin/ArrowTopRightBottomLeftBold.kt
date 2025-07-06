package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightBottomLeftBold: ImageVector
    get() {
        if (_ArrowTopRightBottomLeftBold != null) {
            return _ArrowTopRightBottomLeftBold!!
        }
        _ArrowTopRightBottomLeftBold = ImageVector.Builder(
            name = "ArrowTopRightBottomLeftBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.17f, 8.66f)
                lineTo(21f, 11.5f)
                verticalLineTo(3f)
                horizontalLineTo(12.5f)
                lineTo(15.34f, 5.83f)
                lineTo(5.83f, 15.34f)
                lineTo(3f, 12.5f)
                verticalLineTo(21f)
                horizontalLineTo(11.5f)
                lineTo(8.66f, 18.17f)
                lineTo(18.17f, 8.66f)
                close()
            }
        }.build()

        return _ArrowTopRightBottomLeftBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightBottomLeftBold: ImageVector? = null
