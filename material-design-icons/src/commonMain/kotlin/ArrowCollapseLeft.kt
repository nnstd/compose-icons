package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseLeft: ImageVector
    get() {
        if (_ArrowCollapseLeft != null) {
            return _ArrowCollapseLeft!!
        }
        _ArrowCollapseLeft = ImageVector.Builder(
            name = "ArrowCollapseLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.92f, 19.92f)
                lineTo(4f, 12f)
                lineTo(11.92f, 4.08f)
                lineTo(13.33f, 5.5f)
                lineTo(7.83f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(7.83f)
                lineTo(13.34f, 18.5f)
                lineTo(11.92f, 19.92f)
                moveTo(4f, 12f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowCollapseLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseLeft: ImageVector? = null
