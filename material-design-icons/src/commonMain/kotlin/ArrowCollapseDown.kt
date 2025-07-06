package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseDown: ImageVector
    get() {
        if (_ArrowCollapseDown != null) {
            return _ArrowCollapseDown!!
        }
        _ArrowCollapseDown = ImageVector.Builder(
            name = "ArrowCollapseDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.92f, 12.08f)
                lineTo(12f, 20f)
                lineTo(4.08f, 12.08f)
                lineTo(5.5f, 10.67f)
                lineTo(11f, 16.17f)
                verticalLineTo(2f)
                horizontalLineTo(13f)
                verticalLineTo(16.17f)
                lineTo(18.5f, 10.66f)
                lineTo(19.92f, 12.08f)
                moveTo(12f, 20f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(20f)
                horizontalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowCollapseDown!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseDown: ImageVector? = null
