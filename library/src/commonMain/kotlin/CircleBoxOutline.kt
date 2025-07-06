package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleBoxOutline: ImageVector
    get() {
        if (_CircleBoxOutline != null) {
            return _CircleBoxOutline!!
        }
        _CircleBoxOutline = ImageVector.Builder(
            name = "CircleBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(12f, 8f)
                curveTo(9.79f, 8f, 8f, 9.79f, 8f, 12f)
                reflectiveCurveTo(9.79f, 16f, 12f, 16f)
                reflectiveCurveTo(16f, 14.21f, 16f, 12f)
                reflectiveCurveTo(14.21f, 8f, 12f, 8f)
                close()
            }
        }.build()

        return _CircleBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CircleBoxOutline: ImageVector? = null
