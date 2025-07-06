package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ApplicationImport: ImageVector
    get() {
        if (_ApplicationImport != null) {
            return _ApplicationImport!!
        }
        _ApplicationImport = ImageVector.Builder(
            name = "ApplicationImport",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                horizontalLineTo(10.8f)
                lineTo(8.3f, 9.5f)
                lineTo(9.7f, 8.1f)
                lineTo(14.6f, 13f)
                lineTo(9.7f, 17.9f)
                lineTo(8.3f, 16.5f)
                lineTo(10.8f, 14f)
                horizontalLineTo(1f)
                verticalLineTo(12f)
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveTo(1.9f, 2f, 1f, 2.9f, 1f, 4f)
                verticalLineTo(10.1f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineTo(16f)
                horizontalLineTo(1f)
                verticalLineTo(20f)
                curveTo(1f, 21.1f, 1.9f, 22f, 3f, 22f)
                horizontalLineTo(21f)
                curveTo(22.1f, 22f, 23f, 21.1f, 23f, 20f)
                verticalLineTo(4f)
                curveTo(23f, 2.9f, 22.1f, 2f, 21f, 2f)
            }
        }.build()

        return _ApplicationImport!!
    }

@Suppress("ObjectPropertyName")
private var _ApplicationImport: ImageVector? = null
