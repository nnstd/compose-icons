package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RestoreAlert: ImageVector
    get() {
        if (_RestoreAlert != null) {
            return _RestoreAlert!!
        }
        _RestoreAlert = ImageVector.Builder(
            name = "RestoreAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 3f)
                curveTo(8f, 3f, 4f, 7f, 4f, 12f)
                horizontalLineTo(1f)
                lineTo(4.9f, 15.9f)
                lineTo(5f, 16f)
                lineTo(9f, 12f)
                horizontalLineTo(6f)
                curveTo(6f, 8.1f, 9.1f, 5f, 13f, 5f)
                reflectiveCurveTo(20f, 8.1f, 20f, 12f)
                reflectiveCurveTo(16.9f, 19f, 13f, 19f)
                curveTo(11.1f, 19f, 9.3f, 18.2f, 8.1f, 16.9f)
                lineTo(6.7f, 18.3f)
                curveTo(8.3f, 20f, 10.5f, 21f, 13f, 21f)
                curveTo(18f, 21f, 22f, 17f, 22f, 12f)
                reflectiveCurveTo(18f, 3f, 13f, 3f)
                moveTo(12f, 15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                moveTo(12f, 7f)
                horizontalLineTo(14f)
                verticalLineTo(13f)
                horizontalLineTo(12f)
                verticalLineTo(7f)
            }
        }.build()

        return _RestoreAlert!!
    }

@Suppress("ObjectPropertyName")
private var _RestoreAlert: ImageVector? = null
