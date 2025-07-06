package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomLeftThick: ImageVector
    get() {
        if (_ArrowBottomLeftThick != null) {
            return _ArrowBottomLeftThick!!
        }
        _ArrowBottomLeftThick = ImageVector.Builder(
            name = "ArrowBottomLeftThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 5.69f)
                lineTo(18.31f, 8.5f)
                lineTo(11.94f, 14.89f)
                horizontalLineTo(16.89f)
                verticalLineTo(18.31f)
                horizontalLineTo(5.69f)
                verticalLineTo(7.11f)
                horizontalLineTo(9.12f)
                verticalLineTo(12.06f)
                lineTo(15.5f, 5.69f)
                close()
            }
        }.build()

        return _ArrowBottomLeftThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomLeftThick: ImageVector? = null
