package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FleurDeLis: ImageVector
    get() {
        if (_FleurDeLis != null) {
            return _FleurDeLis!!
        }
        _FleurDeLis = ImageVector.Builder(
            name = "FleurDeLis",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                reflectiveCurveTo(9f, 4f, 9f, 7f)
                reflectiveCurveTo(11f, 12f, 11f, 16f)
                horizontalLineTo(10f)
                reflectiveCurveTo(10f, 14f, 9f, 12f)
                curveTo(7f, 8f, 3f, 10f, 3f, 13f)
                reflectiveCurveTo(5f, 16f, 5f, 16f)
                curveTo(5f, 13f, 8.5f, 13f, 8.5f, 16f)
                horizontalLineTo(7f)
                verticalLineTo(18f)
                horizontalLineTo(10.5f)
                lineTo(9f, 20f)
                reflectiveCurveTo(10f, 21f, 11f, 20f)
                lineTo(12f, 22f)
                lineTo(13f, 20f)
                curveTo(14f, 21f, 15f, 20f, 15f, 20f)
                lineTo(13.5f, 18f)
                horizontalLineTo(17f)
                verticalLineTo(16f)
                horizontalLineTo(15.5f)
                curveTo(15.5f, 13f, 19f, 13f, 19f, 16f)
                curveTo(19f, 16f, 21f, 16f, 21f, 13f)
                reflectiveCurveTo(17f, 8f, 15f, 12f)
                curveTo(14f, 14f, 14f, 16f, 14f, 16f)
                horizontalLineTo(13f)
                curveTo(13f, 12f, 15f, 10f, 15f, 7f)
                reflectiveCurveTo(12f, 2f, 12f, 2f)
                close()
            }
        }.build()

        return _FleurDeLis!!
    }

@Suppress("ObjectPropertyName")
private var _FleurDeLis: ImageVector? = null
