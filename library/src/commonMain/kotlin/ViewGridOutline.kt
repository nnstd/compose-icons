package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ViewGridOutline: ImageVector
    get() {
        if (_ViewGridOutline != null) {
            return _ViewGridOutline!!
        }
        _ViewGridOutline = ImageVector.Builder(
            name = "ViewGridOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                moveTo(5f, 5f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                moveTo(13f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                moveTo(15f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                moveTo(3f, 21f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                moveTo(5f, 15f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                moveTo(13f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(19f, 9f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ViewGridOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ViewGridOutline: ImageVector? = null
