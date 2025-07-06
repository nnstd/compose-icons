package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PauseBoxOutline: ImageVector
    get() {
        if (_PauseBoxOutline != null) {
            return _PauseBoxOutline!!
        }
        _PauseBoxOutline = ImageVector.Builder(
            name = "PauseBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.1f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(13f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                moveTo(9f, 16f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
            }
        }.build()

        return _PauseBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PauseBoxOutline: ImageVector? = null
