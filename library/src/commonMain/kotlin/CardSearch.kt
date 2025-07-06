package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CardSearch: ImageVector
    get() {
        if (_CardSearch != null) {
            return _CardSearch!!
        }
        _CardSearch = ImageVector.Builder(
            name = "CardSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 9f)
                curveTo(10.12f, 9f, 9f, 10.12f, 9f, 11.5f)
                reflectiveCurveTo(10.12f, 14f, 11.5f, 14f)
                reflectiveCurveTo(14f, 12.88f, 14f, 11.5f)
                reflectiveCurveTo(12.88f, 9f, 11.5f, 9f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                moveTo(16.79f, 18.21f)
                lineTo(13.88f, 15.3f)
                curveTo(13.19f, 15.74f, 12.37f, 16f, 11.5f, 16f)
                curveTo(9f, 16f, 7f, 14f, 7f, 11.5f)
                reflectiveCurveTo(9f, 7f, 11.5f, 7f)
                reflectiveCurveTo(16f, 9f, 16f, 11.5f)
                curveTo(16f, 12.38f, 15.74f, 13.19f, 15.3f, 13.89f)
                lineTo(18.21f, 16.79f)
                lineTo(16.79f, 18.21f)
                close()
            }
        }.build()

        return _CardSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CardSearch: ImageVector? = null
