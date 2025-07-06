package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseHorizontal: ImageVector
    get() {
        if (_ArrowCollapseHorizontal != null) {
            return _ArrowCollapseHorizontal!!
        }
        _ArrowCollapseHorizontal = ImageVector.Builder(
            name = "ArrowCollapseHorizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(15.03f)
                verticalLineTo(20f)
                horizontalLineTo(13f)
                moveTo(10f, 20f)
                verticalLineTo(4f)
                horizontalLineTo(12.03f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                moveTo(5f, 8f)
                lineTo(9.03f, 12f)
                lineTo(5f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                moveTo(20f, 16f)
                lineTo(16f, 12f)
                lineTo(20f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(23f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                close()
            }
        }.build()

        return _ArrowCollapseHorizontal!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseHorizontal: ImageVector? = null
