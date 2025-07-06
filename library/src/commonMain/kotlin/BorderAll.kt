package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderAll: ImageVector
    get() {
        if (_BorderAll != null) {
            return _BorderAll!!
        }
        _BorderAll = ImageVector.Builder(
            name = "BorderAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 19f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(11f, 11f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                moveTo(11f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                moveTo(3f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _BorderAll!!
    }

@Suppress("ObjectPropertyName")
private var _BorderAll: ImageVector? = null
