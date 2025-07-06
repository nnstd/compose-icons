package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRightThick: ImageVector
    get() {
        if (_ArrowBottomRightThick != null) {
            return _ArrowBottomRightThick!!
        }
        _ArrowBottomRightThick = ImageVector.Builder(
            name = "ArrowBottomRightThick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.89f, 12.06f)
                verticalLineTo(7.11f)
                horizontalLineTo(18.31f)
                verticalLineTo(18.31f)
                horizontalLineTo(7.11f)
                verticalLineTo(14.89f)
                horizontalLineTo(12.06f)
                lineTo(5.69f, 8.5f)
                lineTo(8.5f, 5.69f)
                lineTo(14.89f, 12.06f)
                close()
            }
        }.build()

        return _ArrowBottomRightThick!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRightThick: ImageVector? = null
