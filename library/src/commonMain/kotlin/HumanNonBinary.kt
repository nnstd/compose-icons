package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanNonBinary: ImageVector
    get() {
        if (_HumanNonBinary != null) {
            return _HumanNonBinary!!
        }
        _HumanNonBinary = ImageVector.Builder(
            name = "HumanNonBinary",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(13.11f, 2f, 14f, 2.9f, 14f, 4f)
                reflectiveCurveTo(13.11f, 6f, 12f, 6f)
                reflectiveCurveTo(10f, 5.11f, 10f, 4f)
                reflectiveCurveTo(10.9f, 2f, 12f, 2f)
                moveTo(13.91f, 8.41f)
                curveTo(13.66f, 7.59f, 12.9f, 7f, 12f, 7f)
                horizontalLineTo(10.5f)
                curveTo(9.4f, 7f, 8.5f, 7.9f, 8.5f, 9f)
                verticalLineTo(14.5f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                horizontalLineTo(13.5f)
                verticalLineTo(16f)
                horizontalLineTo(16.5f)
                lineTo(13.91f, 8.41f)
                close()
            }
        }.build()

        return _HumanNonBinary!!
    }

@Suppress("ObjectPropertyName")
private var _HumanNonBinary: ImageVector? = null
