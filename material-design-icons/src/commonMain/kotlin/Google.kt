package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Google: ImageVector
    get() {
        if (_Google != null) {
            return _Google!!
        }
        _Google = ImageVector.Builder(
            name = "Google",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.35f, 11.1f)
                horizontalLineTo(12.18f)
                verticalLineTo(13.83f)
                horizontalLineTo(18.69f)
                curveTo(18.36f, 17.64f, 15.19f, 19.27f, 12.19f, 19.27f)
                curveTo(8.36f, 19.27f, 5f, 16.25f, 5f, 12f)
                curveTo(5f, 7.9f, 8.2f, 4.73f, 12.2f, 4.73f)
                curveTo(15.29f, 4.73f, 17.1f, 6.7f, 17.1f, 6.7f)
                lineTo(19f, 4.72f)
                curveTo(19f, 4.72f, 16.56f, 2f, 12.1f, 2f)
                curveTo(6.42f, 2f, 2.03f, 6.8f, 2.03f, 12f)
                curveTo(2.03f, 17.05f, 6.16f, 22f, 12.25f, 22f)
                curveTo(17.6f, 22f, 21.5f, 18.33f, 21.5f, 12.91f)
                curveTo(21.5f, 11.76f, 21.35f, 11.1f, 21.35f, 11.1f)
                verticalLineTo(11.1f)
                close()
            }
        }.build()

        return _Google!!
    }

@Suppress("ObjectPropertyName")
private var _Google: ImageVector? = null
