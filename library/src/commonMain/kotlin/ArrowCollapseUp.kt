package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseUp: ImageVector
    get() {
        if (_ArrowCollapseUp != null) {
            return _ArrowCollapseUp!!
        }
        _ArrowCollapseUp = ImageVector.Builder(
            name = "ArrowCollapseUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.08f, 11.92f)
                lineTo(12f, 4f)
                lineTo(19.92f, 11.92f)
                lineTo(18.5f, 13.33f)
                lineTo(13f, 7.83f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(7.83f)
                lineTo(5.5f, 13.33f)
                lineTo(4.08f, 11.92f)
                moveTo(12f, 4f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowCollapseUp!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseUp: ImageVector? = null
