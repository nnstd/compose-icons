package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Toslink: ImageVector
    get() {
        if (_Toslink != null) {
            return _Toslink!!
        }
        _Toslink = ImageVector.Builder(
            name = "Toslink",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 10f)
                verticalLineTo(7f)
                lineTo(17f, 4f)
                horizontalLineTo(7f)
                lineTo(4f, 7f)
                verticalLineTo(10f)
                curveTo(2.9f, 10f, 2f, 10.9f, 2f, 12f)
                reflectiveCurveTo(2.9f, 14f, 4f, 14f)
                verticalLineTo(18f)
                curveTo(4f, 19.1f, 4.9f, 20f, 6f, 20f)
                horizontalLineTo(18f)
                curveTo(19.1f, 20f, 20f, 19.1f, 20f, 18f)
                verticalLineTo(14f)
                curveTo(21.11f, 14f, 22f, 13.11f, 22f, 12f)
                reflectiveCurveTo(21.11f, 10f, 20f, 10f)
                moveTo(12f, 16f)
                curveTo(9.79f, 16f, 8f, 14.21f, 8f, 12f)
                reflectiveCurveTo(9.79f, 8f, 12f, 8f)
                reflectiveCurveTo(16f, 9.79f, 16f, 12f)
                reflectiveCurveTo(14.21f, 16f, 12f, 16f)
                moveTo(14f, 12f)
                curveTo(14f, 13.11f, 13.11f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.11f, 10f, 12f)
                reflectiveCurveTo(10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                close()
            }
        }.build()

        return _Toslink!!
    }

@Suppress("ObjectPropertyName")
private var _Toslink: ImageVector? = null
