package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationArrayOutline: ImageVector
    get() {
        if (_ApplicationArrayOutline != null) {
            return _ApplicationArrayOutline!!
        }
        _ApplicationArrayOutline = ImageVector.Builder(
            name = "ApplicationArrayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
                moveTo(21f, 20f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                moveTo(6f, 8f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(8f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                moveTo(16f, 16f)
                horizontalLineTo(14f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
            }
        }.build()

        return _ApplicationArrayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationArrayOutline: ImageVector? = null
