package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Hulu: ImageVector
    get() {
        if (_Hulu != null) {
            return _Hulu!!
        }
        _Hulu = ImageVector.Builder(
            name = "Hulu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 12.8f)
                verticalLineTo(22f)
                horizontalLineTo(14.7f)
                verticalLineTo(13.9f)
                curveTo(14.7f, 13.2f, 14.1f, 12.6f, 13.4f, 12.6f)
                horizontalLineTo(10.5f)
                curveTo(9.8f, 12.6f, 9.2f, 13.2f, 9.2f, 13.9f)
                verticalLineTo(22f)
                horizontalLineTo(4.5f)
                verticalLineTo(2f)
                horizontalLineTo(9.3f)
                verticalLineTo(8.4f)
                curveTo(9.6f, 8.3f, 9.9f, 8.2f, 10.2f, 8.2f)
                horizontalLineTo(15f)
                curveTo(17.5f, 8.2f, 19.5f, 10.3f, 19.5f, 12.8f)
                close()
            }
        }.build()

        return _Hulu!!
    }

@Suppress("ObjectPropertyName")
private var _Hulu: ImageVector? = null
