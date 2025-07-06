package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Store: ImageVector
    get() {
        if (_Store != null) {
            return _Store!!
        }
        _Store = ImageVector.Builder(
            name = "Store",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                moveTo(21f, 14f)
                verticalLineTo(12f)
                lineTo(20f, 7f)
                horizontalLineTo(4f)
                lineTo(3f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(14f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _Store!!
    }

@Suppress("ObjectPropertyName")
private var _Store: ImageVector? = null
