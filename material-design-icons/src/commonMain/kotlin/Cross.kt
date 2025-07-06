package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Cross: ImageVector
    get() {
        if (_Cross != null) {
            return _Cross!!
        }
        _Cross = ImageVector.Builder(
            name = "Cross",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 2f)
                horizontalLineTo(13.5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(13.5f)
                verticalLineTo(22f)
                horizontalLineTo(10.5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(10.5f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _Cross!!
    }

@Suppress("ObjectPropertyName")
private var _Cross: ImageVector? = null
