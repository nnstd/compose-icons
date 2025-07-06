package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Bowl: ImageVector
    get() {
        if (_Bowl != null) {
            return _Bowl!!
        }
        _Bowl = ImageVector.Builder(
            name = "Bowl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                curveTo(22f, 18.9f, 18.9f, 22f, 15f, 22f)
                horizontalLineTo(9f)
                curveTo(5.1f, 22f, 2f, 18.9f, 2f, 15f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _Bowl!!
    }

@Suppress("ObjectPropertyName")
private var _Bowl: ImageVector? = null
