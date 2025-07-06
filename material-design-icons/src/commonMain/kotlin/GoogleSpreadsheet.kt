package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GoogleSpreadsheet: ImageVector
    get() {
        if (_GoogleSpreadsheet != null) {
            return _GoogleSpreadsheet!!
        }
        _GoogleSpreadsheet = ImageVector.Builder(
            name = "GoogleSpreadsheet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 11f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                curveTo(19.5f, 3f, 20f, 3.2f, 20.39f, 3.61f)
                curveTo(20.8f, 4f, 21f, 4.5f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 19.5f, 20.8f, 20f, 20.39f, 20.39f)
                curveTo(20f, 20.8f, 19.5f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.5f, 21f, 4f, 20.8f, 3.61f, 20.39f)
                curveTo(3.2f, 20f, 3f, 19.5f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 4.5f, 3.2f, 4f, 3.61f, 3.61f)
                curveTo(4f, 3.2f, 4.5f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _GoogleSpreadsheet!!
    }

@Suppress("ObjectPropertyName")
private var _GoogleSpreadsheet: ImageVector? = null
