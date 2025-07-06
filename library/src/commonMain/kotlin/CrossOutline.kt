package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CrossOutline: ImageVector
    get() {
        if (_CrossOutline != null) {
            return _CrossOutline!!
        }
        _CrossOutline = ImageVector.Builder(
            name = "CrossOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 6f)
                verticalLineTo(1f)
                horizontalLineTo(8.5f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineTo(8.5f)
                verticalLineTo(23f)
                horizontalLineTo(15.5f)
                verticalLineTo(13f)
                horizontalLineTo(21f)
                verticalLineTo(6f)
                horizontalLineTo(15.5f)
                moveTo(19f, 11f)
                horizontalLineTo(13.5f)
                verticalLineTo(21f)
                horizontalLineTo(10.5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(10.5f)
                verticalLineTo(3f)
                horizontalLineTo(13.5f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _CrossOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CrossOutline: ImageVector? = null
