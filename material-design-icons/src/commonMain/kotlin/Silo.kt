package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Silo: ImageVector
    get() {
        if (_Silo != null) {
            return _Silo!!
        }
        _Silo = ImageVector.Builder(
            name = "Silo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 7.8f)
                curveTo(14.6f, 4.5f, 11.8f, 2f, 8.5f, 2f)
                curveTo(6.8f, 2f, 5.1f, 2.7f, 3.9f, 3.9f)
                reflectiveCurveTo(2f, 6.8f, 2f, 8.5f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(9.8f)
                lineTo(18f, 11.6f)
                verticalLineTo(22f)
                horizontalLineTo(20f)
                verticalLineTo(12.8f)
                lineTo(22f, 14f)
                verticalLineTo(12f)
                lineTo(15f, 7.8f)
                moveTo(11f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                moveTo(11f, 16f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(11f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                moveTo(4.3f, 7f)
                curveTo(4.9f, 5.2f, 6.6f, 4f, 8.5f, 4f)
                reflectiveCurveTo(12.1f, 5.2f, 12.7f, 7f)
                horizontalLineTo(4.3f)
                close()
            }
        }.build()

        return _Silo!!
    }

@Suppress("ObjectPropertyName")
private var _Silo: ImageVector? = null
