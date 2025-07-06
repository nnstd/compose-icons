package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseVertical: ImageVector
    get() {
        if (_ArrowCollapseVertical != null) {
            return _ArrowCollapseVertical!!
        }
        _ArrowCollapseVertical = ImageVector.Builder(
            name = "ArrowCollapseVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(12f)
                moveTo(4f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(16f, 4f)
                lineTo(12f, 8f)
                lineTo(8f, 4f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                moveTo(8f, 19f)
                lineTo(12f, 15f)
                lineTo(16f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _ArrowCollapseVertical!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseVertical: ImageVector? = null
