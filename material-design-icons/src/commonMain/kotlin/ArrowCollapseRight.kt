package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowCollapseRight: ImageVector
    get() {
        if (_ArrowCollapseRight != null) {
            return _ArrowCollapseRight!!
        }
        _ArrowCollapseRight = ImageVector.Builder(
            name = "ArrowCollapseRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.08f, 4.08f)
                lineTo(20f, 12f)
                lineTo(12.08f, 19.92f)
                lineTo(10.67f, 18.5f)
                lineTo(16.17f, 13f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(16.17f)
                lineTo(10.67f, 5.5f)
                lineTo(12.08f, 4.08f)
                moveTo(20f, 12f)
                verticalLineTo(22f)
                horizontalLineTo(22f)
                verticalLineTo(2f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _ArrowCollapseRight!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowCollapseRight: ImageVector? = null
