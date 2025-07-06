package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleGlass: ImageVector
    get() {
        if (_GoogleGlass != null) {
            return _GoogleGlass!!
        }
        _GoogleGlass = ImageVector.Builder(
            name = "GoogleGlass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(16.75f, 18f)
                horizontalLineTo(15.25f)
                verticalLineTo(8.9f)
                lineTo(6.72f, 18f)
                horizontalLineTo(4.66f)
                lineTo(15.45f, 6.5f)
                curveTo(15.66f, 6.26f, 16f, 6.19f, 16.27f, 6.3f)
                curveTo(16.56f, 6.42f, 16.75f, 6.69f, 16.75f, 7f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _GoogleGlass!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleGlass: ImageVector? = null
